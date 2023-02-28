@file:Suppress("TooGenericExceptionThrown")

package com.jonapoul.common.core

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ThrowsSpecificTest {
    private class CustomSubClassException : IllegalStateException()

    @Test
    fun `Throws specific valid 1`() {
        assertTrue(
            throwsSpecific<IllegalStateException> { throw IllegalStateException() }
        )
    }

    @Test
    fun `Throws specific valid 2`() {
        assertTrue(
            throwsSpecific<Exception> { throw Exception() }
        )
    }

    @Test
    fun `Throws specific valid 3`() {
        assertTrue(
            throwsSpecific<IllegalStateException> { throw CustomSubClassException() }
        )
    }

    @Test
    fun `Throws specific invalid 1`() {
        assertFalse(
            throwsSpecific<IllegalStateException> { throw ClassNotFoundException() }
        )
    }

    @Test
    fun `Throws specific invalid 2`() {
        assertFalse(
            throwsSpecific<Error> { throw Exception() }
        )
    }

    @Test
    fun `Throws specific invalid 3`() {
        assertFalse(
            throwsSpecific<IllegalStateException> { throw Exception() }
        )
    }

    @Test
    fun `Doesn't throw`() {
        assertFalse(
            throwsSpecific<IllegalStateException> {
                1 + 1
            }
        )
    }
}
