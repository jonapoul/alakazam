package alakazam.test

import kotlin.test.assertEquals
import org.junit.Test

internal class LoopControllerTest {
  @Test
  fun `Run 10 loops`() {
    val controller = FiniteLoopController(maxLoops = 10)
    var numLoops = 0
    while (controller.shouldLoop()) {
      numLoops++
    }
    assertEquals(expected = 10, actual = numLoops)
  }

  @Test
  fun `Run one loop`() {
    val controller = SingleLoopController()
    var numLoops = 0
    while (controller.shouldLoop()) {
      numLoops++
    }
    assertEquals(expected = 1, actual = numLoops)
  }
}
