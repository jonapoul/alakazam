package dev.jonpoulton.alakazam.android.init

import dev.jonpoulton.alakazam.android.init.AppInitialisers
import dev.jonpoulton.alakazam.android.init.IAppInitialiser
import org.junit.Test
import kotlin.test.assertEquals

class AppInitialisersTest {
  private lateinit var appInitialisers: AppInitialisers

  @Test
  fun `Initialiser going first`() {
    /* Given */
    var builderString = ""
    appInitialisers = AppInitialisers(
      setOf(
        initialiser(shouldGoFirst = false) { builderString += "A" },
        initialiser(shouldGoFirst = true) { builderString += "B" },
        initialiser(shouldGoFirst = false) { builderString += "C" },
      )
    )

    /* When */
    appInitialisers.init()

    /* Then */
    assertEquals(expected = "BAC", actual = builderString)
  }

  private fun initialiser(shouldGoFirst: Boolean, block: () -> Unit): IAppInitialiser =
    object : IAppInitialiser {
      override fun shouldGoFirst(): Boolean = shouldGoFirst
      override fun init() = block.invoke()
    }
}
