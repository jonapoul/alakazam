package com.jonapoul.extensions.datetime

import android.os.Build
import android.text.format.DateUtils
import androidx.annotation.RequiresApi
import java.util.*

/**
 * Number of milliseconds between the two dates.
 */
fun Date.millisecondsSince(date: Date): Long = (time - date.time)

/**
 * Number of seconds between the two dates.
 */
fun Date.secondsSince(date: Date): Double = millisecondsSince(date) / 1000.0

/**
 * Number of minutes between the two dates.
 */
fun Date.minutesSince(date: Date): Double = secondsSince(date) / 60

/**
 * Number of hours between the two dates.
 */
fun Date.hoursSince(date: Date): Double = minutesSince(date) / 60

/**
 * Number of days between the two dates.
 */
fun Date.daysSince(date: Date): Double = hoursSince(date) / 24

/**
 * Number of weeks between the two dates.
 */
fun Date.weeksSince(date: Date): Double = daysSince(date) / 7

/**
 * Number of years between the two dates.
 */
fun Date.yearsSince(date: Date): Double = daysSince(date) / 365.25

/**
 * Returns a [Calendar] instance corresponding to this time.
 */
inline val Date.calendar: Calendar
    get() = Calendar.getInstance().apply { time = this@calendar }

/**
 * Returns true if the given [Date] is after the current system time, false otherwise.
 */
inline val Date.isFuture: Boolean
    get() = !Date().before(this)

/**
 * Returns true if the given [Date] is before the current system time, false otherwise.
 */
inline val Date.isPast: Boolean
    get() = Date().before(this)

/**
 * Returns true if the given [Date] is on the same day as the current system time, false otherwise.
 */
@RequiresApi(Build.VERSION_CODES.CUPCAKE)
fun Date.isToday(): Boolean = DateUtils.isToday(this.time)

/**
 * Returns true if the given [Date] is on the day before the current system time, false otherwise.
 */
@RequiresApi(Build.VERSION_CODES.CUPCAKE)
fun Date.isYesterday(): Boolean = DateUtils.isToday(this.time + DateUtils.DAY_IN_MILLIS)

/**
 * Returns true if the given [Date] is on the next day after current system time, false otherwise.
 */
@RequiresApi(Build.VERSION_CODES.CUPCAKE)
fun Date.isTomorrow(): Boolean = DateUtils.isToday(this.time - DateUtils.DAY_IN_MILLIS)
