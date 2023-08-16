package dev.jonpoulton.alakazam.core

import app.cash.turbine.test
import dev.jonpoulton.alakazam.test.CoroutineRule
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import kotlin.test.assertEquals

class StateHolderTest {
  @get:Rule
  val coroutineRule = CoroutineRule()

  private class IntStateHolder : StateHolder<Int>(initialState = InitialValue)

  private lateinit var stateHolder: IntStateHolder

  @Before
  fun before() {
    stateHolder = IntStateHolder()
  }

  @Test
  fun `Initial state`() = runTest {
    assertEquals(expected = InitialValue, actual = stateHolder.peek())
    stateHolder.state.test {
      assertEquals(expected = InitialValue, actual = awaitItem())
      cancelAndIgnoreRemainingEvents()
    }
  }

  @Test
  fun `Change state`() = runTest {
    stateHolder.state.test {
      assertEquals(expected = InitialValue, actual = awaitItem())
      stateHolder.set(456)
      assertEquals(expected = 456, actual = awaitItem())
      stateHolder.reset()
      assertEquals(expected = InitialValue, actual = awaitItem())
      cancelAndIgnoreRemainingEvents()
    }
  }

  private companion object {
    const val InitialValue = 123
  }
}
