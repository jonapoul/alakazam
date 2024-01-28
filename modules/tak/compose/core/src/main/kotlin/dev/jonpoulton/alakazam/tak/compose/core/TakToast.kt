package dev.jonpoulton.alakazam.tak.compose.core

import android.widget.Toast
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable

@Composable
public fun TakToast(text: String, length: Int = Toast.LENGTH_LONG) {
  with(LocalTakContexts.current) {
    Toast.makeText(app, text, length).show()
  }
}

@Composable
public fun TakToast(@StringRes id: Int, length: Int = Toast.LENGTH_LONG) {
  TakToast(takStringResource(id), length)
}
