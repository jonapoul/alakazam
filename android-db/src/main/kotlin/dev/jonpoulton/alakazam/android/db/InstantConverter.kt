package dev.jonpoulton.alakazam.android.db

import androidx.room.TypeConverter
import kotlinx.datetime.Instant

object InstantConverter {
  @TypeConverter
  fun fromString(string: String?): Instant? = string?.let(Instant::parse)

  @TypeConverter
  fun toString(instant: Instant?): String? = instant?.toString()
}
