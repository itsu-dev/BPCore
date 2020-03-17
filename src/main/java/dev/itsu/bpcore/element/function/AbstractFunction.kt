package dev.itsu.bpcore.element.function

import dev.itsu.bpcore.element.type.Type

abstract class AbstractFunction : IFunction {

    abstract override fun getName(): String
    abstract override fun doProcess(vararg args: Type): Type
    abstract override fun getResultType(): Class<out Type>
    abstract override fun getArguments(): Map<Int, Class<out Type>>

    override fun getDescription(): String {
        return "This is a function."
    }

    override fun getSince(): String {
        return "1.0.0"
    }

    override fun getCategory(): String {
        return "Function"
    }

    override fun getText(): String {
        return ""
    }

}