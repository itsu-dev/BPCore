package dev.itsu.bpcore.element.function.mathematics.mathutil

import dev.itsu.bpcore.element.function.AbstractFunction
import dev.itsu.bpcore.element.type.INumberType
import dev.itsu.bpcore.element.type.NumberType
import dev.itsu.bpcore.element.type.Type

class AbsFunction : AbstractFunction() {

    override fun getName(): String {
        return "abs"
    }

    override fun doProcess(vararg args: Type): Type {
        if (args[0] !is INumberType) {

        }
        val arg = args[0] as INumberType
        return NumberType(kotlin.math.abs(arg.getNumber()))
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