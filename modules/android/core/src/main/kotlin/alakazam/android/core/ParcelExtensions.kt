/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.android.core

import android.os.Build
import android.os.Parcel

public inline fun <reified T> Parcel.readSerializableCompat(): T? =
  if (Versions.isAtLeast(Build.VERSION_CODES.TIRAMISU)) {
    readSerializable(T::class.java.classLoader, T::class.java)
  } else {
    @Suppress("DEPRECATION")
    readSerializable() as? T?
  }
