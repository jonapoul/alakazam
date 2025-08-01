package alakazam.db.room

import androidx.room.TypeConverter
import kotlin.time.Instant

public object InstantConverter {
  @TypeConverter
  public fun fromString(string: String?): Instant? = string?.let(Instant::parse)

  @TypeConverter
  public fun toString(instant: Instant?): String? = instant?.toString()
}
