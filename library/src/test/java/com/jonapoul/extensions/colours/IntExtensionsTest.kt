package com.jonapoul.extensions.colours

import org.junit.Assert.assertEquals
import org.junit.Test

class IntExtensionsTest {
    private val red = 0xFFFF0000.toInt()
    private val white = 0xFFFFFFFF.toInt()
    private val black = 0xFF000000.toInt()

    @Test
    fun `Alpha extension`() {
        assertEquals(255, 0xFF000000.toInt().alpha())
        assertEquals(128, 0x80000000.toInt().alpha())
        assertEquals(0, 0x00000000.alpha())
    }

    @Test
    fun `Red extension`() {
        assertEquals(255, 0x00FF0000.red())
        assertEquals(128, 0x00800000.red())
        assertEquals(0, 0x00000000.red())
        assertEquals(255, 0xFFFF0000.toInt().red())
        assertEquals(128, 0xFF800000.toInt().red())
        assertEquals(0, 0xFF000000.toInt().red())
    }

    @Test
    fun `Green extension`() {
        assertEquals(255, 0x0000FF00.green())
        assertEquals(128, 0x00008000.green())
        assertEquals(0, 0x00000000.green())
        assertEquals(255, 0xFF00FF00.toInt().green())
        assertEquals(128, 0xFF008000.toInt().green())
        assertEquals(0, 0xFF000000.toInt().green())
    }

    @Test
    fun `Blue extension`() {
        assertEquals(255, 0x000000FF.blue())
        assertEquals(128, 0x00000080.blue())
        assertEquals(0, 0x00000000.blue())
        assertEquals(255, 0xFF0000FF.toInt().blue())
        assertEquals(128, 0xFF000080.toInt().blue())
        assertEquals(0, 0xFF000000.toInt().blue())
    }

    @Test
    fun `Lighten colours`() {
        assertEquals(black, black.lighten(0.0f))
        assertEquals(white, black.lighten(1.0f))
        assertEquals(white, white.lighten(0.0f))
        assertEquals(white, white.lighten(1.0f))
        assertEquals(red, red.lighten(0.0f))
        assertEquals(white, red.lighten(1.0f))
    }

    @Test
    fun `Darken colours`() {
        assertEquals(black, black.darken(0.0f))
        assertEquals(black, black.darken(1.0f))
        assertEquals(white, white.darken(0.0f))
        assertEquals(black, white.darken(1.0f))
        assertEquals(red, red.darken(0.0f))
        assertEquals(black, red.darken(1.0f))
    }
}
