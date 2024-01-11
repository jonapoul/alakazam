@file:Suppress("UnusedReceiverParameter")

package dev.jonpoulton.alakazam.tak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.About
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.AddFavorite
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.App
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Audio
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Box
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.CacheCleaner
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Camera
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Circle
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Cone
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.ConnectToMapSetElevation
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.ConnectToMapSetImagery
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.ConnectToServerElevation
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.ConnectToServerImagery
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Connections
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.ConvertElevation
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.ConvertImagery
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Cylinder
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.DefaultHeading
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.DefaultHeadingTilt
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.DefaultTilt
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Devices
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Ellipse
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Ellipsoid
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.EventLog
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.File
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Files
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Freeform
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.GeoPing
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.GlobeView
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.GoToArea
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.GoToLocation
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Image
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.KeepInView
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.KmlKmzExport
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.KmlKmzImport
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.ManageFavorite
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.MapSetBuilder
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Media
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.NavigationLock
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.New
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.NewGlobe
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Note
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Open
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Package
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Path
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Placemakers
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Playback
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.PluginManager
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Polygon
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.PolygonAlt
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.ProjectCleaner
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.ProjectSettings
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Properties
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Pyramid
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.R2d2
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.RAndBLine
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.RangeRings
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.RaptorXHelp
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Rectangle
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.ReportIssue
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Save
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.SaveAs
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Screenshot
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Search
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Server
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.ServerPassword
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Shp
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Square
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.SuppressedDevices
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.SystemMessages
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.TerrainDiscovery
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.TextBox
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.TextLabel
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Url
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.UserPreferences
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Video
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.Wedge
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar.CitySearch
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar.Connections
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar.Devices
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar.EventLog
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar.Explorer
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar.Files
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar.Media
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar.Overlays
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar.Playback
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar.Plugins
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar.PointDropper
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar.Properties
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar.R2d2
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar.Server
import dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar.SystemMessages

/**
 * A standardized set of icons to be utilized within the TAKX Application
 */
object RaptorXTakIcons
object RaptorXSidebarTakIcons

private val allIcons = listOf(
  TakIcons.RaptorX.About,
  TakIcons.RaptorX.AddFavorite,
  TakIcons.RaptorX.App,
  TakIcons.RaptorX.Audio,
  TakIcons.RaptorX.Box,
  TakIcons.RaptorX.CacheCleaner,
  TakIcons.RaptorX.Camera,
  TakIcons.RaptorX.Circle,
  TakIcons.RaptorX.Cone,
  TakIcons.RaptorX.Connections,
  TakIcons.RaptorX.ConnectToMapSetElevation,
  TakIcons.RaptorX.ConnectToMapSetImagery,
  TakIcons.RaptorX.ConnectToServerElevation,
  TakIcons.RaptorX.ConnectToServerImagery,
  TakIcons.RaptorX.ConvertElevation,
  TakIcons.RaptorX.ConvertImagery,
  TakIcons.RaptorX.Cylinder,
  TakIcons.RaptorX.DefaultHeading,
  TakIcons.RaptorX.DefaultHeadingTilt,
  TakIcons.RaptorX.DefaultTilt,
  TakIcons.RaptorX.Devices,
  TakIcons.RaptorX.Ellipse,
  TakIcons.RaptorX.Ellipsoid,
  TakIcons.RaptorX.EventLog,
  TakIcons.RaptorX.File,
  TakIcons.RaptorX.Files,
  TakIcons.RaptorX.Freeform,
  TakIcons.RaptorX.GeoPing,
  TakIcons.RaptorX.GlobeView,
  TakIcons.RaptorX.GoToArea,
  TakIcons.RaptorX.GoToLocation,
  TakIcons.RaptorX.Image,
  TakIcons.RaptorX.KeepInView,
  TakIcons.RaptorX.KmlKmzExport,
  TakIcons.RaptorX.KmlKmzImport,
  TakIcons.RaptorX.ManageFavorite,
  TakIcons.RaptorX.MapSetBuilder,
  TakIcons.RaptorX.Media,
  TakIcons.RaptorX.NavigationLock,
  TakIcons.RaptorX.New,
  TakIcons.RaptorX.NewGlobe,
  TakIcons.RaptorX.Note,
  TakIcons.RaptorX.Open,
  TakIcons.RaptorX.Package,
  TakIcons.RaptorX.Path,
  TakIcons.RaptorX.Placemakers,
  TakIcons.RaptorX.Playback,
  TakIcons.RaptorX.PluginManager,
  TakIcons.RaptorX.Polygon,
  TakIcons.RaptorX.PolygonAlt,
  TakIcons.RaptorX.ProjectCleaner,
  TakIcons.RaptorX.ProjectSettings,
  TakIcons.RaptorX.Properties,
  TakIcons.RaptorX.Pyramid,
  TakIcons.RaptorX.R2d2,
  TakIcons.RaptorX.RAndBLine,
  TakIcons.RaptorX.RangeRings,
  TakIcons.RaptorX.RaptorXHelp,
  TakIcons.RaptorX.Rectangle,
  TakIcons.RaptorX.ReportIssue,
  TakIcons.RaptorX.Save,
  TakIcons.RaptorX.SaveAs,
  TakIcons.RaptorX.Screenshot,
  TakIcons.RaptorX.Search,
  TakIcons.RaptorX.Server,
  TakIcons.RaptorX.ServerPassword,
  TakIcons.RaptorX.Shp,
  TakIcons.RaptorX.Square,
  TakIcons.RaptorX.SuppressedDevices,
  TakIcons.RaptorX.SystemMessages,
  TakIcons.RaptorX.TerrainDiscovery,
  TakIcons.RaptorX.TextBox,
  TakIcons.RaptorX.TextLabel,
  TakIcons.RaptorX.Url,
  TakIcons.RaptorX.UserPreferences,
  TakIcons.RaptorX.Video,
  TakIcons.RaptorX.Wedge,
)

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewIcons() = PreviewIconGrid(allIcons)

private val sidebarIcons = listOf(
  TakIcons.RaptorXSidebar.Playback,
  TakIcons.RaptorXSidebar.Media,
  TakIcons.RaptorXSidebar.Server,
  TakIcons.RaptorXSidebar.Explorer,
  TakIcons.RaptorXSidebar.Plugins,
  TakIcons.RaptorXSidebar.Overlays,
  TakIcons.RaptorXSidebar.R2d2,
  TakIcons.RaptorXSidebar.PointDropper,
  TakIcons.RaptorXSidebar.CitySearch,
  TakIcons.RaptorXSidebar.SystemMessages,
  TakIcons.RaptorXSidebar.Files,
  TakIcons.RaptorXSidebar.EventLog,
  TakIcons.RaptorXSidebar.Properties,
  TakIcons.RaptorXSidebar.Connections,
  TakIcons.RaptorXSidebar.Devices,
)

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewSidebarIcons() = PreviewIconGrid(sidebarIcons)

