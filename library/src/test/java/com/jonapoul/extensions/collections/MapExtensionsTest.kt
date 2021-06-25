package com.jonapoul.extensions.collections

import org.junit.Assert.*
import org.junit.Test

class MapExtensionsTest {
    @Test
    fun `Editing original after deep copy doesn't affect copy`() {
        val original = mutableMapOf(
            0 to "a", 1 to "b", 2 to "c", 3 to "d"
        )
        val copy = original.deepCopy()
        original[0] = "e"
        assertFalse(original[0] == copy[0])
        assertTrue(original[1] == copy[1])
        assertTrue(original[2] == copy[2])
        assertTrue(original[3] == copy[3])
    }

    @Test
    fun `Editing copy after deep copy doesn't affect original`() {
        val original = mapOf(
            0 to "a", 1 to "b", 2 to "c", 3 to "d"
        )
        val copy = original.deepCopy().toMutableMap()
        copy[0] = "e"
        assertFalse(original[0] == copy[0])
        assertTrue(original[1] == copy[1])
        assertTrue(original[2] == copy[2])
        assertTrue(original[3] == copy[3])
    }

    @Test
    fun `Replacing all replaces all`() {
        val original = mutableMapOf(
            0 to "a", 1 to "b", 2 to "c", 3 to "d"
        )
        val new = mapOf(
            4 to "e", 5 to "f", 6 to "g", 7 to "h"
        )
        original.replaceAllWith(new)
        assertArrayEquals(
            original.toList().toTypedArray(),
            new.toList().toTypedArray()
        )
    }
}
