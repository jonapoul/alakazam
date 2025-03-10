package alakazam.kotlin.serialization

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@Suppress("UnnecessaryAbstractClass")
public abstract class SimpleSerializer<T : Any>(
  serialName: String,
  private val constructor: (String) -> T,
) : KSerializer<T> {
  override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor(serialName, PrimitiveKind.STRING)

  override fun serialize(encoder: Encoder, value: T) {
    encoder.encodeString(value.toString())
  }

  override fun deserialize(decoder: Decoder): T = constructor(decoder.decodeString())
}
