package dev.itsu.bpcore.element.function.system

import dev.itsu.bpcore.element.function.AbstractFunction
import dev.itsu.bpcore.element.type.IVoidType
import dev.itsu.bpcore.element.type.StringType
import dev.itsu.bpcore.element.type.Type
import dev.itsu.bpcore.element.type.VoidType

class PrintFunction : AbstractFunction() {

    override fun getName(): String {
        return "print"
    }

    override fun doProcess(vararg args: Type): Type {
        println(args[0].get().toString())
        return VoidType()
    }

    override fun getResultType(): Class<out Type> {
        return IVoidType::class.java
    }

    override fun getArguments(): Map<Int, Class<out Type>> {
        return mapOf(
                Pair(1, Type::class.java)
        )
    }

}