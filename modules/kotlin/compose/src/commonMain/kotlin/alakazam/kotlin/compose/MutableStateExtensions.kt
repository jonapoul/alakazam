package alakazam.kotlin.compose

import androidx.compose.runtime.MutableState

public fun <T> MutableState<T>.set(value: T) {
  this.value = value
}
