package dev.itsu.bpcore.element.function.mathematics.random

import dev.itsu.bpcore.element.function.AbstractFunction
import dev.itsu.bpcore.element.type.NumberType
import dev.itsu.bpcore.element.type.Type
import kotlin.random.Random

class RandomFunction : AbstractFunction() {

    override fun getName(): String {
        return "random"
    }

    override fun doProcess(vararg args: Type): Type {
        return NumberType(Random.nextDouble())
    }

    override fun getResultType(): Class<out Type> {
        return NumberType::class.java
    }

    override fun getArguments(): Map<Int, Class<out Type>> {
        return mapOf()
    }

}