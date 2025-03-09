package alakazam.test.sqldelight

import alakazam.db.sqldelight.JvmSqlDriverFactory
import alakazam.db.sqldelight.SqlDriverFactory
import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.db.SqlSchema
import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver
import java.io.File

public fun inMemoryDriverFactory(
  schema: SqlSchema<QueryResult.Value<Unit>>,
): SqlDriverFactory = JvmSqlDriverFactory(JdbcSqliteDriver.IN_MEMORY, schema)

public fun fileDriverFactory(
  file: File,
  schema: SqlSchema<QueryResult.Value<Unit>>,
): SqlDriverFactory = JvmSqlDriverFactory(url = "jdbc:sqlite:${file.absolutePath}", schema)

public fun <DB> SqlDelightDatabaseRule.Companion.inMemory(
  schema: SqlSchema<QueryResult.Value<Unit>>,
  buildDatabase: (SqlDriver) -> DB,
): SqlDelightDatabaseRule<DB> = SqlDelightDatabaseRule(inMemoryDriverFactory(schema), buildDatabase)

public fun <DB> SqlDelightDatabaseRule.Companion.fromFile(
  file: File,
  schema: SqlSchema<QueryResult.Value<Unit>>,
  buildDatabase: (SqlDriver) -> DB,
): SqlDelightDatabaseRule<DB> = SqlDelightDatabaseRule(fileDriverFactory(file, schema), buildDatabase)
