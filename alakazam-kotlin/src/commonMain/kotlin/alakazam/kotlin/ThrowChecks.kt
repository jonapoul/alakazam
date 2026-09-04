@file:Suppress("TooGenericExceptionThrown")

package alakazam.kotlin

public inline fun <reified Expected : Throwable> throwsSpecific(block: () -> Unit): Boolean =
  try {
    block()
    false
  } catch (e: Throwable) {
    Expected::class.isInstance(e)
  }

public inline fun throwsAnyException(block: () -> Unit): Boolean =
  try {
    block()
    false
  } catch (_: Exception) {
    true
  }

public inline fun throwsAnyThrowable(block: () -> Unit): Boolean =
  try {
    block()
    false
  } catch (_: Throwable) {
    true
  }
