package dev.jonpoulton.alakazam.android.ui.compose

import android.content.res.Configuration
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
public annotation class PreviewDark

@Preview(name = "Light", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
public annotation class PreviewLight

@PreviewDark
@PreviewLight
public annotation class PreviewThemes

@Preview(
  name = "Landscape",
  showBackground = true,
  device = "spec:width=411dp,height=891dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape"
)
public annotation class PreviewLandscape

@Composable
public fun PreviewSurface(
  colours: Colors = MaterialTheme.colors,
  content: @Composable () -> Unit,
) {
  MaterialTheme(colours) {
    Surface {
      content()
    }
  }
}

public val EmptyCallback: () -> Unit = {}
