@file:Suppress("MagicNumber")

package com.jonapoul.extensions.data

import androidx.annotation.ColorInt
import androidx.annotation.FloatRange
import androidx.annotation.IntRange
import kotlin.math.max
import kotlin.math.min

/**
 * Construct a [ColorInt] [Int] value using four ARGB values.
 */
@ColorInt
fun argbColour(
    @IntRange(from = 0, to = 255) alpha: Int,
    @IntRange(from = 0, to = 255) red: Int,
    @IntRange(from = 0, to = 255) green: Int,
    @IntRange(from = 0, to = 255) blue: Int
): Int = alpha shl 24 or (red shl 16) or (green shl 8) or blue

/**
 * Linearly interpolate between two [Int] colour values using a fractional interpolation value.
 * Examples:
 *
 *      lerpColours(0xFF000000, 0xFFFFFFFF, 0.0) => 0xFF000000
 *      lerpColours(0xFF000000, 0xFFFFFFFF, 0.5) => 0xFF808080
 *      lerpColours(0xFF000000, 0xFFFFFFFF, 1.0) => 0xFFFFFFFF
 */
fun lerpColours(
    @ColorInt start: Int,
    @ColorInt end: Int,
    @FloatRange(from = 0.0, to = 1.0) factor: Float
): Int {
    val da = end.alpha() - start.alpha()
    val dr = end.red() - start.red()
    val dg = end.green() - start.green()
    val db = end.blue() - start.blue()

    /* Result channel lies between first and second colors channel */
    val alpha = (start.alpha() + da * factor).toInt()
    val red = (start.red() + dr * factor).toInt()
    val green = (start.green() + dg * factor).toInt()
    val blue = (start.blue() + db * factor).toInt()

    /* Lock results into the range 0-255, then combine into ARGB integer */
    return argbColour(
        alpha = max(min(alpha, 255), 0),
        red = max(min(red, 255), 0),
        green = max(min(green, 255), 0),
        blue = max(min(blue, 255), 0)
    )
}

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
