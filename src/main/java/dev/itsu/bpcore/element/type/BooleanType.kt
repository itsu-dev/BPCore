package dev.itsu.bpcore.element.type

class BooleanType(private val value: Boolean) : IBooleanType {

    private constructor() : this(false)

    override fun getValue(): Boolean {
        return value
    }

}