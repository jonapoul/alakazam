package dev.jonpoulton.alakazam.test.core

import org.junit.Test
import kotlin.test.assertEquals

internal class ResourceUtilsTest {
  @Test
  fun `Get resource as stream`() {
    val stream = getResourceAsStream(filename = "resource.txt")
    val contents = stream.bufferedReader().use { it.readText() }
    assertEquals(expected = "hello world", actual = contents)
  }

  @Test(expected = IllegalStateException::class)
  fun `Fail getting nonexistent resource as stream`() {
    getResourceAsStream(filename = "i-dont-exist.txt")
  }
}
