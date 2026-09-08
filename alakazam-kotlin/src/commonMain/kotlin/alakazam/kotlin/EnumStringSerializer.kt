package alakazam.kotlin

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.PrimitiveKind.STRING
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public inline fun <reified E> enumStringSerializer(
  ignoreCase: Boolean = false,
  fallback: E? = null,
): KSerializer<E> where E : Enum<E>, E : SerializableByString =
  EnumStringSerializer(
    serialName = requireNotNull(E::class.qualifiedName),
    enumValues = enumValues<E>(),
    ignoreCase = ignoreCase,
    fallback = fallback,
  )

public class EnumStringSerializer<E>(
  serialName: String,
  private val enumValues: Array<E>,
  private val ignoreCase: Boolean,
  private val fallback: E?,
) : KSerializer<E> where E : Enum<E>, E : SerializableByString {
  override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor(serialName, kind = STRING)

  override fun deserialize(decoder: Decoder): E {
    val decoded = decoder.decodeString()
    return enumValues.firstOrNull { it.value.equals(decoded, ignoreCase = ignoreCase) }
      ?: fallback
      ?: throw SerializationException(
        "No value matching $decoded in ${enumValues.contentToString()} with ignoreCase=$ignoreCase"
      )
  }

  override fun serialize(encoder: Encoder, value: E) {
    encoder.encodeString(value.value)
  }
}

public interface SerializableByString {
  public val value: String
}
