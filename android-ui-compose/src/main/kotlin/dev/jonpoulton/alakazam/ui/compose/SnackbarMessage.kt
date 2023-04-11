package dev.jonpoulton.alakazam.ui.compose

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private typealias ComposableColor = @Composable () -> Color

sealed interface SnackbarMessage {
  val message: String
  val foregroundColour: ComposableColor
  val backgroundColour: ComposableColor
  val action: SnackbarAction

  data class Info(
    override val message: String,
    override val action: SnackbarAction = SnackbarAction.Empty,
  ) : SnackbarMessage {
    override val foregroundColour: ComposableColor = { MaterialTheme.colors.onSnackbarBlue }
    override val backgroundColour: ComposableColor = { MaterialTheme.colors.snackbarBackground }
  }

  data class Success(
    override val message: String,
    override val action: SnackbarAction = SnackbarAction.Empty,
  ) : SnackbarMessage {
    override val foregroundColour: ComposableColor = { MaterialTheme.colors.onSnackbarGreen }
    override val backgroundColour: ComposableColor = { MaterialTheme.colors.snackbarBackground }
  }

  data class Caution(
    override val message: String,
    override val action: SnackbarAction = SnackbarAction.Empty,
  ) : SnackbarMessage {
    override val foregroundColour: ComposableColor = { MaterialTheme.colors.onSnackbarYellow }
    override val backgroundColour: ComposableColor = { MaterialTheme.colors.snackbarBackground }
  }

  data class Warning(
    override val message: String,
    override val action: SnackbarAction = SnackbarAction.Empty,
  ) : SnackbarMessage {
    override val foregroundColour: ComposableColor = { MaterialTheme.colors.onSnackbarRed }
    override val backgroundColour: ComposableColor = { MaterialTheme.colors.snackbarBackground }
  }
}

data class SnackbarAction(
  val text: String,
  val action: () -> Unit,
) {
  companion object {
    val Empty = SnackbarAction(text = "OK", action = {})
  }
}
