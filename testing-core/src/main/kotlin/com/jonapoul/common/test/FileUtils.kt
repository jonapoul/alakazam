package com.jonapoul.common.test

import java.io.InputStream

inline fun <reified T> T.getResourceAsStream(filename: String): InputStream {
    return T::class.java.classLoader?.getResourceAsStream(filename)
        ?: throw IllegalStateException("Null input stream for $filename!")
}
