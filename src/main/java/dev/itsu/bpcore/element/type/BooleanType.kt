package dev.itsu.bpcore.element.type

class BooleanType(private val value: Boolean) : IBooleanType {

    private constructor() : this(false)

    override fun getBoolean(): Boolean {
        return value
    }

    override fun get(): Any {
        return value
    }
}