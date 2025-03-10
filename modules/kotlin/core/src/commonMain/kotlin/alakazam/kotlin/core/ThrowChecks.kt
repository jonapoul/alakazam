@file:Suppress("TooGenericExceptionThrown")

package alakazam.kotlin.core

public inline fun <reified Expected : Throwable> throwsSpecific(block: () -> Unit): Boolean = try {
  block()
  false
} catch (e: Throwable) {
  Expected::class.isInstance(e)
}

public fun throwsAnyException(block: () -> Unit): Boolean = try {
  block()
  false
} catch (e: Exception) {
  true
}

public fun throwsAnyThrowable(block: () -> Unit): Boolean = try {
  block()
  false
} catch (e: Throwable) {
  true
}
