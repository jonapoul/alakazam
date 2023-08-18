package androidx.lifecycle

import kotlinx.coroutines.CoroutineScope

@Suppress("DeprecatedCallableAddReplaceWith", "UnusedReceiverParameter", "unused")
@Deprecated(
  message = "Not supported in ATAK plugins!",
  level = DeprecationLevel.ERROR,
)
val ViewModel.viewModelScope: CoroutineScope get() = error("Not supported in ATAK plugins!")
