package alakazam.test

import kotlin.test.assertEquals

public fun fail(reason: String): Unit = throw AssertionError(reason)

public inline fun <reified ExpectedType> assertIsType(value: Any?) {
  val received = value?.let { it::class }
  val expected = ExpectedType::class
  if (received != expected) {
    val rxName = received?.simpleName
    val exName = expected.simpleName
    fail("Unexpected class $rxName, expected $exName")
  }
}

public inline fun <reified ExpectedType> assertIsTypeOrSubclass(value: Any?) {
  val received = value?.let { it::class }
  val expected = ExpectedType::class
  if (value !is ExpectedType) {
    val rxName = received?.simpleName
    val exName = expected.simpleName
    fail("Unexpected class $rxName, expected $exName or a subclass")
  }
}

public inline fun <reified T> assertListEquals(expected: List<T>, actual: List<T>) {
  if (expected.size != actual.size) {
    val expStr = expected.toTypedArray().contentDeepToString()
    val actStr = actual.toTypedArray().contentDeepToString()
    throw AssertionError("Different list sizes: expected = $expStr, actual = $actStr")
  } else {
    expected.zip(actual).forEach { (exp, act) -> assertEquals<T>(exp, act) }
  }
}

public inline fun <reified T> assertListContains(list: List<T>, expected: T) {
  if (!list.contains(expected)) {
    val listStr = list.toTypedArray().contentDeepToString()
    throw AssertionError("List doesn't contain $expected: $listStr")
  }
}

public inline fun <reified T : Throwable> assertThrows(call: () -> Unit) {
  try {
    call()
    throw AssertionError("Should have thrown ${T::class.simpleName}")
  } catch (t: Throwable) {
    if (t::class != T::class) {
      val expected = T::class.simpleName
      val actual = t::class.simpleName
      throw AssertionError("Should have thrown $expected, got $actual")
    }
  }
}

public fun <T : Comparable<T>> T.assertMoreThan(other: T) {
  if (this <= other) {
    throw AssertionError("$this should be more than $other")
  }
}

public fun <T : Comparable<T>> T.assertLessThan(other: T) {
  if (this >= other) {
    throw AssertionError("$this should be less than $other")
  }
}

public fun assertEmpty(c: Collection<*>) {
  if (!c.isEmpty()) {
    throw AssertionError("$c should be empty, actually had $c.size elements: ${c.joinToString()}")
  }
}

public fun assertNotEmpty(c: Collection<*>) {
  if (c.isEmpty()) {
    throw AssertionError("$c should have at least one item, actually empty")
  }
}
