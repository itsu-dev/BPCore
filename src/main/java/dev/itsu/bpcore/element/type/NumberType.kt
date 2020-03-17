package dev.itsu.bpcore.element.type

class NumberType(private val value: Double) : INumberType {

    private constructor() : this(0.0)

    override fun getNumber(): Double {
        return value
    }

    override fun get(): Any {
        return value
    }

    fun plus(value: INumberType): NumberType {
        return NumberType(this.value + value.getNumber())
    }

    fun minus(value: INumberType): NumberType {
        return NumberType(this.value - value.getNumber())
    }

    fun multiply(value: INumberType): NumberType {
        return NumberType(this.value * value.getNumber())
    }

    fun divide(value: INumberType): NumberType {
        if (value.getNumber() == 0.0) return NumberType()
        return NumberType(this.value / value.getNumber())
    }

    fun toStringType(): StringType {
        return StringType(value.toString())
    }

}