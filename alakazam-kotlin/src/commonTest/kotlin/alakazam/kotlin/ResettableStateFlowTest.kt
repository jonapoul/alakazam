package alakazam.kotlin

import app.cash.turbine.test
import kotlin.test.assertEquals
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.test.runTest
import org.junit.Test

internal class ResettableStateFlowTest {
  @Test
  fun `Observe then reset`() = runTest {
    val flow = ResettableStateFlow(value = 123)
    flow.test {
      assertEquals(expected = 123, actual = awaitItem())

      flow.update { 456 }
      assertEquals(expected = 456, actual = awaitItem())

      flow.update { 789 }
      assertEquals(expected = 789, actual = awaitItem())

      flow.reset()
      assertEquals(expected = 123, actual = awaitItem())

      expectNoEvents()
      cancelAndIgnoreRemainingEvents()
    }
  }
}
