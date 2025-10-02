/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.test.sqldelight

import app.cash.sqldelight.Query
import kotlin.test.assertEquals
import kotlin.test.assertNull

public fun <T : Any> assertEmpty(query: Query<T>) {
  assertEquals(expected = 0, actual = query.executeAsList().size)
}

public fun <T : Any> assertNull(query: Query<T>) {
  assertNull(query.executeAsOneOrNull())
}
