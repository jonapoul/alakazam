package dev.jonpoulton.alakazam.tak.compose.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@Composable
internal fun PreviewIconGrid(icons: List<ImageVector>) = TakPreview {
  LazyVerticalGrid(
    columns = GridCells.Adaptive(minSize = 40.dp),
  ) {
    items(icons) { icon ->
      Column(
        modifier = Modifier.padding(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
      ) {
        Image(icon, contentDescription = null)
        Text(icon.name, fontSize = 6.sp, textAlign = TextAlign.Center)
      }
    }
  }
}

@Composable
internal fun PreviewIconGrid(icons: @Composable () -> List<ImageVector>) {
  PreviewIconGrid(icons = icons())
}

@Composable
internal fun PreviewIcon(icon: ImageVector) = TakPreview {
  Image(icon, contentDescription = null)
}
