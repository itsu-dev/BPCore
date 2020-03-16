package dev.itsu.bpcore.element.type

interface IListType : Type {

    fun getValue(): MutableList<Type>

}