/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.db.sqldelight

import app.cash.sqldelight.db.SqlDriver

public fun interface SqlDriverFactory {
  public fun create(): SqlDriver
}
