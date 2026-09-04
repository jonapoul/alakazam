package alakazam.kotlin

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.nullable
import kotlinx.serialization.json.Json
import org.junit.Test
import kotlin.test.assertEquals

@OptIn(ExperimentalSerializationApi::class)
internal class FallbackEnumSerializerTest {
  @Serializable
  private enum class TestEnum {
    @SerialName("a")
    A,

    @SerialName("b")
    B,

    @SerialName("another-value")
    SomethingElse,

    Unknown,
  }

  private object TestEnumSerializer : KSerializer<TestEnum> by fallbackEnumSerializer(fallback = TestEnum.Unknown)

  private val nullableSerializer = TestEnumSerializer.nullable

  @Serializable
  private data class TestPojo(
    @Serializable(with = TestEnumSerializer::class)
    val a: TestEnum,
    @Serializable(with = TestEnumSerializer::class)
    val b: TestEnum,
  )

  private val prettyJson = Json {
    prettyPrint = true
    prettyPrintIndent = "  "
  }

  @Test
  fun `Serialize and deserialize`() {
    val pojo = TestPojo(a = TestEnum.A, b = TestEnum.SomethingElse)

    val serialized = prettyJson.encodeToString(TestPojo.serializer(), pojo)
    assertEquals(
      actual = serialized,
      expected = """
        {
          "a": "a",
          "b": "another-value"
        }
      """.trimIndent(),
    )

    val deserialized = prettyJson.decodeFromString(TestPojo.serializer(), serialized)
    assertEquals(expected = pojo, actual = deserialized)
  }

  @Test
  fun `Unrecognised value deserializes to fallback`() {
    val deserialized = Json.decodeFromString(TestPojo.serializer(), """{"a":"a","b":"not-a-real-value"}""")
    assertEquals(expected = TestEnum.Unknown, actual = deserialized.b)
  }

  @Test
  fun `Fallback entry round-trips using its own name`() {
    val pojo = TestPojo(a = TestEnum.Unknown, b = TestEnum.B)
    val serialized = Json.encodeToString(TestPojo.serializer(), pojo)
    assertEquals(expected = """{"a":"Unknown","b":"b"}""", actual = serialized)
    assertEquals(expected = pojo, actual = Json.decodeFromString(TestPojo.serializer(), serialized))
  }

  @Test
  fun `Case insensitive decoding is handled by the format`() {
    val json = Json { decodeEnumsCaseInsensitive = true }
    val deserialized = json.decodeFromString(TestPojo.serializer(), """{"a":"A","b":"ANOTHER-VALUE"}""")
    assertEquals(expected = TestPojo(a = TestEnum.A, b = TestEnum.SomethingElse), actual = deserialized)
  }

  @Test
  fun `Null round-trips through nullable serializer`() {
    val serialized = Json.encodeToString(nullableSerializer, null)
    assertEquals(expected = "null", actual = serialized)
    assertEquals(expected = null, actual = Json.decodeFromString(nullableSerializer, serialized))
  }

  @Test
  fun `Unrecognised value deserializes to fallback through nullable serializer`() {
    val deserialized = Json.decodeFromString(nullableSerializer, """"not-a-real-value"""")
    assertEquals(expected = TestEnum.Unknown, actual = deserialized)
  }
}
