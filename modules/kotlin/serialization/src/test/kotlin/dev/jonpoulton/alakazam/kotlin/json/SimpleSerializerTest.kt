package dev.jonpoulton.alakazam.kotlin.json

import dev.jonpoulton.alakazam.kotlin.serialization.SimpleSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.junit.Test
import kotlin.test.assertEquals

class SimpleSerializerTest {
  @Serializable(with = FooSerializer::class)
  data class Foo(val data: String) {
    override fun toString(): String = data
  }

  object FooSerializer : SimpleSerializer<Foo>(serialName = "Foo", constructor = ::Foo)

  @Test
  fun `Basic serializer`() {
    val original = Foo(data = "abc123")

    val serialized = Json.encodeToString(original)
    assertEquals(expected = "\"abc123\"", actual = serialized)

    val deserialized = Json.decodeFromString<Foo>(serialized)
    assertEquals(expected = original, actual = deserialized)
  }
}
