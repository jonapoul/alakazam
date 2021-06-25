package com.jonapoul.extensions.datetime

/**
 * Simple class to help with mocking calls to system time, since mocking
 * the [System] class will likely lead to wacky behaviour.
 */
object Time {
    /**
     * Returns the current system time in milliseconds since Unix epoch.
     */
    fun now(): Long = System.currentTimeMillis()
}
