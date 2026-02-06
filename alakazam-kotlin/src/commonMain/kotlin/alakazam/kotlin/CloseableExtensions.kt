package alakazam.kotlin

import kotlinx.coroutines.CancellationException
import java.io.Closeable

public fun Closeable.quietlyClose() {
  try {
    close()
  } catch (e: CancellationException) {
    throw e
  } catch (_: Exception) {
    // No-op
  }
}
