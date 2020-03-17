package dev.itsu.bpcore.element.type

import java.text.SimpleDateFormat
import java.util.Date

class DateType(private val value: Date) : IDateType {

    private constructor() : this(Date())

    override fun getDate(): Date {
        return value
    }

    override fun get(): Any {
        return value
    }

    fun getMilliTime(): NumberType {
        return NumberType(value.time.toDouble())
    }

    fun toStringType(): StringType {
        return StringType(SimpleDateFormat("y/MM/dd hh:mm:ss").format(value))
    }

}