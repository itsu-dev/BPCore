package dev.itsu.bpcore.loader.model

import dev.itsu.bpcore.element.type.variable.IVariable

data class Project(
        val information: Information,
        val processes: MutableList<Process>,
        val variables: Map<String, IVariable>
) {
    override fun toString(): String {
        return "Project(information=$information, closures=$processes, variables=$variables)"
    }
}