/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.json

import alakazam.kotlin.serialization.SimpleSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import org.junit.Test
import kotlin.test.assertEquals

internal class SimpleSerializerTest {
  @Serializable(with = FooSerializer::class)
  private data class Foo(val data: String) {
    override fun toString(): String = data
  }

  private object FooSerializer : SimpleSerializer<Foo>(serialName = "Foo", constructor = ::Foo)

  @Test
  fun `Basic serializer`() {
    val original = Foo(data = "abc123")

    val serialized = Json.encodeToString(original)
    assertEquals(expected = "\"abc123\"", actual = serialized)

    val deserialized = Json.decodeFromString<Foo>(serialized)
    assertEquals(expected = original, actual = deserialized)
  }
}
