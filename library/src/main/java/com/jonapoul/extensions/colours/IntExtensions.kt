package com.jonapoul.extensions.colours

import androidx.annotation.ColorInt
import androidx.annotation.FloatRange

/**
 * Returns the alpha component of this [Int] as an ARGB value. Replication of
 * [android.graphics.Color.alpha] as an extension function.
 */
fun Int.alpha(): Int = this shr 24 and 0xFF

/**
 * Returns the red component of this [Int] as an ARGB value. Replication of
 * [android.graphics.Color.red] as an extension function.
 */
fun Int.red(): Int = this shr 16 and 0xFF

/**
 * Returns the green component of this [Int] as an ARGB value. Replication of
 * [android.graphics.Color.green] as an extension function.
 */
fun Int.green(): Int = this shr 8 and 0xFF

/**
 * Returns the blue component of this [Int] as an ARGB value. Replication of
 * [android.graphics.Color.blue] as an extension function.
 */
fun Int.blue(): Int = this and 0xFF

/**
 * Lightens the 32-bit integer colour by the given factor.
 * [factor] = 0f corresponds to no change.
 * [factor] = 1f corresponds to #FFF, pure white.
 */
@ColorInt
fun Int.lighten(
    @FloatRange(from = 0.0, to = 1.0) factor: Float
): Int = colourFactor { it * (1f - factor) + 255f * factor }

/**
 * Darkens the 32-bit integer colour by the given factor.
 * [factor] = 0f corresponds to no change.
 * [factor] = 1f corresponds to #000, pure black.
 */
@ColorInt
fun Int.darken(
    @FloatRange(from = 0.0, to = 1.0) factor: Float
): Int = colourFactor { it * (1f - factor) }

@ColorInt
private inline fun Int.colourFactor(rgbFactor: (Int) -> Float): Int {
    val (r, g, b) = intArrayOf(red(), green(), blue())
        .map { rgbFactor.invoke(it).toInt() }
    return argbColour(alpha(), r, g, b)
}
