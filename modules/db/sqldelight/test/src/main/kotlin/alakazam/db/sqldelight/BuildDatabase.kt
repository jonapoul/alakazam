/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.db.sqldelight

import alakazam.db.sqldelight.test.Longs
import alakazam.db.sqldelight.test.Strings
import alakazam.db.sqldelight.test.TestDatabase
import app.cash.sqldelight.db.SqlDriver

internal fun buildDatabase(driver: SqlDriver): TestDatabase = TestDatabase(
  driver = driver,
  longsAdapter = Longs.Adapter(
    idAdapter = longAdapter(::TestId, TestId::value),
    instantAdapter = InstantAdapter.FromMilliseconds,
    enum_Adapter = enumLongAdapter(),
  ),
  stringsAdapter = Strings.Adapter(
    idAdapter = UuidAdapter,
    instantAdapter = InstantAdapter.FromISO8601,
    nullableInstantAdapter = InstantAdapter.FromISO8601,
    enum_Adapter = enumStringAdapter(),
    jsonObjectAdapter = jsonObjectAdapter(),
    nullableJsonObjectAdapter = jsonObjectAdapter(),
    deserializedJsonObjectAdapter = jsonObjectAdapter(MyJsonClass.serializer()),
  ),
)
