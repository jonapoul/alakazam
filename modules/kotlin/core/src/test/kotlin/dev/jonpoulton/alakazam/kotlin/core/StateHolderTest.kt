package dev.jonpoulton.alakazam.kotlin.core

import app.cash.turbine.test
import dev.jonpoulton.alakazam.test.core.CoroutineRule
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import kotlin.test.assertEquals

class StateHolderTest {
  @get:Rule
  val coroutineRule = CoroutineRule()

  private class IntStateHolder : StateHolder<Int>(initialState = INITIAL_VALUE)

  private lateinit var stateHolder: IntStateHolder

  @Before
  fun before() {
    stateHolder = IntStateHolder()
  }

  @Test
  fun `Initial state`() = runTest {
    assertEquals(expected = INITIAL_VALUE, actual = stateHolder.peek())
    stateHolder.state.test {
      assertEquals(expected = INITIAL_VALUE, actual = awaitItem())
      cancelAndIgnoreRemainingEvents()
    }
  }

  @Test
  fun `Change state`() = runTest {
    stateHolder.state.test {
      assertEquals(expected = INITIAL_VALUE, actual = awaitItem())
      stateHolder.set(456)
      assertEquals(expected = 456, actual = awaitItem())
      stateHolder.reset()
      assertEquals(expected = INITIAL_VALUE, actual = awaitItem())
      cancelAndIgnoreRemainingEvents()
    }
  }

  private companion object {
    const val INITIAL_VALUE = 123
  }
}
