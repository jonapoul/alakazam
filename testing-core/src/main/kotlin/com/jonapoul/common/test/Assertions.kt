package com.jonapoul.common.test

import org.junit.Assert

fun <Expected, Actual> assertEquals(expected: Expected, actual: Actual) {
    Assert.assertEquals(expected, actual)
}

fun <Unexpected, Actual> assertNotEquals(unexpected: Unexpected, actual: Actual) {
    Assert.assertNotEquals(unexpected, actual)
}

fun assertNull(value: Any?) {
    Assert.assertNull(value)
}

fun assertNotNull(value: Any?) {
    Assert.assertNotNull(value)
}

fun assertTrue(condition: Boolean?) {
    if (condition == null) {
        condition ?: fail("Null boolean argument")
    } else {
        Assert.assertTrue(condition)
    }
}

fun assertFalse(condition: Boolean?) {
    if (condition == null) {
        condition ?: fail("Null boolean argument")
    } else {
        Assert.assertFalse(condition)
    }
}

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
        throw AssertionError(
            "Different list sizes: expected = $expStr, actual = $actStr"
        )
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
