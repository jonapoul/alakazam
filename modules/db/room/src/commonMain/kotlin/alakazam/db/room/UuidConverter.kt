package alakazam.db.room

import androidx.room.TypeConverter
import kotlin.uuid.Uuid

public object UuidConverter {
  @TypeConverter
  public fun fromString(string: String?): Uuid? = string?.let(Uuid::parse)

  @TypeConverter
  public fun toString(uuid: Uuid?): String? = uuid?.toString()
}
