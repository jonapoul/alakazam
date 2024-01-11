package dev.jonpoulton.alakazam.kotlin.time

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals
import kotlin.time.DurationUnit

@RunWith(Parameterized::class)
class DurationUnitExtensionsTest(private val case: TestCase) {
  @Test
  fun runTest() {
    assertEquals(
      expected = case.expected,
      actual = case.unit.shortName(),
    )
  }

  data class TestCase(val unit: DurationUnit, val expected: String)

  companion object {
    @JvmStatic
    @Parameterized.Parameters
    fun data() = listOf(
      TestCase(unit = DurationUnit.NANOSECONDS, expected = "ns"),
      TestCase(unit = DurationUnit.MICROSECONDS, expected = "μs"),
      TestCase(unit = DurationUnit.MILLISECONDS, expected = "ms"),
      TestCase(unit = DurationUnit.SECONDS, expected = "s"),
      TestCase(unit = DurationUnit.MINUTES, expected = "m"),
      TestCase(unit = DurationUnit.HOURS, expected = "h"),
      TestCase(unit = DurationUnit.DAYS, expected = "d"),
    )
  }
}
