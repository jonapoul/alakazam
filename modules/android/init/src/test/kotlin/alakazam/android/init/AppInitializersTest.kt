package alakazam.android.init

import org.junit.Test
import kotlin.test.assertEquals

internal class AppInitializersTest {
  private lateinit var appInitializers: AppInitializers

  @Test
  fun `Initialiser going first`() {
    // Given
    var builderString = ""
    appInitializers = AppInitializers(
      setOf(
        initialiser(shouldGoFirst = false) { builderString += "A" },
        initialiser(shouldGoFirst = true) { builderString += "B" },
        initialiser(shouldGoFirst = false) { builderString += "C" },
      )
    )

    // When
    appInitializers.init()

    // Then
    assertEquals(expected = "BAC", actual = builderString)
  }

  private fun initialiser(shouldGoFirst: Boolean, block: () -> Unit): AppInitializer =
    object : AppInitializer {
      override fun shouldGoFirst(): Boolean = shouldGoFirst
      override fun init() = block.invoke()
    }
}
