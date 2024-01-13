package dev.jonpoulton.alakazam.tak.plugin

import android.view.View
import androidx.fragment.app.Fragment
import com.atakmap.android.dropdown.DropDown
import com.atakmap.android.dropdown.DropDownReceiver
import com.atakmap.android.ipc.AtakBroadcast.DocumentedIntentFilter
import com.atakmap.android.maps.MapView

abstract class TakDropDownReceiver(mapView: MapView) : DropDownReceiver(mapView) {
  abstract fun intentFilter(): DocumentedIntentFilter

  fun showDropDown(
    contentView: View?,
    dimensions: Dimensions = HalfScreen,
    ignoreBackButton: Boolean = false,
    switchable: Boolean = false,
    stateListener: DropDown.OnStateListener? = null,
  ) {
    super.showDropDown(
      contentView,
      dimensions.lwFraction,
      dimensions.lhFraction,
      dimensions.pwFraction,
      dimensions.phFraction,
      ignoreBackButton,
      switchable,
      stateListener
    )
  }

  fun showDropDown(
    fragment: Fragment?,
    dimensions: Dimensions = HalfScreen,
    ignoreBackButton: Boolean = false,
    switchable: Boolean = false,
    stateListener: DropDown.OnStateListener? = null,
  ) {
    super.showDropDown(
      fragment,
      dimensions.lwFraction,
      dimensions.lhFraction,
      dimensions.pwFraction,
      dimensions.phFraction,
      ignoreBackButton,
      switchable,
      stateListener
    )
  }

  interface Dimensions {
    val lwFraction: Double
    val lhFraction: Double
    val pwFraction: Double
    val phFraction: Double
  }

  object HalfScreen : Dimensions {
    override val lwFraction = HALF_WIDTH
    override val lhFraction = FULL_HEIGHT
    override val pwFraction = FULL_WIDTH
    override val phFraction = HALF_HEIGHT
  }

  object FullScreen : Dimensions {
    override val lwFraction = FULL_WIDTH
    override val lhFraction = FULL_HEIGHT
    override val pwFraction = FULL_WIDTH
    override val phFraction = FULL_HEIGHT
  }
}
