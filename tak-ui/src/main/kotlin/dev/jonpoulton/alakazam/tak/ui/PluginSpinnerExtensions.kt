package dev.jonpoulton.alakazam.tak.ui

import android.view.View
import android.widget.AdapterView
import com.atakmap.android.gui.PluginSpinner
import com.atakmap.android.util.SimpleItemSelectedListener
import timber.log.Timber

fun PluginSpinner.setSimplerItemSelectedListener(listener: OnItemSelectedListener) {
  onItemSelectedListener = object : SimpleItemSelectedListener() {
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
      Timber.v("onItemSelected $position $id")
      listener.onItemSelected(view, position, id)
    }
  }
}

fun interface OnItemSelectedListener {
  fun onItemSelected(view: View?, position: Int, id: Long)
}
