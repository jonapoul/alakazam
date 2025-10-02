/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.db.room

import androidx.room.TypeConverter
import kotlin.uuid.Uuid

public object UuidConverter {
  @TypeConverter
  public fun fromString(string: String?): Uuid? = string?.let(Uuid::parse)

  @TypeConverter
  public fun toString(uuid: Uuid?): String? = uuid?.toString()
}
