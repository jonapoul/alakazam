package com.jonapoul.alakazam.prefs

import com.fredporciuncula.flow.preferences.NullableSerializer
import com.fredporciuncula.flow.preferences.Serializer

abstract class SimpleNullableStringSerializer<T : Any>(private val constructor: (String) -> T) : NullableSerializer<T> {
  override fun deserialize(serialized: String?): T? = serialized?.let { constructor.invoke(it) }
  override fun serialize(value: T?): String? = value?.toString()
}

abstract class SimpleStringSerializer<T : Any>(private val constructor: (String) -> T) : Serializer<T> {
  override fun deserialize(serialized: String): T = constructor.invoke(serialized)
  override fun serialize(value: T): String = value.toString()
}
