package dev.itsu.bpcore.element.type.variable

import dev.itsu.bpcore.element.type.StringType
import dev.itsu.bpcore.element.type.Type

interface IVariable {

    fun get(): Type
    fun set(value: Type)
    fun getName(): String
    fun getNameAsStringImpl(): StringType

}