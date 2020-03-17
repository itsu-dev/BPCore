package dev.itsu.bpcore.loader.model

import dev.itsu.bpcore.element.type.variable.IVariable

data class Project(
        val information: Information,
        val closures: MutableList<Closure>,
        val variables: Map<String, IVariable>
) {
    override fun toString(): String {
        return "Project(information=$information, closures=$closures, variables=$variables)"
    }
}