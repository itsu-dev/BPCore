package dev.itsu.bpcore.element.type.variable

import dev.itsu.bpcore.element.type.INumberType
import dev.itsu.bpcore.element.type.NumberType
import dev.itsu.bpcore.element.type.Type

class NumberVariable(name: String, private var value: INumberType) : VariableImpl(name), INumberType {

    constructor(name: String) : this(name, NumberType(0.0))

    override fun get(): Type {
        return value
    }

    override fun set(value: Type) {
        this.value = value as NumberType
    }

    override fun getNumber(): Double {
        return value.getNumber()
    }

}