package dev.jonpoulton.alakazam.tak.compose.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakTheme

@Composable
internal fun PreviewIconGrid(icons: List<ImageVector>) = TakTheme {
  Surface {
    LazyVerticalGrid(
      columns = GridCells.Adaptive(minSize = 40.dp),
    ) {
      items(icons) { icon ->
        Box(modifier = Modifier.padding(8.dp)) {
          Image(icon, contentDescription = null)
        }
      }
    }
  }
}
