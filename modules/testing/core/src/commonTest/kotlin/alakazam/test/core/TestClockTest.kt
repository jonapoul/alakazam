package alakazam.test.core

import kotlinx.datetime.Instant
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.time.Duration.Companion.hours

internal class TestClockTest {
  @Test
  fun `Provide single instant every time`() {
    val instant = 123.instant
    val clock = TestClock(instant)

    assertEquals(expected = instant, actual = clock.now())
    assertEquals(expected = instant, actual = clock.now())
    assertEquals(expected = instant, actual = clock.now())
  }

  @Test
  fun `Provide function invocation`() {
    val start = 0.instant
    var instant = start
    val clock = TestClock {
      instant.also { instant += 1.hours }
    }

    assertEquals(expected = start, actual = clock.now())
    assertEquals(expected = start + 1.hours, actual = clock.now())
    assertEquals(expected = start + 2.hours, actual = clock.now())
    assertEquals(expected = start + 3.hours, actual = clock.now())
  }

  @Test
  fun `Provide vararg`() {
    val clock = TestClock(
      0.instant,
      1.instant,
      2.instant,
      3.instant,
    )

    assertEquals(expected = 0.instant, actual = clock.now())
    assertEquals(expected = 1.instant, actual = clock.now())
    assertEquals(expected = 2.instant, actual = clock.now())
    assertEquals(expected = 3.instant, actual = clock.now())
    assertThrows<ArrayIndexOutOfBoundsException> { clock.now() }
  }

  @Test
  fun `Provide list`() {
    val instants = listOf(
      0.instant,
      1.instant,
      2.instant,
      3.instant,
    )
    val clock = TestClock(instants)

    assertEquals(expected = 0.instant, actual = clock.now())
    assertEquals(expected = 1.instant, actual = clock.now())
    assertEquals(expected = 2.instant, actual = clock.now())
    assertEquals(expected = 3.instant, actual = clock.now())
    assertThrows<ArrayIndexOutOfBoundsException> { clock.now() }
  }

  private val Int.instant get() = Instant.fromEpochMilliseconds(toLong())
}
