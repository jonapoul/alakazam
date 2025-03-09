package alakazam.db.sqldelight

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

@JvmInline
public value class TestId(public val value: Long)

public enum class TestEnum { A, B, C, }

@Serializable
public data class MyJsonClass(
  val int: Int,
  val double: Double,
  val subObject: JsonObject,
)
