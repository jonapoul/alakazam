@file:SuppressLint("ComposeModifierMissing")

package alakazam.android.ui.compose

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
public fun VerticalSpacer(height: Dp = 10.dp) {
  Spacer(modifier = Modifier.height(height))
}

@Composable
public fun ColumnScope.VerticalSpacer(weight: Float) {
  Spacer(modifier = Modifier.weight(weight))
}

@Composable
public fun HorizontalSpacer(width: Dp = 10.dp) {
  Spacer(modifier = Modifier.width(width))
}

@Composable
public fun RowScope.HorizontalSpacer(weight: Float) {
  Spacer(modifier = Modifier.weight(weight))
}
