package dev.itsu.bpcore.element.function.mathematics.mathutil

import dev.itsu.bpcore.element.function.AbstractFunction
import dev.itsu.bpcore.element.type.NumberType
import dev.itsu.bpcore.element.type.Type

class PIFunction : AbstractFunction() {

    override fun getName(): String {
        return "pi"
    }

    override fun doProcess(vararg args: Type): Type {
        return NumberType(kotlin.math.PI)
    }

    override fun getResultType(): Class<out Type> {
        return NumberType::class.java
    }

    override fun getArguments(): Map<Int, Class<out Type>> {
        return mapOf()
    }

}