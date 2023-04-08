package com.jonapoul.alakazam.test

import java.io.InputStream

inline fun <reified T> T.getResourceAsStream(filename: String): InputStream {
  return T::class.java.classLoader?.getResourceAsStream(filename)
    ?: error("Null input stream for $filename!")
}