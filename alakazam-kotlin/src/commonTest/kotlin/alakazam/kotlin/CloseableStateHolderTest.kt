package alakazam.kotlin

import app.cash.turbine.test
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

internal class CloseableStateHolderTest {
  private lateinit var closed: MutableList<String>
  private lateinit var stateHolder: CloseableStateHolder<CloseableString>

  @Before
  fun before() {
    closed = mutableListOf()
    stateHolder = CloseableStateHolder(
      initialState = CloseableString(INITIAL_VALUE),
      onClose = { closed.add(it.value) },
    )
  }

  @Test
  fun `Initial state`() = runTest {
    assertEquals(expected = INITIAL_VALUE, actual = stateHolder.value.value)
    assertEquals(expected = emptyList(), actual = closed)
  }

  @Test
  fun `Setting value closes old value`() = runTest {
    stateHolder.value = CloseableString("second")
    assertEquals(expected = listOf(INITIAL_VALUE), actual = closed)
    assertEquals(expected = "second", actual = stateHolder.value.value)
  }

  @Test
  fun `Setting same instance does not close`() = runTest {
    stateHolder.value = stateHolder.value
    assertEquals(expected = emptyList(), actual = closed)
  }

  @Test
  fun `Update closes old value`() = runTest {
    stateHolder.test {
      assertEquals(expected = INITIAL_VALUE, actual = awaitItem().value)
      stateHolder.update { CloseableString("second") }
      assertEquals(expected = "second", actual = awaitItem().value)
      assertEquals(expected = listOf(INITIAL_VALUE), actual = closed)
      cancelAndIgnoreRemainingEvents()
    }
  }

  @Test
  fun `Reset closes old value`() = runTest {
    stateHolder.value = CloseableString("second")
    closed.clear()
    stateHolder.reset()
    assertEquals(expected = INITIAL_VALUE, actual = stateHolder.value.value)
    assertEquals(expected = listOf("second"), actual = closed)
  }

  private companion object {
    const val INITIAL_VALUE = "initial"
  }
}

private class CloseableString(val value: String) : AutoCloseable {
  override fun close() = Unit
}
