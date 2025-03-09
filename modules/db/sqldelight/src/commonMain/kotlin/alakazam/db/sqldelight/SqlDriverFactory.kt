package alakazam.db.sqldelight

import app.cash.sqldelight.db.SqlDriver

public fun interface SqlDriverFactory {
  public fun create(): SqlDriver
}
