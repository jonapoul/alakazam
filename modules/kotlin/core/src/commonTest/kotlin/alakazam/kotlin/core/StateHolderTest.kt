package alakazam.kotlin.core

import app.cash.turbine.test
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

internal class StateHolderTest {
  private class IntStateHolder : StateHolder<Int>(initialState = INITIAL_VALUE)

  private lateinit var stateHolder: IntStateHolder

  @Before
  fun before() {
    stateHolder = IntStateHolder()
  }

  @Test
  fun `Initial state`() = runTest {
    assertEquals(expected = INITIAL_VALUE, actual = stateHolder.value)
    stateHolder.test {
      assertEquals(expected = INITIAL_VALUE, actual = awaitItem())
      cancelAndIgnoreRemainingEvents()
    }
  }

  @Test
  fun `Change state`() = runTest {
    stateHolder.test {
      assertEquals(expected = INITIAL_VALUE, actual = awaitItem())
      stateHolder.update { 456 }
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
