package dev.itsu.bpcore.element.type

class NumberType(private val value: Double) : INumberType {

    private constructor() : this(0.0)

    override fun getValue(): Double {
        return value
    }

    fun plus(value: INumberType): NumberType {
        return NumberType(this.value + value.getValue())
    }

    fun minus(value: INumberType): NumberType {
        return NumberType(this.value - value.getValue())
    }

    fun multiply(value: INumberType): NumberType {
        return NumberType(this.value * value.getValue())
    }

    fun divide(value: INumberType): NumberType {
        if (value.getValue() == 0.0) return NumberType()
        return NumberType(this.value / value.getValue())
    }

    fun toStringType(): StringType {
        return StringType(value.toString())
    }

}