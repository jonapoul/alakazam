package alakazam.test.sqldelight

import alakazam.db.sqldelight.SqlDriverFactory
import app.cash.sqldelight.db.SqlDriver
import org.junit.rules.TestWatcher
import org.junit.runner.Description

public class SqlDelightDatabaseRule<DB>(
  private val driverFactory: SqlDriverFactory,
  private val buildDatabase: (SqlDriver) -> DB,
) : TestWatcher() {
  private var nullableDriver: SqlDriver? = null
  private var nullableDatabase: DB? = null

  public val driver: SqlDriver
    get() = nullableDriver ?: error("Driver is null!")

  public val database: DB
    get() = nullableDatabase ?: error("Database is null!")

  override fun starting(description: Description) {
    super.starting(description)
    nullableDriver = driverFactory.create()
    nullableDatabase = buildDatabase(driver)
  }

  override fun finished(description: Description) {
    super.finished(description)
    nullableDriver?.close()
    nullableDriver = null
    nullableDatabase = null
  }

  public companion object
}
