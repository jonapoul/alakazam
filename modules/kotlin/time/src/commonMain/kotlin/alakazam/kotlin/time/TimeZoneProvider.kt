/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.time

import kotlinx.datetime.TimeZone

public fun interface TimeZoneProvider {
  public fun get(): TimeZone

  public companion object {
    public val Default: TimeZoneProvider = TimeZoneProvider { TimeZone.currentSystemDefault() }
  }
}
