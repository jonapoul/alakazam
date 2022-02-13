package com.jonapoul.extensions.data

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class TimeUnitsTest {
    @Test
    fun `Comparable Millis`() {
        assertTrue(3.ms > 2.ms)
        assertFalse(3.ms > 3.ms)
        assertFalse(1.ms > 3.ms)

        assertFalse(3.ms < 2.ms)
        assertFalse(3.ms < 3.ms)
        assertTrue(1.ms < 3.ms)
    }

    @Test
    fun `Comparable Seconds`() {
        assertTrue(3.sec > 2.sec)
        assertFalse(3.sec > 3.sec)
        assertFalse(1.sec > 3.sec)

        assertFalse(3.sec < 2.sec)
        assertFalse(3.sec < 3.sec)
        assertTrue(1.sec < 3.sec)
    }

    @Test
    fun `Comparable Minutes`() {
        assertTrue(3.min > 2.min)
        assertFalse(3.min > 3.min)
        assertFalse(1.min > 3.min)

        assertFalse(3.min < 2.min)
        assertFalse(3.min < 3.min)
        assertTrue(1.min < 3.min)
    }

    @Test
    fun `Comparable Hours`() {
        assertTrue(3.hr > 2.hr)
        assertFalse(3.hr > 3.hr)
        assertFalse(1.hr > 3.hr)

        assertFalse(3.hr < 2.hr)
        assertFalse(3.hr < 3.hr)
        assertTrue(1.hr < 3.hr)
    }

    @Test
    fun `Comparable Days`() {
        assertTrue(3.days > 2.days)
        assertFalse(3.days > 3.days)
        assertFalse(1.days > 3.days)

        assertFalse(3.days < 2.days)
        assertFalse(3.days < 3.days)
        assertTrue(1.days < 3.days)
    }
}
