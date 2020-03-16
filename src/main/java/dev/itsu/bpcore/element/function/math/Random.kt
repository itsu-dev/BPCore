package dev.itsu.bpcore.element.function.math

import dev.itsu.bpcore.element.type.INumberType
import dev.itsu.bpcore.element.type.NumberType
import kotlin.random.Random

object Random {

    fun random() = NumberType(Random.nextDouble())

    fun random(until: INumberType) = NumberType(Random.nextDouble(until.getValue()))

    fun random(from: INumberType, until: INumberType) = NumberType(Random.nextDouble(from.getValue(), until.getValue()))

    fun randomBySeed(seed: INumberType) = NumberType(Random(seed.getValue().toLong()).nextDouble())

}