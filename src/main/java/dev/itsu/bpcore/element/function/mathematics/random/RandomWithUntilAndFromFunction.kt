package dev.itsu.bpcore.element.function.mathematics.random

import dev.itsu.bpcore.element.function.AbstractFunction
import dev.itsu.bpcore.element.type.INumberType
import dev.itsu.bpcore.element.type.NumberType
import dev.itsu.bpcore.element.type.Type
import kotlin.random.Random

class RandomWithUntilAndFromFunction : AbstractFunction() {

    override fun getName(): String {
        return "randomWithUntilAndFrom"
    }

    override fun doProcess(vararg args: Type): Type {
        if (args[0] !is INumberType || args[1] !is INumberType) {

        }
        return NumberType(Random.nextDouble((args[0] as INumberType).getNumber(), (args[1] as INumberType).getNumber()))
    }

    override fun getResultType(): Class<out Type> {
        return NumberType::class.java
    }

    override fun getArguments(): Map<Int, Class<out Type>> {
        return mapOf(
                Pair(1, INumberType::class.java),
                Pair(2, INumberType::class.java)
        )
    }

}