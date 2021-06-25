package com.jonapoul.extensions.datetime

import java.util.*

/**
 * Gets Year directly from [Calendar] object
 */
inline val Calendar.year: Int
    get() = get(Calendar.YEAR)

/**
 * Gets value of DayOfMonth from [Calendar] object
 */
inline val Calendar.dayOfMonth: Int
    get() = get(Calendar.DAY_OF_MONTH)

/**
 * Gets value of Month from [Calendar] object
 */
inline val Calendar.month: Int
    get() = get(Calendar.MONTH)

/**
 * Gets value of Hour from [Calendar] object
 */
inline val Calendar.hour: Int
    get() = get(Calendar.HOUR)

/**
 * Gets value of HourOfDay from [Calendar] object
 */
inline val Calendar.hourOfDay: Int
    get() = get(Calendar.HOUR_OF_DAY)

/**
 * Gets value of Minute from [Calendar] object
 */
inline val Calendar.minute: Int
    get() = get(Calendar.MINUTE)

/**
 * Gets value of Second from [Calendar] object
 */
inline val Calendar.second: Int
    get() = get(Calendar.SECOND)
