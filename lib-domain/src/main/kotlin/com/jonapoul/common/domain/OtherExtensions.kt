package com.jonapoul.common.domain

/**
 * Can be used to enforce completeness with "when" statements. Useful when we have a sealed class or
 * an enum to which we add a new entry. If we have this value declared on any relevant when
 * statements, a compiler error will block building.
 */
val <T> T.exhaustive: T
    get() = this