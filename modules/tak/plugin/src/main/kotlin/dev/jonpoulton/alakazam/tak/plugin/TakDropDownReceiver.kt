package dev.jonpoulton.alakazam.tak.plugin

import android.view.View
import androidx.fragment.app.Fragment
import com.atakmap.android.dropdown.DropDown
import com.atakmap.android.dropdown.DropDownReceiver
import com.atakmap.android.ipc.AtakBroadcast.DocumentedIntentFilter
import com.atakmap.android.maps.MapView

public abstract class TakDropDownReceiver(mapView: MapView) : DropDownReceiver(mapView) {
  public abstract fun intentFilter(): DocumentedIntentFilter

  public fun showDropDown(
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

  public fun showDropDown(
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

  public interface Dimensions {
    public val lwFraction: Double
    public val lhFraction: Double
    public val pwFraction: Double
    public val phFraction: Double
  }

  public object HalfScreen : Dimensions {
    override val lwFraction: Double = HALF_WIDTH
    override val lhFraction: Double = FULL_HEIGHT
    override val pwFraction: Double = FULL_WIDTH
    override val phFraction: Double = HALF_HEIGHT
  }

  public object FullScreen : Dimensions {
    override val lwFraction: Double = FULL_WIDTH
    override val lhFraction: Double = FULL_HEIGHT
    override val pwFraction: Double = FULL_WIDTH
    override val phFraction: Double = FULL_HEIGHT
  }
}
