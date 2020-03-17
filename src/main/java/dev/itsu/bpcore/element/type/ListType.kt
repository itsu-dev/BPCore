package dev.itsu.bpcore.element.type

class ListType(private val value: List<Type>) : IListType {

    constructor() : this(mutableListOf())

    override fun getList(): List<Type> {
        return value
    }

    override fun get(): Any {
        return value
    }
}