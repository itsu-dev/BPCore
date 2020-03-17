package dev.itsu.bpcore.loader.util

import dev.itsu.bpcore.element.type.*

object ListTypeUtils {

    fun nativeToListType(list: List<Any>, clazz: Class<out Type>): ListType {
        return when (clazz) {
            StringType::class.java -> {
                val result = mutableListOf<StringType>()
                list.forEach {
                    result.add(StringType(it.toString()))
                }
                ListType(result)
            }

            NumberType::class.java -> {
                val result = mutableListOf<NumberType>()
                list.forEach {
                    result.add(NumberType(it.toString().toDouble()))
                }
                ListType(result)
            }

            BooleanType::class.java -> {
                val result = mutableListOf<BooleanType>()
                list.forEach {
                    result.add(BooleanType(it.toString().toBoolean()))
                }
                ListType(result)
            }

            else -> ListType()
        }
    }

}