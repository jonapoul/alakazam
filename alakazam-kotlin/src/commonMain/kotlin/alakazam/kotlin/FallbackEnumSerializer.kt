package alakazam.kotlin

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.serializer
import kotlin.enums.EnumEntries
import kotlin.enums.enumEntries

/**
 * Decorates the serializer of the enum [E] so that any value which can't be recognised is decoded as [fallback],
 * instead of throwing.
 *
 * Encoding is delegated to the format via [Encoder.encodeEnum]/[Decoder.decodeEnum], so entries are represented
 * however the format represents enums. That means [kotlinx.serialization.SerialName] on each entry is respected by
 * JSON, while a format like protobuf still uses the entry's ordinal.
 *
 * ```kotlin
 * @Serializable
 * enum class Colour {
 *   @SerialName("red") Red,
 *   @SerialName("green") Green,
 *   Unknown,
 * }
 *
 * object ColourSerializer : KSerializer<Colour> by fallbackEnumSerializer(fallback = Colour.Unknown)
 * ```
 *
 * [delegate] is only used for its descriptor, and defaults to the enum's generated serializer. So [E] itself must not
 * be annotated with `@Serializable(with = ...)` pointing back at this serializer, otherwise resolving the descriptor
 * recurses. Instead, apply the serializer at the use site, or pass the generated serializer explicitly.
 *
 * Use [kotlinx.serialization.builtins.nullable] if the property being decoded is also nullable.
 */
public inline fun <reified E : Enum<E>> fallbackEnumSerializer(
  fallback: E,
  delegate: KSerializer<E> = serializer(),
): KSerializer<E> = FallbackEnumSerializer(
  fallback = fallback,
  entries = enumEntries<E>(),
  descriptor = delegate.descriptor,
)

@PublishedApi
internal class FallbackEnumSerializer<E : Enum<E>>(
  private val fallback: E,
  private val entries: EnumEntries<E>,
  override val descriptor: SerialDescriptor,
) : KSerializer<E> {
  override fun serialize(encoder: Encoder, value: E) {
    encoder.encodeEnum(enumDescriptor = descriptor, index = value.ordinal)
  }

  override fun deserialize(decoder: Decoder): E {
    // Formats are inconsistent here. Some throw for an unknown entry, others report an out-of-bounds index.
    val index = try {
      decoder.decodeEnum(enumDescriptor = descriptor)
    } catch (_: SerializationException) {
      return fallback
    }

    return entries.getOrNull(index) ?: fallback
  }
}
