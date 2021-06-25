package com.jonapoul.extensions.colours

import android.graphics.Color
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
    val (red, green, blue) = intArrayOf(
        Color.red(this),
        Color.green(this),
        Color.blue(this)
    ).map { rgbFactor.invoke(it).toInt() }
    return Color.argb(
        Color.alpha(this),
        red,
        green,
        blue
    )
}

/**
 * Converts an integer to a hexadecimal ARGB string. Examples:
 * 0 -> "00000000"
 * 255 -> "000000FF"
 * 4286611584 -> "FF808080"
 */
fun Int.toArgbHexString(): String {
    return "${alpha()}${toRgbHexString()}"
}

/**
 * Converts an integer to a hexadecimal RGB string, ignoring the alpha component. Examples:
 * 0 -> "000000"
 * 255 -> "0000FF"
 * 4286611584 -> "808080"
 */
fun Int.toRgbHexString(): String {
    return "${red()}${green()}${blue()}"
}

/**
 * Converts an integer to a hexadecimal string of the configured length. Examples:
 * 255.toHex(2) = "FF"
 * 255.toHex(4) = "00FF"
 * 4286611584.toHex(6) = "808080"
 * 4286611584.toHex(8) = "FF808080"
 */
fun Int.toHex(length: Int): String = toString(16)
    .takeLast(length)
    .padStart(length, padChar = '0')
