package alakazam.kotlin.time

import java.time.ZoneId
import java.util.Locale

public data class TimestampConfig(val zoneId: ZoneId, val locale: Locale) {
  public companion object {
    public val Default: TimestampConfig
      get() = TimestampConfig(
        zoneId = ZoneId.systemDefault(),
        locale = Locale.getDefault(),
      )
  }
}
