package dev.jonpoulton.alakazam.core

/**
 * If [condition] is true, the subject [B] will have the [action] lambda called on it, then the subject is returned.
 * If [condition] is false, the subject is returned as-is.
 */
fun <B> B.ifTrue(condition: Boolean, action: B.() -> B): B {
  return if (condition) this.action() else this
}

/**
 * If [condition] is false, the subject [B] will have the [action] lambda called on it, then the subject is
 * returned. If [condition] is true, the subject is returned as-is.
 */
fun <B> B.ifFalse(condition: Boolean, action: B.() -> B): B {
  return if (!condition) this.action() else this
}

/**
 * If [value] is not null, the subject [B] will have the [action] lambda called on it, then the subject is returned.
 * If [value] is null, the subject is returned as-is.
 */
fun <B, Value> B.ifNotNull(value: Value?, action: B.(Value) -> B): B {
  return if (value != null) this.action(value) else this
}

/**
 * If [value] is null, the subject [B] will have the [action] lambda called on it, then the subject is returned.
 * If [value] is not null, the subject is returned as-is.
 */
fun <B, Value> B.ifNull(value: Value?, action: B.() -> B): B {
  return if (value == null) this.action() else this
}

fun <B, T> B.ifEquals(value1: T?, value2: T?, action: B.() -> B): B {
  return ifTrue(condition = value1 == value2, action)
}

fun <B, T> B.ifNotEquals(value1: T?, value2: T?, action: B.() -> B): B {
  return ifTrue(condition = value1 != value2, action)
}
