package dev.jonpoulton.alakazam.tak.compose.core

import android.widget.Toast
import androidx.compose.runtime.Composable

@Composable
public fun TakToast(text: String, length: Int = Toast.LENGTH_LONG) {
  with(LocalTakContexts.current) {
    Toast.makeText(app, text, length).show()
  }
}
