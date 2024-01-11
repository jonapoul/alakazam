package dev.jonpoulton.alakazam.tak.compose.button

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Stable
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
