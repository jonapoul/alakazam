package dev.jonpoulton.alakazam.core

import android.os.Build
import androidx.annotation.ChecksSdkIntAtLeast

@ChecksSdkIntAtLeast(parameter = 0, lambda = 1)
fun <Builder> Builder.ifAtLeastSDK(sdkInt: Int, action: Builder.() -> Builder): Builder {
  return if (Build.VERSION.SDK_INT >= sdkInt) action.invoke(this) else this
}
