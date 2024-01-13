package dev.jonpoulton.alakazam.android.db

import androidx.room.TypeConverter
import kotlinx.datetime.Instant

public object InstantConverter {
  @TypeConverter
  public fun fromString(string: String?): Instant? = string?.let(Instant::parse)

  @TypeConverter
  public fun toString(instant: Instant?): String? = instant?.toString()
}
