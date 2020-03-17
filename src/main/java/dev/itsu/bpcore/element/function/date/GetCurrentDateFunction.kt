package dev.itsu.bpcore.element.function.date

import dev.itsu.bpcore.element.function.AbstractFunction
import dev.itsu.bpcore.element.type.DateType
import dev.itsu.bpcore.element.type.Type
import java.util.*

class GetCurrentDateFunction : AbstractFunction() {

    override fun getName(): String {
        return "getCurrentDate"
    }

    override fun doProcess(vararg args: Type): Type {
        return DateType(Date())
    }

    override fun getResultType(): Class<out Type> {
        return DateType::class.java
    }

    override fun getArguments(): Map<Int, Class<out Type>> {
        return mapOf()
    }

}