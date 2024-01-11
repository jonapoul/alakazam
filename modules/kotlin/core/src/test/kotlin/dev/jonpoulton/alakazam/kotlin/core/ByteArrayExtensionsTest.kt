package dev.jonpoulton.alakazam.kotlin.core

import org.junit.Assert.assertThrows
import org.junit.Test
import kotlin.test.assertEquals

class ByteArrayExtensionsTest {
  @Test
  fun `To hex string`() {
    val bytes = byteArray(0x12, 0x34, 0x56, 0x78, 0x90, 0xAB, 0xCD, 0xEF)
    assertEquals(
      expected = "1234567890ABCDEF",
      actual = bytes.toHexString(separator = ""),
    )
    assertEquals(
      expected = "12  34  56  78  90  AB  CD  EF",
      actual = bytes.toHexString(separator = "  "),
    )
  }

  @Test
  fun `To MAC address`() {
    val bytes = byteArray(0x12, 0x34, 0x56, 0x78, 0x90, 0xAB) // 6 elements
    assertEquals(
      expected = "12:34:56:78:90:AB",
      actual = bytes.toMacAddress(),
    )
    assertEquals(
      expected = "12-34-56-78-90-AB",
      actual = bytes.toMacAddress(separator = "-"),
    )
  }

  @Test
  fun `Throw if not 6 MAC bytes`() {
    assertThrows(IllegalStateException::class.java) {
      byteArray().toMacAddress() // 0 elements
    }
    assertThrows(IllegalStateException::class.java) {
      byteArray(0x12, 0x34, 0x56, 0x78, 0x90).toMacAddress() // 5 elements
    }
    assertThrows(IllegalStateException::class.java) {
      byteArray(0x12, 0x34, 0x56, 0x78, 0x90, 0xAB, 0xCD).toMacAddress() // 7 elements
    }
  }

  private fun byteArray(vararg ints: Int): ByteArray {
    return ints.asList().map { it.toByte() }.toByteArray()
  }
}
