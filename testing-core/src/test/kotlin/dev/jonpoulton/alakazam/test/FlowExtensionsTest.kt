package dev.jonpoulton.alakazam.test

import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test

class FlowExtensionsTest {
  @get:Rule
  val coroutineRule = CoroutineRule()

  @Test
  fun `Assert first emission then cancel`() = runTest {
    val flow = flowOf(1)
    flow.assertEmission(1)
  }

  @Test(expected = AssertionError::class)
  fun `Throw if asserting with extra emissions after`() = runTest {
    val flow = flowOf(1, 2, 3)
    flow.assertEmission(1)
  }
}
