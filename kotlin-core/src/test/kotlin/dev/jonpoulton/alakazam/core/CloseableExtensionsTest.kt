package dev.jonpoulton.alakazam.core

import java.io.Closeable
import org.junit.Test

class CloseableExtensionsTest {
  private lateinit var closeable: Closeable

  @Test
  fun `Closing with exception doesn't crash`() {
    buildCloseable { error("Should be hidden") }
    closeable.quietlyClose() // no exception should be thrown
  }

  @Test
  fun `Closing without exception doesn't crash`() {
    buildCloseable { /* Nothing happens */ }
    closeable.quietlyClose() // no exception should be thrown
  }

  @Test(expected = Error::class)
  fun `Closing with error does crash`() {
    buildCloseable { throw AssertionError("scary error which shouldn't be caught!") }
    closeable.quietlyClose() // throws an Error
  }

  private fun buildCloseable(block: () -> Unit) {
    closeable = Closeable { block.invoke() }
  }
}
