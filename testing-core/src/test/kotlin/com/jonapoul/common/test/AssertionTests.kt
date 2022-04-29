package com.jonapoul.common.test

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

private const val UNEXPECTED = "unexpected error!"

private const val INT = 1
private const val LONG = 1L
private const val DOUBLE = 1.0
private const val FLOAT = 1.0f
private const val BOOL = true

private data class DataClass(
    val int: Int,
    val boolean: Boolean,
    val double: Double,
)

private val DATA1 = DataClass(INT, BOOL, DOUBLE)

private abstract class AbstractClass
private object FinalClass : AbstractClass()
private interface IInterface
private object InterfaceImpl : IInterface

private val INTS = listOf(1, 2, 3)
private val LONGS = listOf(1L, 2L, 3L)
private val DOUBLES = listOf(1.0, 2.0, 3.0)
private val FLOATS = listOf(1.0f, 2.0f, 3.0f)
private val BOOLS = listOf(true, false, true)

private fun checkFailed(call: () -> Unit) {
    try {
        call.invoke()
        throw AssertionError(UNEXPECTED)
    } catch (e: AssertionError) {
        if (e.message == UNEXPECTED) throw e
    }
}

class AssertTrueOrFalseTests {
    @Test
    fun `assertTrue valid`() = assertTrue(true)

    @Test
    fun `assertTrue invalid 1`() = checkFailed { assertTrue(false) }

    @Test
    fun `assertTrue invalid 2`() = checkFailed { assertTrue(null) }

    @Test
    fun `assertFalse valid`() = assertFalse(false)

    @Test
    fun `assertFalse invalid 1`() = checkFailed { assertFalse(true) }

    @Test
    fun `assertFalse invalid 2`() = checkFailed { assertFalse(null) }
}

class AssertIsTypeTests {
    @Test
    fun `assertIsType valid 1`() = assertIsType<DataClass>(DATA1)

    @Test
    fun `assertIsType valid 2`() = assertIsType<Int>(INT)

    @Test
    fun `assertIsType valid 3`() = assertIsType<Double>(DOUBLE)

    @Test
    fun `assertIsType valid 4`() = assertIsType<Boolean>(BOOL)

    @Test
    fun `assertIsType valid 5`() = assertIsType<Float>(FLOAT)

    @Test
    fun `assertIsType valid 6`() = assertIsType<Double>(DATA1.double)

    @Test
    fun `assertIsType invalid 1`() = checkFailed { assertIsType<AbstractClass>(FinalClass) }

    @Test
    fun `assertIsType invalid 2`() = checkFailed { assertIsType<IInterface>(InterfaceImpl) }

    @Test
    fun `assertIsType invalid 3`() = checkFailed { assertIsType<Int>(LONG) }

    @Test
    fun `assertIsType invalid 4`() = checkFailed { assertIsType<Int>(BOOL) }

    @Test
    fun `assertIsType invalid 5`() = checkFailed { assertIsType<Boolean>(INT) }
}

class AssertIsTypeOrSubclassTests {
    @Test
    fun `assertSubclass valid 1`() = assertIsTypeOrSubclass<DataClass>(DATA1)

    @Test
    fun `assertSubclass valid 2`() = assertIsTypeOrSubclass<Int>(INT)

    @Test
    fun `assertSubclass valid 3`() = assertIsTypeOrSubclass<Double>(DOUBLE)

    @Test
    fun `assertSubclass valid 4`() = assertIsTypeOrSubclass<Boolean>(BOOL)

    @Test
    fun `assertSubclass valid 5`() = assertIsTypeOrSubclass<Float>(FLOAT)

    @Test
    fun `assertSubclass valid 6`() = assertIsTypeOrSubclass<Double>(DATA1.double)

    @Test
    fun `assertSubclass valid 7`() = assertIsTypeOrSubclass<AbstractClass>(FinalClass)

    @Test
    fun `assertSubclass valid 8`() = assertIsTypeOrSubclass<IInterface>(InterfaceImpl)

    @Test
    fun `assertSubclass invalid 1`() = checkFailed { assertIsTypeOrSubclass<Int>(LONG) }

    @Test
    fun `assertSubclass invalid 2`() = checkFailed { assertIsTypeOrSubclass<Int>(BOOL) }

    @Test
    fun `assertSubclass invalid 3`() = checkFailed { assertIsTypeOrSubclass<Boolean>(INT) }
}

@RunWith(Parameterized::class)
class AssertListEqualsValidTests(private val a: List<Any>, private val b: List<Any>) {
    @Test
    fun `assertListEquals valid`() = assertListEquals(a, b)

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() = listOf(
            arrayOf(INTS, INTS),
            arrayOf(INTS, copyOf(INTS)),
            arrayOf(LONGS, LONGS),
            arrayOf(LONGS, copyOf(LONGS)),
            arrayOf(FLOATS, FLOATS),
            arrayOf(FLOATS, copyOf(FLOATS)),
            arrayOf(DOUBLES, DOUBLES),
            arrayOf(DOUBLES, copyOf(DOUBLES)),
            arrayOf(BOOLS, BOOLS),
            arrayOf(BOOLS, copyOf(BOOLS)),
        )

        private fun <T> copyOf(list: List<T>): List<T> = arrayListOf<T>().apply { addAll(list) }
    }
}
