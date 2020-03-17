package dev.itsu.bpcore.exception.xml

import java.lang.RuntimeException

class InvalidVariableTypeException(variableName: String, typeClass: Class<*>)
    : RuntimeException("The variable: $variableName specified the type \"${typeClass.name}\", but the type of init value is not required type by the variable.")