/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.db.sqldelight

import alakazam.db.sqldelight.test.Longs
import alakazam.db.sqldelight.test.TestDatabase
import alakazam.test.sqldelight.SqlDelightDatabaseRule
import alakazam.test.sqldelight.inMemory
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.time.Instant

internal class LongAdaptersTest {
  @get:Rule
  val databaseRule = SqlDelightDatabaseRule.inMemory(TestDatabase.Schema, ::buildDatabase)

  private lateinit var db: TestDatabase

  @Before
  fun before() {
    db = databaseRule.database
  }

  @Test
  fun `Read and write data`() = runTest {
    val id = TestId(value = 123)
    val testEnum = TestEnum.C
    val instant = Instant.fromEpochMilliseconds(1741528094914L) // Sun Mar 09 2025 13:48:14.914
    db.longsQueries.insert(id, instant, testEnum)

    assertEquals(
      expected = Longs(id, instant, testEnum),
      actual = db.longsQueries.getFirst().executeAsOneOrNull(),
    )
  }
}
