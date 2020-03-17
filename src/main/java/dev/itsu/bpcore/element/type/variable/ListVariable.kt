package dev.itsu.bpcore.element.type.variable

import dev.itsu.bpcore.element.type.IListType
import dev.itsu.bpcore.element.type.ListType
import dev.itsu.bpcore.element.type.Type

class ListVariable(name: String, private var value: IListType) : VariableImpl(name), IListType {

    override fun get(): Type {
        return value
    }

    override fun set(value: Type) {
        this.value = value as ListType
    }

    override fun getList(): MutableList<Type> {
        return value.getList()
    }

}