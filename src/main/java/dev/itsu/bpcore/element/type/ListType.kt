package dev.itsu.bpcore.element.type

class ListType(private val value: MutableList<Type>) : IListType {

    constructor() : this(mutableListOf())

    override fun getList(): MutableList<Type> {
        return value
    }

    override fun get(): Any {
        return value
    }
}