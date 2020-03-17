package dev.itsu.bpcore.lang

import java.net.URL
import java.nio.charset.StandardCharsets
import java.util.*

object BaseLang {

    private val languages = Properties()
    private val paths = mutableListOf<URL>()

    fun load(lang: String) {
        val url = BaseLang.javaClass.classLoader.getResource("lang/$lang.properties")
        add(url ?: BaseLang.javaClass.classLoader.getResource("lang/jpn.properties")!!)
    }

    fun add(url: URL) {
        paths.add(url)
        
        val properties = Properties()
        properties.load(url.openStream().bufferedReader(StandardCharsets.UTF_8))
        properties.forEach {
            languages.setProperty(it.key.toString(), it.value.toString())
        }
    }    

    fun getLang(key: String, vararg args: Any): String {
        var result = (languages[key] ?: return "null").toString()
        args.forEachIndexed { index, s ->
            result = result.replace("%${index + 1}", s.toString())
        }
        return result
    }

}