package dev.itsu.bpcore.element.type

class ListType(private val value: MutableList<Type>) : IListType {

    constructor() : this(mutableListOf())

    override fun getValue(): MutableList<Type> {
        return value
    }

}