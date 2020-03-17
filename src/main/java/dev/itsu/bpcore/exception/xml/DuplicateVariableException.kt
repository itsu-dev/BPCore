package dev.itsu.bpcore.exception.xml

import java.lang.RuntimeException

class DuplicateVariableException(variableName: String)
    : RuntimeException("Variable: $variableName is already exists in the file.")