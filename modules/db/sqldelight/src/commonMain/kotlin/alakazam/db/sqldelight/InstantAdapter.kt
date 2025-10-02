/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.db.sqldelight

import app.cash.sqldelight.ColumnAdapter
import kotlin.time.Instant

public interface InstantAdapter<T : Any> : ColumnAdapter<Instant, T> {
  public data object FromMilliseconds :
    InstantAdapter<Long>,
    ColumnAdapter<Instant, Long> by longAdapter(Instant.Companion::fromEpochMilliseconds, Instant::toEpochMilliseconds)

  public data object FromISO8601 :
    InstantAdapter<String>,
    ColumnAdapter<Instant, String> by stringAdapter(Instant.Companion::parse)
}
