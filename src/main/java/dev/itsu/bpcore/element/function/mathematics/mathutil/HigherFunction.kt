package dev.itsu.bpcore.element.function.mathematics.mathutil

import dev.itsu.bpcore.element.function.AbstractFunction
import dev.itsu.bpcore.element.type.INumberType
import dev.itsu.bpcore.element.type.NumberType
import dev.itsu.bpcore.element.type.Type

class HigherFunction : AbstractFunction() {

    override fun getName(): String {
        return "higher"
    }

    override fun doProcess(vararg args: Type): Type {
        if (args.size != 2 || args[0] !is INumberType || args[1] !is INumberType) {

        }
        val arg = args[0] as INumberType
        val arg1 = args[1] as INumberType
        return NumberType(arg.getNumber().coerceAtLeast(arg1.getNumber()))
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