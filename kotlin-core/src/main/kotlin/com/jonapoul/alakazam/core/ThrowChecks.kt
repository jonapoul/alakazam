@file:Suppress("TooGenericExceptionThrown")

package com.jonapoul.alakazam.core

inline fun <reified Expected : Throwable> throwsSpecific(block: () -> Unit): Boolean {
  return try {
    block.invoke()
    false
  } catch (e: Throwable) {
    Expected::class.isInstance(e)
  }
}

fun throwsAnyException(block: () -> Unit): Boolean {
  return try {
    block.invoke()
    false
  } catch (e: Exception) {
    true
  }
}

fun throwsAnyThrowable(block: () -> Unit): Boolean {
  return try {
    block.invoke()
    false
  } catch (e: Throwable) {
    true
  }
}
