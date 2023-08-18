package androidx.fragment.app

import androidx.lifecycle.ViewModel

@Suppress("DeprecatedCallableAddReplaceWith", "UnusedReceiverParameter", "unused")
@Deprecated(
  message = "Not supported in ATAK plugins!",
  level = DeprecationLevel.ERROR,
)
inline fun <reified VM : ViewModel> Fragment.viewModels(): Lazy<VM> = error("Not supported in ATAK plugins!")
