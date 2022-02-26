@file:Suppress("TooGenericExceptionThrown")

package com.jonapoul.common.domain

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class ThrowsAnyExceptionTest {
    private class CustomSubClassException : IllegalStateException()

    @Test
    fun `Throws any exception valid 1`() {
        assertTrue(
            throwsAnyException { throw IllegalStateException() }
        )
    }

    @Test
    fun `Throws any exception valid 2`() {
        assertTrue(
            throwsAnyException { throw Exception() }
        )
    }

    @Test
    fun `Throws any exception valid 3`() {
        assertTrue(
            throwsAnyException { throw CustomSubClassException() }
        )
    }

    @Test(expected = Throwable::class)
    fun `Throws any exception invalid 1`() {
        throwsAnyException { throw Throwable() }
    }

    @Test(expected = Error::class)
    fun `Throws any exception invalid 2`() {
        throwsAnyException { throw Error() }
    }

    @Test(expected = AssertionError::class)
    fun `Throws any exception invalid 3`() {
        throwsAnyException { throw AssertionError() }
    }

    @Test
    fun `Doesn't throw`() {
        assertFalse(
            throwsAnyException {
                1 + 1
            }
        )
    }
}
