@file:Suppress("MatchingDeclarationName")

package dev.jonpoulton.alakazam.tak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.AddHostile
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.Circle
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.Freeform
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.HostileGoTo
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.HostileManager
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.HostileSpi
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.Lasso
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.Polygon
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.RAndBBullseye
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.RAndBCircle
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.RAndBDynamicLine
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.RAndBLine
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.RotationLock
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.RotationLockAlt
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.Square
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.ThreeDimensional
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.ThreeDimensionalLock
import dev.jonpoulton.alakazam.tak.compose.icons.dropdown.ThreeDimensionalLockAlt

/**
 * A standardized set of icons to be utilized within the dropdown child menu for the toolbar component.
 */
object DropdownTakIcons

private val allIcons = listOf(
  TakIcons.Dropdown.AddHostile,
  TakIcons.Dropdown.Circle,
  TakIcons.Dropdown.Freeform,
  TakIcons.Dropdown.HostileGoTo,
  TakIcons.Dropdown.HostileManager,
  TakIcons.Dropdown.HostileSpi,
  TakIcons.Dropdown.Lasso,
  TakIcons.Dropdown.Polygon,
  TakIcons.Dropdown.RAndBBullseye,
  TakIcons.Dropdown.RAndBCircle,
  TakIcons.Dropdown.RAndBDynamicLine,
  TakIcons.Dropdown.RAndBLine,
  TakIcons.Dropdown.RotationLock,
  TakIcons.Dropdown.RotationLockAlt,
  TakIcons.Dropdown.Square,
  TakIcons.Dropdown.ThreeDimensional,
  TakIcons.Dropdown.ThreeDimensionalLock,
  TakIcons.Dropdown.ThreeDimensionalLockAlt,
)

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewIcons() = PreviewIconGrid(allIcons)
