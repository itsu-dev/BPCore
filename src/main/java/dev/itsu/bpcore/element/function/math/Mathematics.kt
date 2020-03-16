package dev.itsu.bpcore.element.function.math

import dev.itsu.bpcore.element.type.BooleanType
import dev.itsu.bpcore.element.type.INumberType
import dev.itsu.bpcore.element.type.NumberType
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.random.Random

object Mathematics {

    fun round(value: INumberType) = NumberType(value.getValue().roundToInt().toDouble())

    fun ceil(value: INumberType) = NumberType(kotlin.math.ceil(value.getValue()))

    fun sqrt(value: INumberType) = NumberType(kotlin.math.sqrt(value.getValue()))

    fun abs(value: INumberType) = NumberType(kotlin.math.abs(value.getValue()))

    fun pow(value: INumberType, time: INumberType) = NumberType(value.getValue().pow(time.getValue()))

    fun higher(value1: INumberType, value2: INumberType) = NumberType(value1.getValue().coerceAtLeast(value2.getValue()))

    fun lower(value1: INumberType, value2: INumberType) = NumberType(value1.getValue().coerceAtMost(value2.getValue()))

    // a < b
    fun lessThan(a: INumberType, b: INumberType) = BooleanType(a.getValue() < b.getValue())

    // a > b
    fun greaterThan(a: INumberType, b: INumberType) = BooleanType(a.getValue() > b.getValue())

    // a <= b
    fun lessThanOrEqual(a: INumberType, b: INumberType) = BooleanType(a.getValue() <= b.getValue())

    // a >= b
    fun greaterThanOrEqual(a: INumberType, b: INumberType) = BooleanType(a.getValue() >= b.getValue())

    fun equals(a: INumberType, b: INumberType) = BooleanType(a.getValue() == b.getValue())

}