package com.jonapoul.alakazam.test

import org.junit.Assert.assertEquals

@Throws(AssertionError::class)
fun fail(reason: String) {
    throw AssertionError(reason)
}

inline fun <reified ExpectedType> assertIsType(value: Any?) {
    val received = value?.javaClass
    val expected = ExpectedType::class.java
    if (received != expected) {
        val rxName = received?.simpleName
        val exName = expected.simpleName
        fail("Unexpected class $rxName, expected $exName")
    }
}

inline fun <reified ExpectedType> assertIsTypeOrSubclass(value: Any?) {
    val received = value?.javaClass
    val expected = ExpectedType::class.java
    if (value !is ExpectedType) {
        val rxName = received?.simpleName
        val exName = expected.simpleName
        fail("Unexpected class $rxName, expected $exName or a subclass")
    }
}

inline fun <reified E, reified A> assertListEquals(expected: List<E>, actual: List<A>) {
    if (expected.size != actual.size) {
        val expStr = expected.toTypedArray().contentDeepToString()
        val actStr = actual.toTypedArray().contentDeepToString()
        throw AssertionError("Different list sizes: expected = $expStr, actual = $actStr")
    } else {
        expected.zip(actual).forEach {
            assertEquals(it.first, it.second)
        }
    }
}

inline fun <reified T> assertListContains(list: List<T>, expected: T) {
    if (!list.contains(expected)) {
        val listStr = list.toTypedArray().contentDeepToString()
        throw AssertionError("List doesn't contain $expected: $listStr")
    }
}

inline fun <reified T : Throwable> assertThrows(call: () -> Unit) {
    try {
        call.invoke()
        throw AssertionError("Should have thrown ${T::class.java.simpleName}")
    } catch (t: Throwable) {
        if (t.javaClass != T::class.java) {
            val expected = T::class.java.simpleName
            val actual = t.javaClass.simpleName
            throw AssertionError("Should have thrown $expected, got $actual")
        }
    }
}

fun <T : Comparable<T>> T.assertMoreThan(other: T) {
    if (this <= other) {
        throw AssertionError("$this should be more than $other")
    }
}

fun <T : Comparable<T>> T.assertLessThan(other: T) {
    if (this >= other) {
        throw AssertionError("$this should be less than $other")
    }
}
