package alakazam.kotlin.time

import kotlinx.datetime.TimeZone

public fun interface TimeZoneProvider {
  public fun get(): TimeZone

  public companion object {
    public val Default: TimeZoneProvider = TimeZoneProvider { TimeZone.currentSystemDefault() }
  }
}
