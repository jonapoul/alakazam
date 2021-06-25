package com.jonapoul.extensions.bytes

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class ByteArrayExtensionsTest {
    @Test
    fun `To hex string`() {
        val bytes = byteArray(0x12, 0x34, 0x56, 0x78, 0x90, 0xAB, 0xCD, 0xEF)
        assertEquals(
            "1234567890ABCDEF",
            bytes.toHexString(separator = "")
        )
        assertEquals(
            "12  34  56  78  90  AB  CD  EF",
            bytes.toHexString(separator = "  ")
        )
    }

    @Test
    fun `To MAC address`() {
        val bytes = byteArray(0x12, 0x34, 0x56, 0x78, 0x90, 0xAB) // 6 elements
        assertEquals(
            "12:34:56:78:90:AB",
            bytes.toMacAddress()
        )
        assertEquals(
            "12-34-56-78-90-AB",
            bytes.toMacAddress(separator = "-")
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
