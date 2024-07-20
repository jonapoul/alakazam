package alakazam.test.core

import java.io.InputStream

@Suppress("UnreachableCode", "RedundantSuppression")
public inline fun <reified T> T.getResourceAsStream(filename: String): InputStream =
  T::class.java.classLoader?.getResourceAsStream(filename)
    ?: error("Null input stream for $filename!")
