package dev.itsu.bpcore.element.function.date

import dev.itsu.bpcore.element.function.AbstractFunction
import dev.itsu.bpcore.element.type.NumberType
import dev.itsu.bpcore.element.type.Type

class GetCurrentMilliTimeFunction : AbstractFunction() {

    override fun getName(): String {
        return "getCurrentMilliTime"
    }

    override fun doProcess(vararg args: Type): Type {
        return NumberType(System.currentTimeMillis().toDouble())
    }

    override fun getResultType(): Class<out Type> {
        return NumberType::class.java
    }

    override fun getArguments(): Map<Int, Class<out Type>> {
        return mapOf()
    }

}