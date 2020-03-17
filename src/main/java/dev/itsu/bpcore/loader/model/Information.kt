package dev.itsu.bpcore.loader.model

data class Information(
        val name: String,
        val version: String,
        val author: String,
        val description: String?,
        val url: String?
) {
    override fun toString(): String {
        return "Information(name='$name', version='$version', author='$author', description=$description, url=$url)"
    }
}

