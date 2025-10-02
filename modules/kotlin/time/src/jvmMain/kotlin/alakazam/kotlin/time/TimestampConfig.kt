/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
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
