package alakazam.kotlin.json

import alakazam.kotlin.serialization.SerializableByString
import alakazam.kotlin.serialization.enumStringSerializer
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import org.junit.Test
import kotlin.test.assertEquals

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
      expected = """
        {
          "a": "a",
          "b": "another-value"
        }
      """.trimIndent(),
    )

    val deserialized = prettyJson.decodeFromString<TestPojo>(serialized)
    assertEquals(expected = pojo, actual = deserialized)
  }
}
