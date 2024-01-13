@file:Suppress("MatchingDeclarationName")

package dev.jonpoulton.alakazam.tak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.jonpoulton.alakazam.tak.compose.icons.mapcontrol.Compass
import dev.jonpoulton.alakazam.tak.compose.icons.mapcontrol.LockOnSelf
import dev.jonpoulton.alakazam.tak.compose.icons.mapcontrol.LockOnSelfActive
import dev.jonpoulton.alakazam.tak.compose.icons.mapcontrol.LockOnSelfActiveAlt
import dev.jonpoulton.alakazam.tak.compose.icons.mapcontrol.ThreeDimensionalCompass
import dev.jonpoulton.alakazam.tak.compose.icons.mapcontrol.ThreeDimensionalCompassDirection
import dev.jonpoulton.alakazam.tak.compose.icons.mapcontrol.ThreeDimensionalCompassTilt
import dev.jonpoulton.alakazam.tak.compose.icons.mapcontrol.ZoomControl

/**
 * A standardized set of icons that appear on map in the main nav stack.
 */
public object MapControlTakIcons

private val allIcons = listOf(
  TakIcons.MapControl.ThreeDimensionalCompassDirection,
  TakIcons.MapControl.ZoomControl,
  TakIcons.MapControl.LockOnSelfActiveAlt,
  TakIcons.MapControl.ThreeDimensionalCompass,
  TakIcons.MapControl.LockOnSelf,
  TakIcons.MapControl.LockOnSelfActive,
  TakIcons.MapControl.Compass,
  TakIcons.MapControl.ThreeDimensionalCompassTilt,
)

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewIcons() = PreviewIconGrid(allIcons)
