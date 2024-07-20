package alakazam.kotlin.time

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toJavaInstant
import kotlinx.datetime.toLocalDateTime
import java.time.format.DateTimeFormatter

public fun Instant.format(format: String): String = format(format.localisedFormatter)

public fun Instant.format(formatter: DateTimeFormatter): String = formatter.format(toJavaInstant())

public fun Instant.formatFull(): String = format(FullFormatter)

public fun Instant.formatReduced(now: Instant = Clock.System.now()): String {
  val zone = TimeZone.currentSystemDefault()
  val timeLocal = toLocalDateTime(zone)
  val nowLocal = now.toLocalDateTime(zone)
  val javaInstant = toJavaInstant()
  return when {
    nowLocal.year != timeLocal.year -> DateFormatter.format(javaInstant)
    nowLocal.date != timeLocal.date -> ThisYearFormatter.format(javaInstant)
    else -> TodayFormatter.format(javaInstant)
  }
}

public val TodayFormatter: DateTimeFormatter = "HH:mm".localisedFormatter
public val ThisYearFormatter: DateTimeFormatter = "dd MMM HH:mm".localisedFormatter
public val DateFormatter: DateTimeFormatter = "dd MMM yyyy".localisedFormatter
public val FullFormatter: DateTimeFormatter = "dd MMM yyyy HH:mm:ss z".localisedFormatter
public val IsoFormatter: DateTimeFormatter = "yyyy-MM-dd HH:mm:ss z".localisedFormatter
