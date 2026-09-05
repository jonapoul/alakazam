package alakazam.kotlin

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.builtins.nullable
import kotlinx.serialization.json.Json
import org.junit.Test

@OptIn(ExperimentalSerializationApi::class)
internal class EnumStringSerializerTest {
  @Serializable(with = TestEnumSerializer::class)
  private enum class TestEnum(override val value: String) : SerializableByString {
    A(value = "a"),
    B(value = "b"),
    C(value = "c"),
    SomethingElse(value = "another-value"),
  }

  private object TestEnumSerializer : KSerializer<TestEnum> by enumStringSerializer<TestEnum>()

  @Serializable
  private data class TestPojo(
    val a: TestEnum,
    val b: TestEnum,
    val nullable: TestEnum?,
  )

  @Test
  fun `Serialize and deserialize`() {
    val pojo = TestPojo(a = TestEnum.A, b = TestEnum.SomethingElse, nullable = null)
    val prettyJson = Json {
      prettyPrint = true
      prettyPrintIndent = "  "
      explicitNulls = false
    }

    val serialized = prettyJson.encodeToString(TestPojo.serializer(), pojo)
    assertEquals(
      actual = serialized,
      expected =
        """
        {
          "a": "a",
          "b": "another-value"
        }
        """
          .trimIndent(),
    )

    val deserialized = prettyJson.decodeFromString<TestPojo>(serialized)
    assertEquals(expected = pojo, actual = deserialized)
  }

  @Serializable(with = FallbackEnumSerializer::class)
  private enum class FallbackEnum(override val value: String) : SerializableByString {
    One(value = "one"),
    Two(value = "two"),
    Unknown(value = "unknown"),
  }

  private object FallbackEnumSerializer :
    KSerializer<FallbackEnum> by enumStringSerializer<FallbackEnum>(fallback = FallbackEnum.Unknown)

  @Serializable private data class FallbackPojo(val a: FallbackEnum, val b: FallbackEnum)

  @Test
  fun `Unrecognised value deserializes to the fallback`() {
    val deserialized =
      Json.decodeFromString(FallbackPojo.serializer(), """{"a":"one","b":"not-a-real-value"}""")
    assertEquals(
      expected = FallbackPojo(a = FallbackEnum.One, b = FallbackEnum.Unknown),
      actual = deserialized,
    )
  }

  @Test
  fun `Unrecognised value throws when no fallback is given`() {
    val serializer = enumStringSerializer<FallbackEnum>()
    assertTrue(
      throwsSpecific<SerializationException> {
        Json.decodeFromString(serializer, """"not-a-real-value"""")
      }
    )
  }

  @Test
  fun `Fallback is unused when the value matches`() {
    val pojo = FallbackPojo(a = FallbackEnum.One, b = FallbackEnum.Two)
    val serialized = Json.encodeToString(FallbackPojo.serializer(), pojo)
    assertEquals(expected = """{"a":"one","b":"two"}""", actual = serialized)
    assertEquals(
      expected = pojo,
      actual = Json.decodeFromString(FallbackPojo.serializer(), serialized),
    )
  }

  @Test
  fun `Fallback entry round-trips using its own value`() {
    val pojo = FallbackPojo(a = FallbackEnum.Unknown, b = FallbackEnum.Two)
    val serialized = Json.encodeToString(FallbackPojo.serializer(), pojo)
    assertEquals(expected = """{"a":"unknown","b":"two"}""", actual = serialized)
    assertEquals(
      expected = pojo,
      actual = Json.decodeFromString(FallbackPojo.serializer(), serialized),
    )
  }

  @Test
  fun `Fallback applies after a case sensitive miss`() {
    val serializer = enumStringSerializer<FallbackEnum>(fallback = FallbackEnum.Unknown)
    assertEquals(
      expected = FallbackEnum.Unknown,
      actual = Json.decodeFromString(serializer, """"ONE""""),
    )
  }

  @Test
  fun `Fallback is unused when ignoreCase matches`() {
    val serializer =
      enumStringSerializer<FallbackEnum>(ignoreCase = true, fallback = FallbackEnum.Unknown)
    assertEquals(
      expected = FallbackEnum.One,
      actual = Json.decodeFromString(serializer, """"ONE""""),
    )
    assertEquals(
      expected = FallbackEnum.Unknown,
      actual = Json.decodeFromString(serializer, """"not-a-real-value""""),
    )
  }

  @Test
  fun `Null is not replaced by the fallback`() {
    val serializer = enumStringSerializer<FallbackEnum>(fallback = FallbackEnum.Unknown).nullable
    assertEquals(expected = null, actual = Json.decodeFromString(serializer, "null"))
    assertEquals(
      expected = FallbackEnum.Unknown,
      actual = Json.decodeFromString(serializer, """"not-a-real-value""""),
    )
  }
}
