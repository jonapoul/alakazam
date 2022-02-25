package com.jonapoul.extensions.data.coroutines

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
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
