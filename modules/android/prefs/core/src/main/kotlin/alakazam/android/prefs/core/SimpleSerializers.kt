package alakazam.android.prefs.core

import com.fredporciuncula.flow.preferences.NullableSerializer
import com.fredporciuncula.flow.preferences.Serializer

public abstract class SimpleNullableStringSerializer<T : Any>(
  private val constructor: (String) -> T,
) : NullableSerializer<T> {
  override fun deserialize(serialized: String?): T? = serialized?.let { constructor(it) }

  override fun serialize(value: T?): String? = value?.toString()
}

public abstract class SimpleStringSerializer<T : Any>(private val constructor: (String) -> T) : Serializer<T> {
  override fun deserialize(serialized: String): T = constructor(serialized)

  override fun serialize(value: T): String = value.toString()
}
