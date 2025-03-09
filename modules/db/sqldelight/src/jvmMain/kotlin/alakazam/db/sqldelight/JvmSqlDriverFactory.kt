package alakazam.db.sqldelight

import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlSchema
import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver
import java.util.Properties

public class JvmSqlDriverFactory(
  private val url: String,
  private val schema: SqlSchema<QueryResult.Value<Unit>>,
  private val useForeignKeys: Boolean = true,
) : SqlDriverFactory {
  override fun create(): JdbcSqliteDriver = JdbcSqliteDriver(
    url = url,
    schema = schema,
    properties = Properties().apply {
      put("foreign_keys", "$useForeignKeys")
    },
  )
}
