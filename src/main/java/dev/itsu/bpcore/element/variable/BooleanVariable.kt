package dev.itsu.bpcore.element.variable

import dev.itsu.bpcore.element.type.BooleanType
import dev.itsu.bpcore.element.type.IBooleanType
import dev.itsu.bpcore.element.type.Type

class BooleanVariable(name: String, private var value: BooleanType) : VariableImpl(name), IBooleanType {

    constructor(name: String) : this(name, BooleanType(false))

    override fun get(): Type {
        return value
    }

    override fun set(value: Type) {
        this.value = value as BooleanType
    }

    override fun getValue(): Boolean {
        return value.getValue()
    }

}