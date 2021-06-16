package com.jonapoul.extensions

import org.junit.Assert.*
import org.junit.Test

class ListExtensionsTest {
    @Test
    fun `Editing original after deep copy doesn't affect copy`() {
        val original = mutableListOf(1, 2, 3, 4)
        val copy = original.deepCopy()
        original[0] = 100
        assertFalse(original[0] == copy[0])
        assertTrue(original[1] == copy[1])
        assertTrue(original[2] == copy[2])
        assertTrue(original[3] == copy[3])
    }

    @Test
    fun `Editing copy after deep copy doesn't affect original`() {
        val original = listOf(1, 2, 3, 4)
        val copy = original.deepCopy().toMutableList()
        copy[0] = 100
        assertFalse(original[0] == copy[0])
        assertTrue(original[1] == copy[1])
        assertTrue(original[2] == copy[2])
        assertTrue(original[3] == copy[3])
    }

    @Test
    fun `Replacing all replaces all`() {
        val original = mutableListOf(1, 2, 3, 4)
        val new = listOf(5, 6, 7, 8, 9)
        original.replaceAllWith(new)
        assertArrayEquals(
            original.toTypedArray(),
            new.toTypedArray()
        )
    }
}
