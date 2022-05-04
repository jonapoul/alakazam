package com.jonapoul.common.core

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.just
import io.mockk.runs
import org.junit.Before
import org.junit.Test
import java.io.Closeable

class CloseableExtensionsTest {
    @RelaxedMockK
    private lateinit var closeable: Closeable

    @Before
    fun before() {
        MockKAnnotations.init(this)
    }

    @Test
    fun `Closing with exception doesn't crash`() {
        every { closeable.close() } throws IllegalStateException("Should be hidden")
        closeable.quietlyClose() // no exception should be thrown
    }

    @Test
    fun `Closing without exception doesn't crash`() {
        every { closeable.close() } just runs
        closeable.quietlyClose() // no exception should be thrown
    }

    @Test(expected = Error::class)
    fun `Closing with error does crash`() {
        every { closeable.close() } throws Error("scary error which shouldn't be caught!")
        closeable.quietlyClose() // throws an Error
    }
}
