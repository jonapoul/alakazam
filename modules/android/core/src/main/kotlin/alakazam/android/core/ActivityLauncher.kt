/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.android.core

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import kotlin.reflect.KClass

public class ActivityLauncher(private val context: Context) {
  public fun launch(action: String, data: Uri? = null, flags: Int? = null, options: Bundle? = null) {
    val intent = Intent(action)
    data?.let { intent.data = it }
    flags?.let { intent.flags = it }
    context.startActivity(intent, options)
  }

  public fun <T : Activity> launch(clazz: KClass<T>, data: Uri? = null, flags: Int? = null, options: Bundle? = null) {
    val intent = Intent(context, clazz.java)
    data?.let { intent.data = it }
    flags?.let { intent.flags = it }
    context.startActivity(intent, options)
  }
}
