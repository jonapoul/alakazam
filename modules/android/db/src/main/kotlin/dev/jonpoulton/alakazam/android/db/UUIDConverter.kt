package dev.jonpoulton.alakazam.android.db

import androidx.room.TypeConverter
import java.util.UUID

public object UUIDConverter {
  @TypeConverter
  public fun fromString(string: String?): UUID? = string?.let(UUID::fromString)

  @TypeConverter
  public fun toString(uuid: UUID?): String? = uuid?.toString()
}
