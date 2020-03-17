package dev.itsu.bpcore.element.type.variable

import dev.itsu.bpcore.element.type.DateType
import dev.itsu.bpcore.element.type.IDateType
import dev.itsu.bpcore.element.type.Type
import java.util.Date

class DateVariable(name: String, private var value: IDateType) : VariableImpl(name), IDateType {

    constructor(name: String) : this(name, DateType(Date()))

    override fun get(): Type {
        return value
    }

    override fun set(value: Type) {
        this.value = value as IDateType
    }

    override fun getDate(): Date {
        return value.getDate()
    }
}