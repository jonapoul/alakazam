package com.jonapoul.extensions.colours

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
