package dev.jonpoulton.alakazam.kotlin.time

import kotlinx.datetime.Instant
import kotlinx.datetime.toJavaInstant

fun Instant.format(format: String): String =
  format.localisedFormatter.format(this.toJavaInstant())
