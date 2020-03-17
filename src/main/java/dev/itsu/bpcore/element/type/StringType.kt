package dev.itsu.bpcore.element.type

class StringType(private val value: String) : IStringType {

    private constructor() : this("")

    override fun getString(): String {
        return value
    }

    override fun get(): Any {
        return value
    }

    fun subString(start: INumberType): StringType {
        val s = start.getNumber().toInt()
        return StringType(value.substring(s))
    }

    fun subString(start: INumberType, end: INumberType): StringType {
        val s = start.getNumber().toInt()
        val e = start.getNumber().toInt()
        if (value.length < e) return this
        return StringType(value.substring(s, e))
    }

    fun add(value: StringType): StringType {
        return StringType(this.value + value.getString())
    }

    fun length(): NumberType {
        return NumberType(value.length.toDouble())
    }

    fun equals(value: StringType): BooleanType {
        return BooleanType(this.value == value.getString())
    }

}