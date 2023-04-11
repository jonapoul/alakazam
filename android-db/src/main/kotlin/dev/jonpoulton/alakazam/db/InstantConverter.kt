package dev.jonpoulton.alakazam.db

import androidx.room.TypeConverter
import java.time.Instant

object InstantConverter {
  @TypeConverter
  fun fromString(string: String?): Instant? = string?.let(Instant::parse)

  @TypeConverter
  fun toString(instant: Instant?): String? = instant?.toString()
}
