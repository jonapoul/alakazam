@file:Suppress("TooGenericExceptionThrown")

package dev.jonpoulton.alakazam.kotlin.core

public inline fun <reified Expected : Throwable> throwsSpecific(block: () -> Unit): Boolean {
  return try {
    block.invoke()
    false
  } catch (e: Throwable) {
    Expected::class.isInstance(e)
  }
}

public fun throwsAnyException(block: () -> Unit): Boolean {
  return try {
    block.invoke()
    false
  } catch (e: Exception) {
    true
  }
}

public fun throwsAnyThrowable(block: () -> Unit): Boolean {
  return try {
    block.invoke()
    false
  } catch (e: Throwable) {
    true
  }
}
