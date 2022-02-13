package com.jonapoul.extensions.data

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class FlowTakeUntilExclusiveTest {
    @Test
    fun `No matches doesn't cancel the flow`() = runTest {
        val taken = flowOf("a", "b", "c")
            .takeUntilExclusive { it == "d" }
            .toList()
        assertEquals(3, taken.size)
    }

    @Test
    fun `Matching the last emission excludes it`() = runTest {
        val taken = flowOf("a", "b", "c")
            .takeUntilExclusive { it == "c" }
            .toList()
        assertArrayEquals(
            arrayOf("a", "b"),
            taken.toTypedArray()
        )
    }

    @Test
    fun `Matching the first emission returns empty list`() = runTest {
        val taken = flowOf("a", "b", "c")
            .takeUntilExclusive { it == "a" }
            .toList()
        assertArrayEquals(
            arrayOf(),
            taken.toTypedArray()
        )
    }
}
