package com.jonapoul.common.core

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class FlowOnEachOfTypeTest {
    @Test
    fun `String flow doesn't emit any ints`() = runTest {
        val grabbedInts = arrayListOf<Int>()
        flowOf("a", "b", "c")
            .onEachOfType<String, Int> { grabbedInts.add(it) }
            .collect()
        assertTrue(grabbedInts.isEmpty())
    }

    @Test
    fun `Int flow doesn't emit any strings`() = runTest {
        val grabbedStrings = arrayListOf<String>()
        flowOf(1, 2, 3)
            .onEachOfType<Int, String> { grabbedStrings.add(it) }
            .collect()
        assertTrue(grabbedStrings.isEmpty())
    }

    private open class OpenClass
    private class FinalClass : OpenClass()

    @Test
    fun `FinalClass flow emits OpenClass`() = runTest {
        val grabbedOpens = arrayListOf<OpenClass>()
        flowOf(FinalClass(), FinalClass(), FinalClass())
            .onEachOfType<OpenClass, FinalClass> { grabbedOpens.add(it) }
            .collect()
        assertEquals(grabbedOpens.size, 3)
    }

    @Test
    fun `OpenClass flow doesn't emit FinalClass`() = runTest {
        val grabbedFinals = arrayListOf<FinalClass>()
        flowOf(OpenClass(), OpenClass(), OpenClass())
            .onEachOfType<OpenClass, FinalClass> { grabbedFinals.add(it) }
            .collect()
        assertTrue(grabbedFinals.isEmpty())
    }

    @Test
    fun `Mixed flow emits some FinalClass`() = runTest {
        val grabbedFinals = arrayListOf<FinalClass>()
        flowOf(FinalClass(), OpenClass(), FinalClass(), OpenClass())
            .onEachOfType<OpenClass, FinalClass> { grabbedFinals.add(it) }
            .collect()
        assertEquals(grabbedFinals.size, 2)
    }
}

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
        Assert.assertArrayEquals(
            arrayOf("a", "b"),
            taken.toTypedArray()
        )
    }

    @Test
    fun `Matching the first emission returns empty list`() = runTest {
        val taken = flowOf("a", "b", "c")
            .takeUntilExclusive { it == "a" }
            .toList()
        Assert.assertArrayEquals(
            arrayOf(),
            taken.toTypedArray()
        )
    }
}

@OptIn(ExperimentalCoroutinesApi::class)
class FlowTakeUntilInclusiveTest {
    @Test
    fun `No matches returns all emissions`() = runTest {
        val taken = flowOf("a", "b", "c")
            .takeUntilInclusive { it == "d" }
            .toList()
        Assert.assertArrayEquals(
            arrayOf("a", "b", "c"),
            taken.toTypedArray()
        )
    }

    @Test
    fun `Matching the last emission includes it`() = runTest {
        val taken = flowOf("a", "b", "c")
            .takeUntilInclusive { it == "c" }
            .toList()
        Assert.assertArrayEquals(
            arrayOf("a", "b", "c"),
            taken.toTypedArray()
        )
    }

    @Test
    fun `Matching the first emission returns first element`() = runTest {
        val taken = flowOf("a", "b", "c")
            .takeUntilInclusive { it == "a" }
            .toList()
        Assert.assertArrayEquals(
            arrayOf("a"),
            taken.toTypedArray()
        )
    }
}
