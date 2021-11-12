package com.jonapoul.extensions.build

import android.os.Build
import androidx.annotation.ChecksSdkIntAtLeast

/**
 * This class is basically used as a wrapper for accessing [Build.VERSION.SDK_INT], since we can't
 * mock that value in unit tests. This way we just call:
 *      mockkObject(Versions),
 * then we're free to say:
 *      every { Versions.isAtLeast(29) } returns true
 * That way you can simulate different Android OS environments even in regular JVM unit tests.
 */
object Versions {
    @ChecksSdkIntAtLeast(parameter = 0)
    fun isAtLeast(sdkInt: Int): Boolean = Build.VERSION.SDK_INT >= sdkInt

    @ChecksSdkIntAtLeast(parameter = 0)
    fun isBelow(sdkInt: Int): Boolean = Build.VERSION.SDK_INT < sdkInt
}
