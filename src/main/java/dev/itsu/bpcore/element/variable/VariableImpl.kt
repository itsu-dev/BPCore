package dev.itsu.bpcore.element.variable

import dev.itsu.bpcore.element.type.StringType
import dev.itsu.bpcore.element.type.Type

abstract class VariableImpl(private val name: String) : IVariable {

    abstract override fun get(): Type

    abstract override fun set(value: Type)

    override fun getName(): String {
        return name
    }

    override fun getNameAsStringImpl(): StringType {
        return StringType(name)
    }

}