package alakazam.compose

import androidx.compose.runtime.MutableState

public fun <T> MutableState<T>.set(value: T) {
  this.value = value
}
