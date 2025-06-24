package alakazam.db.sqldelight

import alakazam.db.sqldelight.test.Strings
import alakazam.db.sqldelight.test.TestDatabase
import alakazam.test.sqldelight.SqlDelightDatabaseRule
import alakazam.test.sqldelight.inMemory
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.time.Instant
import kotlin.uuid.Uuid

internal class StringAdaptersTest {
  @get:Rule
  val databaseRule = SqlDelightDatabaseRule.inMemory(TestDatabase.Schema, ::buildDatabase)

  private lateinit var db: TestDatabase

  @Before
  fun before() {
    db = databaseRule.database
  }

  @Test
  fun `Read and write data`() = runTest {
    val id = Uuid.parse("44cffb97-00f3-4ef5-ae29-c48b1258ec4f")
    val instant = Instant.fromEpochMilliseconds(1741528094914L) // Sun Mar 09 2025 13:48:14.914
    val testEnum = TestEnum.B

    val jsonObject = buildJsonObject {
      put("bool", true)
      put("string", "abc")
      put("int", 123)
    }

    val myDataClass = MyJsonClass(int = 789, double = 1.23, subObject = jsonObject)

    db.stringsQueries.insert(
      id = id,
      instant = instant,
      nullableInstant = null,
      enum_ = testEnum,
      jsonObject = jsonObject,
      nullableJsonObject = null,
      deserializedJsonObject = myDataClass,
    )

    assertEquals(
      expected = Strings(id, instant, null, testEnum, jsonObject, null, myDataClass),
      actual = db.stringsQueries.getFirst().executeAsOneOrNull(),
    )
  }
}
