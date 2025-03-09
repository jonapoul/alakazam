package alakazam.db.sqldelight

import app.cash.sqldelight.ColumnAdapter
import kotlinx.datetime.Instant

public interface InstantAdapter<T : Any> : ColumnAdapter<Instant, T> {
  public data object FromMilliseconds :
    InstantAdapter<Long>,
    ColumnAdapter<Instant, Long> by longAdapter(Instant.Companion::fromEpochMilliseconds, Instant::toEpochMilliseconds)

  public data object FromISO8601 :
    InstantAdapter<String>,
    ColumnAdapter<Instant, String> by stringAdapter(Instant.Companion::parse)
}
