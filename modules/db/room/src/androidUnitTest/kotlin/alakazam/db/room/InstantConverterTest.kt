package alakazam.db.room

import alakazam.test.room.RoomDatabaseRule
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import kotlinx.coroutines.test.runTest
import kotlinx.datetime.Instant
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import kotlin.test.assertEquals

@Entity
internal data class TestInstantEntity(
  @PrimaryKey(autoGenerate = true) val id: Long = 0L,
  val instant: Instant,
  val nullableInstant: Instant?,
)

@Dao
internal interface TestInstantDao {
  @Insert
  suspend fun insert(vararg entities: TestInstantEntity)

  @Query("SELECT * FROM TestInstantEntity")
  suspend fun getAll(): List<TestInstantEntity>
}

@Database(version = 1, entities = [TestInstantEntity::class], exportSchema = false)
@TypeConverters(InstantConverter::class)
internal abstract class TestInstantDatabase : RoomDatabase() {
  abstract fun dao(): TestInstantDao
}

@RunWith(RobolectricTestRunner::class)
internal class InstantConverterTest {
  @get:Rule
  val databaseRule = RoomDatabaseRule(databaseClass = TestInstantDatabase::class)

  private lateinit var dao: TestInstantDao

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
  fun oneEntityWithoutNullableInstant() = runTest {
    // Given one entity inserted
    val entity = TestInstantEntity(
      id = 1L,
      instant = INSTANT,
      nullableInstant = null,
    )
    dao.insert(entity)

    // When all entities are fetched
    val entities = dao.getAll()

    // Then we have no entities (and the converter didn't throw a fit)
    assertEquals(expected = listOf(entity), actual = entities)
  }

  @Test
  fun oneEntityWithNullableInstant() = runTest {
    // Given one entity inserted
    val entity = TestInstantEntity(
      id = 1L,
      instant = INSTANT,
      nullableInstant = INSTANT,
    )
    dao.insert(entity)

    // When all entities are fetched
    val entities = dao.getAll()

    // Then we have no entities (and the converter didn't throw a fit)
    assertEquals(expected = listOf(entity), actual = entities)
  }

  private companion object {
    val INSTANT = Instant.fromEpochMilliseconds(1681641138112L) // Sun Apr 16 2023 10:32:18 UTC
  }
}
