package alakazam.test.room

import alakazam.kotlin.core.ifTrue
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.test.core.app.ApplicationProvider
import org.junit.rules.TestWatcher
import org.junit.runner.Description
import kotlin.reflect.KClass

public class RoomDatabaseRule<DB : RoomDatabase>(
  private val databaseClass: KClass<DB>,
  private val allowMainThread: Boolean = false,
) : TestWatcher() {
  private var nullableDatabase: DB? = null

  public val database: DB
    get() = nullableDatabase ?: throw AssertionError("Database is null!")

  override fun starting(description: Description) {
    super.starting(description)
    val context = ApplicationProvider.getApplicationContext<Context>()
    nullableDatabase = Room
      .inMemoryDatabaseBuilder(context, databaseClass.java)
      .ifTrue(allowMainThread) { allowMainThreadQueries() }
      .build()
  }

  override fun finished(description: Description) {
    super.finished(description)
    nullableDatabase?.close()
    nullableDatabase = null
  }
}
