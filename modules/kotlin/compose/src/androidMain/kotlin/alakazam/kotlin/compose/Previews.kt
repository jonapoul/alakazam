@file:SuppressLint("ComposePreviewNaming")

package alakazam.kotlin.compose

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview(
  name = "Dark",
  showBackground = true,
  uiMode = Configuration.UI_MODE_NIGHT_YES,
)
public annotation class PreviewDark

@Preview(
  name = "Light",
  showBackground = true,
  uiMode = Configuration.UI_MODE_NIGHT_NO,
)
public annotation class PreviewLight

@PreviewDark
@PreviewLight
public annotation class PreviewThemes

@Preview(
  name = "Landscape",
  showBackground = true,
  device = "spec:width=411dp,height=891dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape",
)
public annotation class PreviewLandscape
