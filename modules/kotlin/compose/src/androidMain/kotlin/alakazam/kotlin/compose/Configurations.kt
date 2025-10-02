/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.compose

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.platform.LocalConfiguration

@Composable
@ReadOnlyComposable
public fun isLandscape(): Boolean = LocalConfiguration.current.orientation == Configuration.ORIENTATION_LANDSCAPE
