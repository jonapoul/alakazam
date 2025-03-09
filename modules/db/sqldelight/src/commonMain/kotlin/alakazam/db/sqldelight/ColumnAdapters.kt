package alakazam.db.sqldelight

import alakazam.kotlin.core.parse
import app.cash.sqldelight.ColumnAdapter
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonObject

public fun <T : Any> longAdapter(
  decode: (Long) -> T,
  encode: (T) -> Long,
): ColumnAdapter<T, Long> = object : ColumnAdapter<T, Long> {
  override fun encode(value: T): Long = encode.invoke(value)
  override fun decode(databaseValue: Long): T = decode.invoke(databaseValue)
}

public fun <T : Any> stringAdapter(
  decode: (String) -> T,
  encode: (T) -> String,
): ColumnAdapter<T, String> = object : ColumnAdapter<T, String> {
  override fun encode(value: T): String = encode.invoke(value)
  override fun decode(databaseValue: String): T = decode.invoke(databaseValue)
}

public fun <T : Any> stringAdapter(decode: (String) -> T): ColumnAdapter<T, String> =
  stringAdapter(decode, encode = { it.toString() })

public inline fun <reified E : Enum<E>> enumStringAdapter(): ColumnAdapter<E, String> =
  stringAdapter { E::class.parse(it) }

public inline fun <reified E : Enum<E>> enumLongAdapter(): ColumnAdapter<E, Long> =
  longAdapter(decode = E::class::parse, encode = { it.ordinal.toLong() })

public fun jsonObjectAdapter(json: Json = Json): ColumnAdapter<JsonObject, String> =
  object : ColumnAdapter<JsonObject, String> {
    override fun encode(value: JsonObject): String = json.encodeToString(value)
    override fun decode(databaseValue: String): JsonObject = json.parseToJsonElement(databaseValue).jsonObject
  }

public fun <T : Any> jsonObjectAdapter(serializer: KSerializer<T>, json: Json = Json): ColumnAdapter<T, String> =
  object : ColumnAdapter<T, String> {
    override fun encode(value: T): String = json.encodeToString(serializer, value)
    override fun decode(databaseValue: String): T = json.decodeFromString(serializer, databaseValue)
  }
