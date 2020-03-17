package dev.itsu.bpcore.element.type

interface IListType : Type {

    fun getList(): MutableList<Type>

}