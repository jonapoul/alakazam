@file:Suppress("MatchingDeclarationName")

package dev.jonpoulton.alakazam.tak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.jonpoulton.alakazam.tak.compose.icons.radial.AddHostile
import dev.jonpoulton.alakazam.tak.compose.icons.radial.AngleUnits
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Back
import dev.jonpoulton.alakazam.tak.compose.icons.radial.BlastRings
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Bloodhound
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Bluetooth
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Breadcrumbs
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Bullseye
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Camera
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Cas
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Cff
import dev.jonpoulton.alakazam.tak.compose.icons.radial.CffAlt
import dev.jonpoulton.alakazam.tak.compose.icons.radial.CffPlus
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Chat
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Clamp
import dev.jonpoulton.alakazam.tak.compose.icons.radial.ClearTracks
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Close
import dev.jonpoulton.alakazam.tak.compose.icons.radial.CompassRose
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Connections
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Copy
import dev.jonpoulton.alakazam.tak.compose.icons.radial.DataPackage
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Deg
import dev.jonpoulton.alakazam.tak.compose.icons.radial.DegGrid
import dev.jonpoulton.alakazam.tak.compose.icons.radial.DegMag
import dev.jonpoulton.alakazam.tak.compose.icons.radial.DegMil
import dev.jonpoulton.alakazam.tak.compose.icons.radial.DegTrue
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Delete
import dev.jonpoulton.alakazam.tak.compose.icons.radial.DetailsProgress
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Display
import dev.jonpoulton.alakazam.tak.compose.icons.radial.DistUnit
import dev.jonpoulton.alakazam.tak.compose.icons.radial.DistanceLock
import dev.jonpoulton.alakazam.tak.compose.icons.radial.DropPin
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Edit
import dev.jonpoulton.alakazam.tak.compose.icons.radial.EnterCoordinates
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Expand
import dev.jonpoulton.alakazam.tak.compose.icons.radial.FahRedx
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Fine
import dev.jonpoulton.alakazam.tak.compose.icons.radial.FovDirection
import dev.jonpoulton.alakazam.tak.compose.icons.radial.FovSize
import dev.jonpoulton.alakazam.tak.compose.icons.radial.FovVisibility
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Geofence
import dev.jonpoulton.alakazam.tak.compose.icons.radial.GoTo
import dev.jonpoulton.alakazam.tak.compose.icons.radial.GpsError
import dev.jonpoulton.alakazam.tak.compose.icons.radial.GreenFlag
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Hostile
import dev.jonpoulton.alakazam.tak.compose.icons.radial.HostileList
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Id
import dev.jonpoulton.alakazam.tak.compose.icons.radial.ImageOverlay
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Kmm
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Label
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Lock
import dev.jonpoulton.alakazam.tak.compose.icons.radial.LrfSlide
import dev.jonpoulton.alakazam.tak.compose.icons.radial.ManualPointEntry
import dev.jonpoulton.alakazam.tak.compose.icons.radial.MgrsLocation
import dev.jonpoulton.alakazam.tak.compose.icons.radial.MiddlePoint
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Mils
import dev.jonpoulton.alakazam.tak.compose.icons.radial.MilsGrid
import dev.jonpoulton.alakazam.tak.compose.icons.radial.MilsMag
import dev.jonpoulton.alakazam.tak.compose.icons.radial.MultiPolyline
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Nineline
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Nm
import dev.jonpoulton.alakazam.tak.compose.icons.radial.NoPoint
import dev.jonpoulton.alakazam.tak.compose.icons.radial.PairingLine
import dev.jonpoulton.alakazam.tak.compose.icons.radial.PairingLineToSelf
import dev.jonpoulton.alakazam.tak.compose.icons.radial.PolarEntry
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Range
import dev.jonpoulton.alakazam.tak.compose.icons.radial.RedsMsds
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Rotate
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Send
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Support
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Tasking
import dev.jonpoulton.alakazam.tak.compose.icons.radial.TrackDetails
import dev.jonpoulton.alakazam.tak.compose.icons.radial.UnitFt
import dev.jonpoulton.alakazam.tak.compose.icons.radial.Video
import dev.jonpoulton.alakazam.tak.compose.icons.radial.ViewshedLine

/**
 * A standardized set of icons to be utilized for the radial menu and child menu components.
 */
public object RadialTakIcons

private val allIcons = listOf(
  TakIcons.Radial.AddHostile,
  TakIcons.Radial.AngleUnits,
  TakIcons.Radial.Back,
  TakIcons.Radial.BlastRings,
  TakIcons.Radial.Bloodhound,
  TakIcons.Radial.Bluetooth,
  TakIcons.Radial.Breadcrumbs,
  TakIcons.Radial.Bullseye,
  TakIcons.Radial.Camera,
  TakIcons.Radial.Cas,
  TakIcons.Radial.Cff,
  TakIcons.Radial.CffAlt,
  TakIcons.Radial.CffPlus,
  TakIcons.Radial.Chat,
  TakIcons.Radial.Clamp,
  TakIcons.Radial.ClearTracks,
  TakIcons.Radial.Close,
  TakIcons.Radial.CompassRose,
  TakIcons.Radial.Connections,
  TakIcons.Radial.Copy,
  TakIcons.Radial.DataPackage,
  TakIcons.Radial.Deg,
  TakIcons.Radial.DegGrid,
  TakIcons.Radial.DegMag,
  TakIcons.Radial.DegMil,
  TakIcons.Radial.DegTrue,
  TakIcons.Radial.Delete,
  TakIcons.Radial.DetailsProgress,
  TakIcons.Radial.Display,
  TakIcons.Radial.DistanceLock,
  TakIcons.Radial.DistUnit,
  TakIcons.Radial.DropPin,
  TakIcons.Radial.Edit,
  TakIcons.Radial.EnterCoordinates,
  TakIcons.Radial.Expand,
  TakIcons.Radial.FahRedx,
  TakIcons.Radial.Fine,
  TakIcons.Radial.FovDirection,
  TakIcons.Radial.FovSize,
  TakIcons.Radial.FovVisibility,
  TakIcons.Radial.Geofence,
  TakIcons.Radial.GoTo,
  TakIcons.Radial.GpsError,
  TakIcons.Radial.GreenFlag,
  TakIcons.Radial.Hostile,
  TakIcons.Radial.HostileList,
  TakIcons.Radial.Id,
  TakIcons.Radial.ImageOverlay,
  TakIcons.Radial.Kmm,
  TakIcons.Radial.Label,
  TakIcons.Radial.Lock,
  TakIcons.Radial.LrfSlide,
  TakIcons.Radial.ManualPointEntry,
  TakIcons.Radial.MgrsLocation,
  TakIcons.Radial.MiddlePoint,
  TakIcons.Radial.Mils,
  TakIcons.Radial.MilsGrid,
  TakIcons.Radial.MilsMag,
  TakIcons.Radial.MultiPolyline,
  TakIcons.Radial.Nineline,
  TakIcons.Radial.Nm,
  TakIcons.Radial.NoPoint,
  TakIcons.Radial.PairingLine,
  TakIcons.Radial.PairingLineToSelf,
  TakIcons.Radial.PolarEntry,
  TakIcons.Radial.Range,
  TakIcons.Radial.RedsMsds,
  TakIcons.Radial.Rotate,
  TakIcons.Radial.Send,
  TakIcons.Radial.Support,
  TakIcons.Radial.Tasking,
  TakIcons.Radial.TrackDetails,
  TakIcons.Radial.UnitFt,
  TakIcons.Radial.Video,
  TakIcons.Radial.ViewshedLine,
)

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewIcons() = PreviewIconGrid(allIcons)
