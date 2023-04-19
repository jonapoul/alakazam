package dev.jonpoulton.alakazam.core

import app.cash.turbine.test
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertNull

class SnackbarFeedTest {
  private lateinit var snackbarFeed: SnackbarFeed

  @Before
  fun before() {
    snackbarFeed = SnackbarFeed()
  }

  @Test
  fun `No messages emits null`() = runTest {
    advanceUntilIdle()
    snackbarFeed.snackbars.test {
      assertNull(awaitItem())
      cancelAndIgnoreRemainingEvents()
    }
  }

  @Test
  fun `One message emitted`() = runTest {
    val message = "Hello world"
    val snackbarMessage = SnackbarMessage.Success(message)
    snackbarFeed.add(snackbarMessage)

    snackbarFeed.snackbars.test {
      assertNull(awaitItem())

      /* The added message is emitted */
      val emitted = awaitItem()
      assertIs<SnackbarMessage.Success>(emitted)
      assertEquals(expected = message, actual = emitted.message)

      /* Null is emitted afterwards */
      assertNull(awaitItem())

      cancelAndIgnoreRemainingEvents()
    }
  }

  @Test
  fun `Multiple messages emitted in sequence`() = runTest {
    snackbarFeed.snackbars.test {
      /* The added messages are emitted in sequence */
      assertNull(awaitItem())
      snackbarFeed.add(SnackbarMessage.Info("INFO"))
      assertIs<SnackbarMessage.Info>(awaitItem())

      assertNull(awaitItem())
      snackbarFeed.add(SnackbarMessage.Success("SUCCESS"))
      assertIs<SnackbarMessage.Success>(awaitItem())

      assertNull(awaitItem())
      snackbarFeed.add(SnackbarMessage.Caution("CAUTION"))
      assertIs<SnackbarMessage.Caution>(awaitItem())

      assertNull(awaitItem())
      snackbarFeed.add(SnackbarMessage.Warning("WARNING"))
      assertIs<SnackbarMessage.Warning>(awaitItem())

      /* Null is emitted afterwards */
      assertNull(awaitItem())

      cancelAndIgnoreRemainingEvents()
    }
  }
}
