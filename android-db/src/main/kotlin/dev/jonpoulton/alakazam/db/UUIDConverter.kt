package dev.jonpoulton.alakazam.db

import androidx.room.TypeConverter
import java.util.UUID

object UUIDConverter {
  @TypeConverter
  fun fromString(string: String?): UUID? = string?.let(UUID::fromString)

  @TypeConverter
  fun toString(uuid: UUID?): String? = uuid?.toString()
}
