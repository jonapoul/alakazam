package dev.jonpoulton.alakazam.tak.compose.preview

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import dev.jonpoulton.alakazam.tak.compose.core.TakTheme

@Composable
public fun TakPreview(modifier: Modifier = Modifier, content: @Composable () -> Unit): Unit = TakTheme {
  Surface(modifier = modifier) {
    content()
  }
}

@Composable
@Suppress("MagicNumber")
public fun TakHalfPreview(content: @Composable () -> Unit): Unit = TakTheme {
  Box(
    modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.BottomEnd,
  ) {
    Image(
      modifier = Modifier.fillMaxSize(),
      painter = painterResource(id = R.drawable.tak_screenshot),
      contentDescription = null,
    )

    Row(modifier = Modifier.fillMaxSize()) {
      Spacer(modifier = Modifier.weight(1f))
      Column(modifier = Modifier.weight(1f)) {
        Spacer(modifier = Modifier.weight(0.2f))
        Box(modifier = Modifier.weight(0.8f)) {
          content()
        }
      }
      Spacer(modifier = Modifier.weight(2f / 15f))
    }
  }
}
