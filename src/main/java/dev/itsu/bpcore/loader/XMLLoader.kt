package dev.itsu.bpcore.loader

import dev.itsu.bpcore.element.type.*
import dev.itsu.bpcore.element.type.variable.IVariable
import dev.itsu.bpcore.element.type.variable.VariableImpl
import dev.itsu.bpcore.exception.loader.XMLLoadException
import dev.itsu.bpcore.exception.xml.DuplicateVariableException
import dev.itsu.bpcore.exception.xml.InvalidVariableTypeException
import dev.itsu.bpcore.loader.model.Information
import dev.itsu.bpcore.loader.model.Project
import dev.itsu.bpcore.loader.util.ListTypeUtils
import org.dom4j.Node
import org.dom4j.io.SAXReader
import java.io.File
import java.io.FileNotFoundException
import java.io.InputStream
import java.net.URL

fun main() {
    println(XMLLoader.load(XMLLoader.javaClass.classLoader.getResourceAsStream("Sample.xml")))
}

object XMLLoader {

    fun load(path: String): Project {
        return load(File(path))
    }

    fun load(file: File): Project {
        if (!file.exists()) throw FileNotFoundException(file.absolutePath)
        return load(file.inputStream())
    }

    fun load(url: URL): Project {
        return load(url.openStream())
    }

    fun load(inputStream: InputStream?): Project {
        if (inputStream == null) {
            throw NullPointerException()
        }

        val document = SAXReader().read(inputStream)

        val information = loadInformation(document.selectNodes("/root/information/*"))
        val variables = loadVariables(document.selectNodes("/root/variables/variable"))

        return Project(information, mutableListOf(), variables)
    }

    private fun loadInformation(nodes: List<Node>): Information{
        var name: String? = null
        var version: String? = null
        var author: String? = null
        var description: String? = null
        var url: String? = null

        nodes.forEach {
            when (it.name) {
                "name" -> name = it.stringValue
                "version" -> version = it.stringValue
                "author" -> author = it.stringValue
                "description" -> description = it.stringValue
                "url" -> url = it.stringValue
            }
        }

        if (name == null || version == null || author == null)
            throw XMLLoadException("name and version and author in /root/information must not be null!")

        return Information(name!!, version!!, author!!, description, url)
    }

    private fun loadVariables(nodes: List<Node>): Map<String, IVariable> {
        val result = mutableMapOf<String, VariableImpl>()

        nodes.forEach {
            if (it.name == "variable") {
                var name: String? = null
                var init: String? = null
                var type: String? = null

                it.selectNodes("./*").forEach {
                    when (it.name) {
                        "name" -> name = it.stringValue
                        "init" -> init = it.stringValue
                        "type" -> type = it.stringValue
                    }
                }

                if (name == null || type == null)
                    throw XMLLoadException("name and type in /root/variables/variable must not be null!")

                val variable = Class.forName(type).getConstructor(String::class.java).newInstance(name) as VariableImpl

                if (init != null) {
                    val initType = getInitType(init!!)
                    try {
                        variable.set(initType)
                    } catch (e: Exception) {
                        throw InvalidVariableTypeException(name!!, initType::class.java)
                    }
                }

                if (result.containsKey(name!!))
                    throw DuplicateVariableException(name!!)

                result[name!!] = variable
            }
        }

        return result
    }

    private fun getInitType(init: String): Type {
        return when {
            init.startsWith("\"") && init.endsWith("\"") -> StringType(init.substring(1, init.length - 1))
            init.startsWith("\\\\[") && init.endsWith("\\\\]") -> {
                val data = init.substring(1, init.length - 1).split(", ")
                if (data.isNotEmpty()) {
                    ListTypeUtils.nativeToListType(data, getInitType(data[0])::class.java)
                } else {
                    ListType()
                }
            }
            init == "true" || init == "false" -> BooleanType(init.toBoolean())
            init.toDoubleOrNull() != null -> NumberType(init.toDouble())
            else -> StringType(init)
        }
    }

}