@file:Suppress("MatchingDeclarationName")

package dev.jonpoulton.alakazam.tak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.jonpoulton.alakazam.tak.compose.icons.markers.AlarmGamma
import dev.jonpoulton.alakazam.tak.compose.icons.markers.AlarmNeutron
import dev.jonpoulton.alakazam.tak.compose.icons.markers.AltDipGray
import dev.jonpoulton.alakazam.tak.compose.icons.markers.AltDipGreen
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Black
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Blue
import dev.jonpoulton.alakazam.tak.compose.icons.markers.CheckpointBlue
import dev.jonpoulton.alakazam.tak.compose.icons.markers.CheckpointGreen
import dev.jonpoulton.alakazam.tak.compose.icons.markers.CheckpointRed
import dev.jonpoulton.alakazam.tak.compose.icons.markers.CheckpointYellow
import dev.jonpoulton.alakazam.tak.compose.icons.markers.ChemEffect
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Damaged
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Dip
import dev.jonpoulton.alakazam.tak.compose.icons.markers.DoubleRoundBlue
import dev.jonpoulton.alakazam.tak.compose.icons.markers.DoubleRoundGreen
import dev.jonpoulton.alakazam.tak.compose.icons.markers.DoubleRoundRed
import dev.jonpoulton.alakazam.tak.compose.icons.markers.DoubleRoundYellow
import dev.jonpoulton.alakazam.tak.compose.icons.markers.DpPoint1Active
import dev.jonpoulton.alakazam.tak.compose.icons.markers.DpPoint1Inactive
import dev.jonpoulton.alakazam.tak.compose.icons.markers.DpPoint1Locked
import dev.jonpoulton.alakazam.tak.compose.icons.markers.DpPoint2Active
import dev.jonpoulton.alakazam.tak.compose.icons.markers.DpPoint2Inactive
import dev.jonpoulton.alakazam.tak.compose.icons.markers.DpPoint2Locked
import dev.jonpoulton.alakazam.tak.compose.icons.markers.DpPoint3Active
import dev.jonpoulton.alakazam.tak.compose.icons.markers.DpPoint3Inactive
import dev.jonpoulton.alakazam.tak.compose.icons.markers.DpPoint3Locked
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Emergency
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Forest
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Friendly
import dev.jonpoulton.alakazam.tak.compose.icons.markers.FriendlyDirection
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Generic
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Gray
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Green
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Hostile
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Important
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Iwmdt
import dev.jonpoulton.alakazam.tak.compose.icons.markers.LargeReticle
import dev.jonpoulton.alakazam.tak.compose.icons.markers.LightBlue
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Lime
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Lollipop
import dev.jonpoulton.alakazam.tak.compose.icons.markers.MapPingFlash
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Maroon
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Moneyshot
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Mortar
import dev.jonpoulton.alakazam.tak.compose.icons.markers.NaPresence
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Navy
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Neutral
import dev.jonpoulton.alakazam.tak.compose.icons.markers.NucEffect
import dev.jonpoulton.alakazam.tak.compose.icons.markers.OffscreenIndicator
import dev.jonpoulton.alakazam.tak.compose.icons.markers.OpenCircle
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Orange
import dev.jonpoulton.alakazam.tak.compose.icons.markers.PicMarker
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Pin
import dev.jonpoulton.alakazam.tak.compose.icons.markers.PresenceCurrent
import dev.jonpoulton.alakazam.tak.compose.icons.markers.PresenceDead
import dev.jonpoulton.alakazam.tak.compose.icons.markers.PresenceStale
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Purple
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Red
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Self
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Spot
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Teal
import dev.jonpoulton.alakazam.tak.compose.icons.markers.TeamHuman
import dev.jonpoulton.alakazam.tak.compose.icons.markers.ThreeDimensionalMap
import dev.jonpoulton.alakazam.tak.compose.icons.markers.ThreeDimensionalMapError
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Unknown
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Violet
import dev.jonpoulton.alakazam.tak.compose.icons.markers.WhiteStar
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Yellow

/**
 * A standardized set of icons to be utilized on map throughout the application.
 */
public object MarkersTakIcons

private val allIcons = listOf(
  TakIcons.Markers.AlarmGamma,
  TakIcons.Markers.AlarmNeutron,
  TakIcons.Markers.AltDipGray,
  TakIcons.Markers.AltDipGreen,
  TakIcons.Markers.Black,
  TakIcons.Markers.Blue,
  TakIcons.Markers.CheckpointBlue,
  TakIcons.Markers.CheckpointGreen,
  TakIcons.Markers.CheckpointRed,
  TakIcons.Markers.CheckpointYellow,
  TakIcons.Markers.ChemEffect,
  TakIcons.Markers.Damaged,
  TakIcons.Markers.Dip,
  TakIcons.Markers.DoubleRoundBlue,
  TakIcons.Markers.DoubleRoundGreen,
  TakIcons.Markers.DoubleRoundRed,
  TakIcons.Markers.DoubleRoundYellow,
  TakIcons.Markers.DpPoint1Active,
  TakIcons.Markers.DpPoint1Inactive,
  TakIcons.Markers.DpPoint1Locked,
  TakIcons.Markers.DpPoint2Active,
  TakIcons.Markers.DpPoint2Inactive,
  TakIcons.Markers.DpPoint2Locked,
  TakIcons.Markers.DpPoint3Active,
  TakIcons.Markers.DpPoint3Inactive,
  TakIcons.Markers.DpPoint3Locked,
  TakIcons.Markers.Emergency,
  TakIcons.Markers.Forest,
  TakIcons.Markers.Friendly,
  TakIcons.Markers.FriendlyDirection,
  TakIcons.Markers.Generic,
  TakIcons.Markers.Gray,
  TakIcons.Markers.Green,
  TakIcons.Markers.Hostile,
  TakIcons.Markers.Important,
  TakIcons.Markers.Iwmdt,
  TakIcons.Markers.LargeReticle,
  TakIcons.Markers.LightBlue,
  TakIcons.Markers.Lime,
  TakIcons.Markers.Lollipop,
  TakIcons.Markers.MapPingFlash,
  TakIcons.Markers.Maroon,
  TakIcons.Markers.Moneyshot,
  TakIcons.Markers.Mortar,
  TakIcons.Markers.NaPresence,
  TakIcons.Markers.Navy,
  TakIcons.Markers.Neutral,
  TakIcons.Markers.NucEffect,
  TakIcons.Markers.OffscreenIndicator,
  TakIcons.Markers.OpenCircle,
  TakIcons.Markers.Orange,
  TakIcons.Markers.PicMarker,
  TakIcons.Markers.Pin,
  TakIcons.Markers.PresenceCurrent,
  TakIcons.Markers.PresenceDead,
  TakIcons.Markers.PresenceStale,
  TakIcons.Markers.Purple,
  TakIcons.Markers.Red,
  TakIcons.Markers.Self,
  TakIcons.Markers.Spot,
  TakIcons.Markers.Teal,
  TakIcons.Markers.TeamHuman,
  TakIcons.Markers.ThreeDimensionalMap,
  TakIcons.Markers.ThreeDimensionalMapError,
  TakIcons.Markers.Unknown,
  TakIcons.Markers.Violet,
  TakIcons.Markers.WhiteStar,
  TakIcons.Markers.Yellow,
)

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewIcons() = PreviewIconGrid(allIcons)
