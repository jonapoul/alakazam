/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.time

import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.time.Clock
import kotlin.time.Instant
import kotlin.time.toJavaInstant

public fun Instant.format(
  format: String,
  config: TimestampConfig = TimestampConfig.Default,
): String = format(format.localisedFormatter(config))

public fun Instant.format(formatter: DateTimeFormatter): String = formatter.format(toJavaInstant())

public fun Instant.formatFull(
  config: TimestampConfig = TimestampConfig.Default,
): String = format(Instant.fullFormatter(config))

public fun Instant.formatReduced(
  now: Instant = Clock.System.now(),
  config: TimestampConfig = TimestampConfig.Default,
): String {
  val zone = TimeZone.currentSystemDefault()
  val timeLocal = toLocalDateTime(zone)
  val nowLocal = now.toLocalDateTime(zone)
  val javaInstant = toJavaInstant()
  return when {
    nowLocal.year != timeLocal.year -> Instant.dateFormatter(config).format(javaInstant)
    nowLocal.date != timeLocal.date -> Instant.thisYearFormatter(config).format(javaInstant)
    else -> Instant.todayFormatter(config).format(javaInstant)
  }
}

public fun Instant.Companion.todayFormatter(
  config: TimestampConfig = TimestampConfig.Default,
): DateTimeFormatter = "HH:mm".localisedFormatter(config)

public fun Instant.Companion.thisYearFormatter(
  config: TimestampConfig = TimestampConfig.Default,
): DateTimeFormatter = "dd MMM HH:mm".localisedFormatter(config)

public fun Instant.Companion.dateFormatter(
  config: TimestampConfig = TimestampConfig.Default,
): DateTimeFormatter = "dd MMM yyyy".localisedFormatter(config)

public fun Instant.Companion.fullFormatter(
  config: TimestampConfig = TimestampConfig.Default,
): DateTimeFormatter = "dd MMM yyyy HH:mm:ss z".localisedFormatter(config)

public fun Instant.Companion.isoFormatter(
  config: TimestampConfig = TimestampConfig.Default,
): DateTimeFormatter = "yyyy-MM-dd HH:mm:ss z".localisedFormatter(config)
