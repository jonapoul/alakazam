/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.core

import org.junit.Assert.assertArrayEquals
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

internal class ListExtensionsTest {
  @Test
  fun `Editing original after deep copy doesn't affect copy`() {
    val original = mutableListOf(1, 2, 3, 4)
    val copy = original.deepCopy()
    original[0] = 100
    assertNotEquals(original[0], copy[0])
    assertEquals(original[1], copy[1])
    assertEquals(original[2], copy[2])
    assertEquals(original[3], copy[3])
  }

  @Test
  fun `Editing copy after deep copy doesn't affect original`() {
    val original = listOf(1, 2, 3, 4)
    val copy = original.deepCopy().toMutableList()
    copy[0] = 100
    assertNotEquals(original[0], copy[0])
    assertEquals(original[1], copy[1])
    assertEquals(original[2], copy[2])
    assertEquals(original[3], copy[3])
  }

  @Test
  fun `Replacing all replaces all`() {
    val original = mutableListOf(1, 2, 3, 4)
    val new = listOf(5, 6, 7, 8, 9)
    original.replaceAllWith(new)
    assertArrayEquals(
      original.toTypedArray(),
      new.toTypedArray(),
    )
  }
}
