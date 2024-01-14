package dev.jonpoulton.alakazam.tak.compose.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ButtonElevation
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Stable
internal val RoundedEdgesSize = 2.dp

@Stable
internal val TakButtonRoundedEdges = RoundedCornerShape(RoundedEdgesSize)

@Stable
internal val TakButtonRoundedEdgesStart = RoundedCornerShape(
  topStart = RoundedEdgesSize,
  topEnd = 0.dp,
  bottomStart = RoundedEdgesSize,
  bottomEnd = 0.dp,
)

@Stable
internal val TakButtonRoundedEdgesEnd = RoundedCornerShape(
  topStart = 0.dp,
  topEnd = RoundedEdgesSize,
  bottomStart = 0.dp,
  bottomEnd = RoundedEdgesSize,
)

@Stable
internal val TakButtonRoundedEdgesMid = RoundedCornerShape(0.dp)

@Stable
internal val TakButtonIconSize = 16.dp

/**
 * Copied from [androidx.compose.material.Button], but with the minimum width now configurable (but with the same
 * default)
 */
@Composable
internal fun ButtonWithNoMinimumWidth(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  elevation: ButtonElevation? = ButtonDefaults.elevation(),
  shape: Shape = MaterialTheme.shapes.small,
  border: BorderStroke? = null,
  colors: ButtonColors = ButtonDefaults.buttonColors(),
  contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
  minWidth: Dp = ButtonDefaults.MinWidth,
  content: @Composable RowScope.() -> Unit,
) {
  val contentColor by colors.contentColor(enabled)
  Surface(
    onClick = onClick,
    modifier = modifier,
    enabled = enabled,
    shape = shape,
    color = colors.backgroundColor(enabled).value,
    contentColor = contentColor.copy(alpha = 1f),
    border = border,
    elevation = elevation?.elevation(enabled, interactionSource)?.value ?: 0.dp,
    interactionSource = interactionSource,
  ) {
    CompositionLocalProvider(LocalContentAlpha provides contentColor.alpha) {
      ProvideTextStyle(
        value = MaterialTheme.typography.button
      ) {
        Row(
          Modifier
            .defaultMinSize(
              minWidth = minWidth,
              minHeight = ButtonDefaults.MinHeight
            )
            .padding(contentPadding),
          horizontalArrangement = Arrangement.Center,
          verticalAlignment = Alignment.CenterVertically,
          content = content
        )
      }
    }
  }
}
