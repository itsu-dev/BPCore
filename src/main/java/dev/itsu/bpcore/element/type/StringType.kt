package dev.itsu.bpcore.element.type

class StringType(private val value: String) : IStringType {

    private constructor() : this("")

    override fun getValue(): String {
        return value
    }

    fun subString(start: INumberType): StringType {
        val s = start.getValue().toInt()
        return StringType(value.substring(s))
    }

    fun subString(start: INumberType, end: INumberType): StringType {
        val s = start.getValue().toInt()
        val e = start.getValue().toInt()
        if (value.length < e) return this
        return StringType(value.substring(s, e))
    }

    fun add(value: StringType): StringType {
        return StringType(this.value + value.getValue())
    }

    fun length(): NumberType {
        return NumberType(value.length.toDouble())
    }

    fun equals(value: StringType): BooleanType {
        return BooleanType(this.value == value.getValue())
    }

}