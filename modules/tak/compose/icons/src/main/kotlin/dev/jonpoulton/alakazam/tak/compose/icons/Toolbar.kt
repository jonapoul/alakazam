@file:Suppress("MatchingDeclarationName")

package dev.jonpoulton.alakazam.tak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Android
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Blank
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Bloodhound
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Brightness
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Camera
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Casevac
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Center
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Close
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Collapse
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Contacts
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.DataPackage
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Delete
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Draw
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Elevation
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Export
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.File
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.FireTools
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Gallery
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.GoTo
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Grid
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.GroupChat
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Hamburger
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Import
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Info
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Lasso
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Maps
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Marker
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.More
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Nightvision
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Notifications
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Orientation
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.OverlayManager
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Plugins
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.PointAtIntersect
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.PointAtSelf
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.PointDropper
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Power
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.QuickNav
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.QuickPic
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Radio
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.RangeAndBearing
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.RedX
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Resection
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Restart
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Routes
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.RubberSheet
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Server
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Settings
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Toolbars
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.TrackHistory
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.UpdateLocation
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Video
import dev.jonpoulton.alakazam.tak.compose.icons.toolbar.Viewshed

/**
 * A standardized set of icons to be utilized within the main toolbar component.
 */
public object ToolbarTakIcons

private val allIcons = listOf(
  TakIcons.Toolbar.Android,
  TakIcons.Toolbar.Blank,
  TakIcons.Toolbar.Bloodhound,
  TakIcons.Toolbar.Brightness,
  TakIcons.Toolbar.Camera,
  TakIcons.Toolbar.Casevac,
  TakIcons.Toolbar.Center,
  TakIcons.Toolbar.Close,
  TakIcons.Toolbar.Collapse,
  TakIcons.Toolbar.Contacts,
  TakIcons.Toolbar.DataPackage,
  TakIcons.Toolbar.Delete,
  TakIcons.Toolbar.Draw,
  TakIcons.Toolbar.Elevation,
  TakIcons.Toolbar.Export,
  TakIcons.Toolbar.File,
  TakIcons.Toolbar.FireTools,
  TakIcons.Toolbar.Gallery,
  TakIcons.Toolbar.GoTo,
  TakIcons.Toolbar.Grid,
  TakIcons.Toolbar.GroupChat,
  TakIcons.Toolbar.Hamburger,
  TakIcons.Toolbar.Import,
  TakIcons.Toolbar.Info,
  TakIcons.Toolbar.Lasso,
  TakIcons.Toolbar.Maps,
  TakIcons.Toolbar.Marker,
  TakIcons.Toolbar.More,
  TakIcons.Toolbar.Nightvision,
  TakIcons.Toolbar.Notifications,
  TakIcons.Toolbar.Orientation,
  TakIcons.Toolbar.OverlayManager,
  TakIcons.Toolbar.Plugins,
  TakIcons.Toolbar.PointAtIntersect,
  TakIcons.Toolbar.PointAtSelf,
  TakIcons.Toolbar.PointDropper,
  TakIcons.Toolbar.Power,
  TakIcons.Toolbar.QuickNav,
  TakIcons.Toolbar.QuickPic,
  TakIcons.Toolbar.Radio,
  TakIcons.Toolbar.RangeAndBearing,
  TakIcons.Toolbar.RedX,
  TakIcons.Toolbar.Resection,
  TakIcons.Toolbar.Restart,
  TakIcons.Toolbar.Routes,
  TakIcons.Toolbar.RubberSheet,
  TakIcons.Toolbar.Server,
  TakIcons.Toolbar.Settings,
  TakIcons.Toolbar.Toolbars,
  TakIcons.Toolbar.TrackHistory,
  TakIcons.Toolbar.UpdateLocation,
  TakIcons.Toolbar.Video,
  TakIcons.Toolbar.Viewshed,
)

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewIcons() = PreviewIconGrid(allIcons)
