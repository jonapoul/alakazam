package dev.jonpoulton.alakazam.tak.core

import android.content.Intent
import com.atakmap.android.image.ImageDropDownReceiver
import com.atakmap.android.image.quickpic.QuickPicReceiver
import com.atakmap.android.ipc.AtakBroadcast
import com.atakmap.android.maps.MapCoreIntentsComponent
import com.atakmap.android.video.VideoDropDownReceiver
import com.atakmap.coremap.maps.coords.GeoPoint

fun AtakBroadcast.panToPoint(point: GeoPoint, snap: Boolean, adjustForTerrain: Boolean = true): Boolean =
  sendBroadcast(MapCoreIntentsComponent.ACTION_PAN_ZOOM) {
    putExtra("point", point.toStringRepresentation())
    putExtra("snap", snap)
    putExtra("adjustForTerrain", adjustForTerrain)
  }

fun AtakBroadcast.openQuickPick(): Boolean =
  sendBroadcast(QuickPicReceiver.QUICK_PIC)

fun AtakBroadcast.openLassoTool(callbackIntent: Intent): Boolean =
  sendBroadcast(action = "com.atakmap.android.missionpackage.lasso.SELECT") {
    putExtra("callback", callbackIntent)
  }

fun AtakBroadcast.openVideo(videoUrl: String, uid: String): Boolean =
  sendBroadcast(VideoDropDownReceiver.DISPLAY) {
    putExtra("videoUrl", videoUrl)
    putExtra("uid", uid)
  }

fun AtakBroadcast.openImage(imageUri: String, title: String): Boolean =
  sendBroadcast(ImageDropDownReceiver.IMAGE_DISPLAY) {
    putExtra("imageURI", imageUri)
    putExtra("title", title)
  }

private fun AtakBroadcast.sendBroadcast(action: String, intentBuilder: Intent.() -> Unit = {}): Boolean {
  val intent = Intent(action)
  intent.intentBuilder()
  return sendBroadcast(intent)
}
