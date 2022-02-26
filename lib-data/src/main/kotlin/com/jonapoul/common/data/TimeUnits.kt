package com.jonapoul.common.data

private const val SECONDS_IN_MS = 1_000L
private const val MINUTES_IN_MS = SECONDS_IN_MS * 60L
private const val HOURS_IN_MS = MINUTES_IN_MS * 60L
private const val DAYS_IN_MS = HOURS_IN_MS * 24L

@JvmInline
value class Millis(val ms: Long) : Comparable<Millis> {
    override fun compareTo(other: Millis): Int = ms.compareTo(other.ms)
}

@JvmInline
value class Seconds(val seconds: Long) : Comparable<Seconds> {
    fun toMillis(): Millis = Millis(seconds * SECONDS_IN_MS)

    override fun compareTo(other: Seconds): Int = seconds.compareTo(other.seconds)
}

@JvmInline
value class Minutes(val minutes: Long) : Comparable<Minutes> {
    fun toMillis(): Millis = Millis(minutes * MINUTES_IN_MS)

    override fun compareTo(other: Minutes): Int = minutes.compareTo(other.minutes)
}

@JvmInline
value class Hours(val hours: Long) : Comparable<Hours> {
    fun toMillis(): Millis = Millis(hours * HOURS_IN_MS)

    override fun compareTo(other: Hours): Int = hours.compareTo(other.hours)
}

@JvmInline
value class Days(val days: Long) : Comparable<Days> {
    fun toMillis(): Millis = Millis(days * DAYS_IN_MS)

    override fun compareTo(other: Days): Int = days.compareTo(other.days)
}

inline val Long.ms
    get() = Millis(this)

inline val Int.ms
    get() = Millis(this.toLong())

inline val Long.sec
    get() = Seconds(this)

inline val Int.sec
    get() = Seconds(this.toLong())

inline val Long.min
    get() = Minutes(this)

inline val Int.min
    get() = Minutes(this.toLong())

inline val Long.hr
    get() = Hours(this)

inline val Int.hr
    get() = Hours(this.toLong())

inline val Long.days
    get() = Days(this)

inline val Int.days
    get() = Days(this.toLong())
