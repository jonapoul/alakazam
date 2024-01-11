package dev.jonpoulton.alakazam.kotlin.serialization

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

abstract class SimpleSerializer<T : Any>(serialName: String, private val constructor: (String) -> T) : KSerializer<T> {
  override val descriptor = PrimitiveSerialDescriptor(serialName, PrimitiveKind.STRING)

  override fun serialize(encoder: Encoder, value: T) {
    encoder.encodeString(value.toString())
  }

  override fun deserialize(decoder: Decoder): T {
    return constructor.invoke(decoder.decodeString())
  }
}
