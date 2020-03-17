package dev.itsu.bpcore.element.function

import dev.itsu.bpcore.element.IElement
import dev.itsu.bpcore.element.type.Type

interface IFunction : IElement {

    fun getName(): String
    fun getResultType(): Class<out Type>
    fun getArguments(): Map<Int, Class<out Type>>
    fun doProcess(vararg args: Type): Type

}