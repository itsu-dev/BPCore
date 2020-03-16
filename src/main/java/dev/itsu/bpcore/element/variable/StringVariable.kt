package dev.itsu.bpcore.element.variable

import dev.itsu.bpcore.element.type.BooleanType
import dev.itsu.bpcore.element.type.IStringType
import dev.itsu.bpcore.element.type.StringType
import dev.itsu.bpcore.element.type.Type

class StringVariable(name: String, private var value: StringType) : VariableImpl(name), IStringType {

    constructor(name: String) : this(name, StringType(""))

    override fun get(): Type {
        return value
    }

    override fun set(value: Type) {
        this.value = value as StringType
    }

    override fun getValue(): String {
        return value.getValue()
    }

}