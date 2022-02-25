package com.jonapoul.extensions.data

/**
 * If [condition] is true, the subject [Builder] will have the [action] lambda called on it, then
 * the subject is returned. If [condition] is false, the subject is returned as-is.
 */
fun <Builder> Builder.ifTrue(condition: Boolean, action: Builder.() -> Builder): Builder {
    return if (condition) this.action() else this
}

/**
 * If [condition] is false, the subject [Builder] will have the [action] lambda called on it, then
 * the subject is returned. If [condition] is true, the subject is returned as-is.
 */
fun <Builder> Builder.ifFalse(condition: Boolean, action: Builder.() -> Builder): Builder {
    return if (!condition) this.action() else this
}

/**
 * If [value] is not null, the subject [Builder] will have the [action] lambda called on it, then
 * the subject is returned. If [value] is null, the subject is returned as-is.
 */
fun <Builder, Value> Builder.ifNotNull(value: Value?, action: Builder.(Value) -> Builder): Builder {
    return if (value != null) this.action(value) else this
}

/**
 * If [value] is null, the subject [Builder] will have the [action] lambda called on it, then
 * the subject is returned. If [value] is not null, the subject is returned as-is.
 */
fun <Builder, Value> Builder.ifNull(value: Value?, action: Builder.() -> Builder): Builder {
    return if (value == null) this.action() else this
}

/**
 * If [value] is an instance of type [Expected], the subject [Builder] will have the [action] lambda
 * called on it, then the subject is returned. If [value] is not an instance of [Expected], the
 * subject is returned as-is.
 */
inline fun <Builder, Input, reified Expected> Builder.ifIsInstance(
    value: Input?,
    action: Builder.(Expected) -> Builder,
): Builder {
    return if (value is Expected) this.action(value) else this
}
