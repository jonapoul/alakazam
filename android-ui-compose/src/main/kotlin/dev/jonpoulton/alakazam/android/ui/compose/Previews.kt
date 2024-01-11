package dev.jonpoulton.alakazam.android.ui.compose

import android.content.res.Configuration
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
annotation class PreviewDark

@Preview(name = "Light", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
annotation class PreviewLight

@PreviewDark
@PreviewLight
annotation class PreviewThemes

@Preview(
  name = "Landscape",
  showBackground = true,
  device = "spec:width=411dp,height=891dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape"
)
annotation class PreviewLandscape

@Composable
fun PreviewSurface(
  colours: Colors = MaterialTheme.colors,
  content: @Composable () -> Unit,
) = MaterialTheme(colours) {
  Surface {
    content()
  }
}

val EmptyCallback: () -> Unit = {}
