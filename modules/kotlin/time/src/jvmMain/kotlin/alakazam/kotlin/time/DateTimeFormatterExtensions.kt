package alakazam.kotlin.time

import java.time.format.DateTimeFormatter

public fun DateTimeFormatter.localised(
  config: TimestampConfig = TimestampConfig.Default,
): DateTimeFormatter = withZone(config.zoneId).withLocale(config.locale)

public fun String.localisedFormatter(
  config: TimestampConfig = TimestampConfig.Default,
): DateTimeFormatter = DateTimeFormatter.ofPattern(this).localised(config)
