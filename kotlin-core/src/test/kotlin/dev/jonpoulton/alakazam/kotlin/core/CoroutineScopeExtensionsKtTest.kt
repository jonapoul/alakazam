package dev.jonpoulton.alakazam.kotlin.core

import dev.jonpoulton.alakazam.test.core.CoroutineRule
import dev.jonpoulton.alakazam.test.core.FiniteLoopController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test
import kotlin.test.assertEquals

class CoroutineScopeExtensionsKtTest {
  @get:Rule
  val coroutineRule = CoroutineRule()

  @Test
  fun `Collect flow`() {
    /* Given */
    val flow = flowOf(1, 2, 3, 4, 5)
    val scope = CoroutineScope(context = coroutineRule.dispatcher)

    /* When */
    var numItemsCollected = 0
    scope.collectFlow(flow) { numItemsCollected++ }
    coroutineRule.advanceUntilIdle()

    /* Then */
    assertEquals(expected = 5, actual = numItemsCollected)
  }

  @Test
  fun `Launch infinite loop`() = runTest {
    /* Given */
    val controller = FiniteLoopController(maxLoops = 10)
    var numLoops = 0

    /* When */
    coroutineRule.scope.launchInfiniteLoop(loopController = controller) {
      numLoops++
      delay(5_000L) // will be skipped
    }
    coroutineRule.advanceUntilIdle()

    /* Then */
    assertEquals(expected = 10, actual = numLoops)
  }
}
