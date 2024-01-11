@file:Suppress("MatchingDeclarationName")

package dev.jonpoulton.alakazam.tak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.jonpoulton.alakazam.tak.compose.icons.input.Message
import dev.jonpoulton.alakazam.tak.compose.icons.input.Search

/**
 * A standardized set of icons to be utilized within text and select inputs.
 */
object InputTakIcons

private val allIcons = listOf(
  TakIcons.Input.Message,
  TakIcons.Input.Search,
)

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewIcons() = PreviewIconGrid(allIcons)
