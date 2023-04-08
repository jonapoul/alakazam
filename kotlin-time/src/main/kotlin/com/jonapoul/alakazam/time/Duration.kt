package com.jonapoul.alakazam.time

import kotlin.time.DurationUnit

/**
 * Copied verbatim from https://github.com/JetBrains/kotlin/blob/d8b0dbe71bbeb84ba0fbdac87801c8c6f4eed4c9/libraries/stdlib/src/kotlin/time/DurationUnit.kt#L65
 */
fun DurationUnit.shortName(): String = when (this) {
    DurationUnit.NANOSECONDS -> "ns"
    DurationUnit.MICROSECONDS -> "μs"
    DurationUnit.MILLISECONDS -> "ms"
    DurationUnit.SECONDS -> "s"
    DurationUnit.MINUTES -> "m"
    DurationUnit.HOURS -> "h"
    DurationUnit.DAYS -> "d"
    else -> error("Unknown unit: $this")
}
