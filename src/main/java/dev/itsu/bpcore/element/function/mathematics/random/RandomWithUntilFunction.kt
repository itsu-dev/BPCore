package dev.itsu.bpcore.element.function.mathematics.random

import dev.itsu.bpcore.element.function.AbstractFunction
import dev.itsu.bpcore.element.type.INumberType
import dev.itsu.bpcore.element.type.NumberType
import dev.itsu.bpcore.element.type.Type
import kotlin.random.Random

class RandomWithUntilFunction : AbstractFunction() {

    override fun getName(): String {
        return "randomWithUntil"
    }

    override fun doProcess(vararg args: Type): Type {
        if (args[0] !is NumberType) {

        }
        return NumberType(Random.nextDouble((args[0] as NumberType).getNumber()))
    }

    override fun getResultType(): Class<out Type> {
        return NumberType::class.java
    }

    override fun getArguments(): Map<Int, Class<out Type>> {
        return mapOf(
                Pair(1, INumberType::class.java)
        )
    }

}