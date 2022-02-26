package com.jonapoul.common.data.coroutines

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertArrayEquals
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class FlowTakeUntilInclusiveTest {
    @Test
    fun `No matches returns all emissions`() = runTest {
        val taken = flowOf("a", "b", "c")
            .takeUntilInclusive { it == "d" }
            .toList()
        assertArrayEquals(
            arrayOf("a", "b", "c"),
            taken.toTypedArray()
        )
    }

    @Test
    fun `Matching the last emission includes it`() = runTest {
        val taken = flowOf("a", "b", "c")
            .takeUntilInclusive { it == "c" }
            .toList()
        assertArrayEquals(
            arrayOf("a", "b", "c"),
            taken.toTypedArray()
        )
    }

    @Test
    fun `Matching the first emission returns first element`() = runTest {
        val taken = flowOf("a", "b", "c")
            .takeUntilInclusive { it == "a" }
            .toList()
        assertArrayEquals(
            arrayOf("a"),
            taken.toTypedArray()
        )
    }
}
