package dev.jonpoulton.alakazam.kotlin.core

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BuilderExtensionsTest {
  data class TestResult(
    val valueWasChanged: Boolean,
  )

  class TestBuilder {
    private var valueWasChanged = false

    fun changeValue(): TestBuilder {
      valueWasChanged = true
      return this
    }

    fun build(): TestResult {
      return TestResult(valueWasChanged)
    }
  }

  @Test
  fun `If true with false`() {
    val result = TestBuilder()
      .ifTrue(false) { changeValue() }
      .build()
    assertFalse(result.valueWasChanged)
  }

  @Test
  fun `If true with true`() {
    val result = TestBuilder()
      .ifTrue(true) { changeValue() }
      .build()
    assertTrue(result.valueWasChanged)
  }

  @Test
  fun `If false with false`() {
    val result = TestBuilder()
      .ifFalse(false) { changeValue() }
      .build()
    assertTrue(result.valueWasChanged)
  }

  @Test
  fun `If false with true`() {
    val result = TestBuilder()
      .ifFalse(true) { changeValue() }
      .build()
    assertFalse(result.valueWasChanged)
  }

  @Test
  fun `If null with not null`() {
    val result = TestBuilder()
      .ifNull(123) { changeValue() }
      .build()
    assertFalse(result.valueWasChanged)
  }

  @Test
  fun `If null with null`() {
    val result = TestBuilder()
      .ifNull(null) { changeValue() }
      .build()
    assertTrue(result.valueWasChanged)
  }

  @Test
  fun `If not null with not null`() {
    val result = TestBuilder()
      .ifNotNull(123) { changeValue() }
      .build()
    assertTrue(result.valueWasChanged)
  }

  @Test
  fun `If not null with null`() {
    val result = TestBuilder()
      .ifNotNull(null) { changeValue() }
      .build()
    assertFalse(result.valueWasChanged)
  }

  @Test
  fun `If equals with equal`() {
    val result = TestBuilder()
      .ifEquals(123, 123) { changeValue() }
      .build()
    assertTrue(result.valueWasChanged)
  }

  @Test
  fun `If equals with not equal`() {
    val result = TestBuilder()
      .ifEquals(123, 321) { changeValue() }
      .build()
    assertFalse(result.valueWasChanged)
  }

  @Test
  fun `If not equals with equal`() {
    val result = TestBuilder()
      .ifNotEquals(123, 123) { changeValue() }
      .build()
    assertFalse(result.valueWasChanged)
  }

  @Test
  fun `If not equals with not equal`() {
    val result = TestBuilder()
      .ifNotEquals(123, 321) { changeValue() }
      .build()
    assertTrue(result.valueWasChanged)
  }
}
