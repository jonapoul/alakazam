package dev.jonpoulton.alakazam.tak.compose.core

import android.content.res.Configuration
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

val TakTypography: Typography
  @Composable
  @ReadOnlyComposable
  get() = MaterialTheme.typography.copy(
    h1 = TakTextStyles.H1,
    h2 = TakTextStyles.H2,
    h3 = TakTextStyles.H3,
    h4 = TakTextStyles.H4,
    body1 = TakTextStyles.Display,
    body2 = TakTextStyles.P,
  )

@Stable
object TakFonts {
  @Stable
  val Bold: Font = Font(R.font.nunito_bold, weight = FontWeight.Bold)

  @Stable
  val Regular: Font = Font(R.font.nunito_regular, weight = FontWeight.Normal)

  @Stable
  val Family: FontFamily = FontFamily(Bold, Regular)
}

@Stable
object TakTextStyles {
  /**
   * Used for dropdown menu headers
   */
  @Stable
  val H1: TextStyle = TextStyle(
    fontFamily = TakFonts.Family,
    fontSize = 14.sp,
    fontWeight = FontWeight.Bold,
    color = TakColors.Cloud,
  )

  /**
   * Used for large buttons and modal buttons
   */
  @Stable
  val H2: TextStyle = TextStyle(
    fontFamily = TakFonts.Family,
    fontSize = 14.sp,
    fontWeight = FontWeight.Normal,
    color = TakColors.Ink,
  )

  /**
   * Used for interactive menu options
   */
  @Stable
  val H3: TextStyle = TextStyle(
    fontFamily = TakFonts.Family,
    fontSize = 14.sp,
    fontWeight = FontWeight.Normal,
    color = TakColors.Cloud,
  )

  /**
   * Used for small buttons
   */
  @Stable
  val H4: TextStyle = TextStyle(
    fontFamily = TakFonts.Family,
    fontSize = 12.sp,
    fontWeight = FontWeight.Bold,
    color = TakColors.Sand,
  )

  /**
   * Used for module headers
   */
  @Stable
  val Display: TextStyle = TextStyle(
    fontFamily = TakFonts.Family,
    fontSize = 16.sp,
    fontWeight = FontWeight.Bold,
    color = TakColors.Cloud,
  )

  /**
   * Standard font for all other cases
   */
  @Stable
  val P: TextStyle = TextStyle(
    fontFamily = TakFonts.Family,
    fontSize = 12.sp,
    fontWeight = FontWeight.Normal,
    color = TakColors.Cloud,
  )
}

@PreviewDark
@Composable
private fun PreviewH1() = PreviewTypography(TakTypography.h1)

@PreviewDark
@Composable
private fun PreviewH2() = PreviewTypography(TakTypography.h2)

@PreviewDark
@Composable
private fun PreviewH3() = PreviewTypography(TakTypography.h3)

@PreviewDark
@Composable
private fun PreviewH4() = PreviewTypography(TakTypography.h4)

@PreviewDark
@Composable
private fun PreviewBody1() = PreviewTypography(TakTypography.body1)

@PreviewDark
@Composable
private fun PreviewBody2() = PreviewTypography(TakTypography.body2)

@Composable
private fun PreviewTypography(style: TextStyle) = TakTheme {
  Surface {
    Text(text = "Here's some sample text", style = style)
  }
}

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
private annotation class PreviewDark