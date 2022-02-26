package com.jonapoul.common.data

private const val MAX_BYTE = 0xff
private const val NUM_MAC_BYTES = 6

/**
 * Returns a string of each byte represented as a two-character capitalised hexadecimal string, with
 * an optional separating character between each byte. If the separator character is ignored or
 * set to null, there will be no gap between each byte string.
 */
fun ByteArray.toHexString(separator: String = ""): String {
    return joinToString(separator) {
        "%02X".format(it.toInt() and MAX_BYTE)
    }
}

/**
 * Converts the [ByteArray] to a string MAC address representation, e.g. "AB:CD:EF:12:34:56".
 * This also accepts an optional separator parameter, in case you want hyphens or dots between each
 * MAC byte instead of colons.
 */
fun ByteArray.toMacAddress(separator: String = ":"): String {
    if (size != NUM_MAC_BYTES) {
        error("MAC addresses need 6 bytes, this has $size")
    }
    return toHexString(separator)
}
