package alakazam.android.db

import alakazam.test.db.RoomDatabaseRule
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import java.util.UUID
import kotlin.test.assertEquals

@Entity
internal data class TestUuidEntity(
  @PrimaryKey(autoGenerate = true) val id: Long = 0L,
  val uuid: UUID,
  val nullableUuid: UUID?,
)

@Dao
internal interface TestUuidDao {
  @Insert
  suspend fun insert(vararg entities: TestUuidEntity)

  @Query("SELECT * FROM TestUUIDEntity")
  suspend fun getAll(): List<TestUuidEntity>
}

@Database(version = 1, entities = [TestUuidEntity::class], exportSchema = false)
@TypeConverters(UUIDConverter::class)
internal abstract class TestUuidDatabase : RoomDatabase() {
  abstract fun dao(): TestUuidDao
}

@RunWith(RobolectricTestRunner::class)
internal class UUIDConverterTest {
  @get:Rule
  val databaseRule = RoomDatabaseRule(databaseClass = TestUuidDatabase::class)

  private lateinit var dao: TestUuidDao

  @Before
  fun before() {
    dao = databaseRule.database.dao()
  }

  @Test
  fun noEntities() = runTest {
    // Given no entities inserted, when all entities are fetched
    val entities = dao.getAll()

    // Then we have no entities (and the converter didn't throw a fit)
    assertEquals(expected = emptyList(), actual = entities)
  }

  @Test
  fun oneEntityWithoutNullableUUID() = runTest {
    // Given one entity inserted
    val entity = TestUuidEntity(
      id = 1L,
      uuid = EXAMPLE_UUID,
      nullableUuid = null,
    )
    dao.insert(entity)

    // When all entities are fetched
    val entities = dao.getAll()

    // Then we have no entities (and the converter didn't throw a fit)
    assertEquals(expected = listOf(entity), actual = entities)
  }

  @Test
  fun oneEntityWithNullableUUID() = runTest {
    // Given one entity inserted
    val entity = TestUuidEntity(
      id = 1L,
      uuid = EXAMPLE_UUID,
      nullableUuid = EXAMPLE_UUID,
    )
    dao.insert(entity)

    // When all entities are fetched
    val entities = dao.getAll()

    // Then we have no entities (and the converter didn't throw a fit)
    assertEquals(expected = listOf(entity), actual = entities)
  }

  private companion object {
    val EXAMPLE_UUID: UUID = UUID.fromString("88e30e52-5e96-494a-a595-de8d8e4edfed")
  }
}
