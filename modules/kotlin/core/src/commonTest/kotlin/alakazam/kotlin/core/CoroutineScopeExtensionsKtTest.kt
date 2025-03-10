package alakazam.kotlin.core

import alakazam.test.core.FiniteLoopController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.test.assertEquals

internal class CoroutineScopeExtensionsKtTest {
  @Test
  fun `Collect flow`() = runTest {
    // Given
    val flow = flowOf(1, 2, 3, 4, 5)
    val scope = CoroutineScope(coroutineContext)

    // When
    var numItemsCollected = 0
    scope.collectFlow(flow, coroutineContext) { numItemsCollected++ }
    advanceUntilIdle()

    // Then
    assertEquals(expected = 5, actual = numItemsCollected)
  }

  @Test
  fun `Launch infinite loop`() = runTest {
    // Given
    val controller = FiniteLoopController(maxLoops = 10)
    var numLoops = 0

    // When
    launchInfiniteLoop(coroutineContext, controller) {
      numLoops++
      delay(5_000L) // will be skipped
    }
    advanceUntilIdle()

    // Then
    assertEquals(expected = 10, actual = numLoops)
  }
}
