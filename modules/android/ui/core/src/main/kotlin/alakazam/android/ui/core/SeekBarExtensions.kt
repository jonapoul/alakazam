package alakazam.android.ui.core

import android.widget.SeekBar

public fun SeekBar.setSimpleSeekBarChangeListener(
  onProgressChanged: (seekBar: SeekBar, progress: Int, fromUser: Boolean) -> Unit,
  onStartTrackingTouch: ((seekBar: SeekBar) -> Unit)? = null,
  onStopTrackingTouch: ((seekBar: SeekBar) -> Unit)? = null,
) {
  setOnSeekBarChangeListener(
    object : SeekBar.OnSeekBarChangeListener {
      override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
        onProgressChanged(seekBar, progress, fromUser)
      }

      override fun onStartTrackingTouch(seekBar: SeekBar) {
        onStartTrackingTouch?.invoke(seekBar)
      }

      override fun onStopTrackingTouch(seekBar: SeekBar) {
        onStopTrackingTouch?.invoke(seekBar)
      }
    },
  )
}
