package com.jonapoul.extensions.colours

import org.junit.Assert.*
import org.junit.Test

class ColoursTest {
    @Test
    fun `ARGB colours`() {
        /* Black */
        assertEquals(
            0xFF000000.toInt(),
            argbColour(
                alpha = 255,
                red = 0,
                green = 0,
                blue = 0
            )
        )
        /* White */
        assertEquals(
            0xFFFFFFFF.toInt(),
            argbColour(
                alpha = 255,
                red = 255,
                green = 255,
                blue = 255
            )
        )
        /* Grey-ish blue */
        assertEquals(
            0xFFAABBCC.toInt(),
            argbColour(
                alpha = 255,
                red = 170,
                green = 187,
                blue = 204
            )
        )
    }

    @Test
    fun `Lerp black to white`() {
        /* Factor = 0.0 gives the start colour */
        assertEquals(
            0xFF000000.toInt(),
            lerpColours(
                start = 0xFF000000.toInt(),
                end = 0xFFFFFFFF.toInt(),
                factor = 0.0f
            )
        )
        /* Factor = 1.0 gives the end colour */
        assertEquals(
            0xFFFFFFFF.toInt(),
            lerpColours(
                start = 0xFF000000.toInt(),
                end = 0xFFFFFFFF.toInt(),
                factor = 1.0f
            )
        )
    }
}
