/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.compose

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
public fun VerticalSpacer(
  height: Dp,
  modifier: Modifier = Modifier,
) {
  Spacer(modifier = modifier.height(height))
}

@Composable
public fun ColumnScope.VerticalSpacer(
  weight: Float,
  modifier: Modifier = Modifier,
) {
  Spacer(modifier = modifier.weight(weight))
}

@Composable
public fun HorizontalSpacer(
  width: Dp,
  modifier: Modifier = Modifier,
) {
  Spacer(modifier = modifier.width(width))
}

@Composable
public fun RowScope.HorizontalSpacer(
  weight: Float,
  modifier: Modifier = Modifier,
) {
  Spacer(modifier = modifier.weight(weight))
}
