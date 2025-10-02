/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.serialization

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public inline fun <reified E> enumStringSerializer(
  ignoreCase: Boolean = false,
): KSerializer<E> where E : Enum<E>, E : SerializableByString {
  return object : KSerializer<E> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("Enum", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): E {
      val decoded = decoder.decodeString()
      val values = enumValues<E>()
      return values
        .firstOrNull { it.value.equals(decoded, ignoreCase = ignoreCase) }
        ?: throw SerializationException("No value matching $decoded in $values with ignoreCase=$ignoreCase")
    }

    override fun serialize(encoder: Encoder, value: E) {
      encoder.encodeString(value.value)
    }
  }
}

public interface SerializableByString {
  public val value: String
}
