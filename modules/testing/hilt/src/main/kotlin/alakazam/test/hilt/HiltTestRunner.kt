/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.test.hilt

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner
import dagger.hilt.android.testing.HiltTestApplication

public class HiltTestRunner : AndroidJUnitRunner() {
  override fun newApplication(cl: ClassLoader?, name: String?, context: Context?): Application =
    super.newApplication(cl, HiltTestApplication::class.java.name, context)
}
