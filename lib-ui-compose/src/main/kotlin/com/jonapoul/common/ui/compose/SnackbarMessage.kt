package com.jonapoul.common.ui.compose

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
        override val foregroundColour: ComposableColor = { MaterialTheme.colors.onSnackbarBlue },
        override val backgroundColour: ComposableColor = { MaterialTheme.colors.snackbarBackground },
        override val action: SnackbarAction = SnackbarAction.Empty,
    ) : SnackbarMessage

    data class Success(
        override val message: String,
        override val foregroundColour: ComposableColor = { MaterialTheme.colors.onSnackbarGreen },
        override val backgroundColour: ComposableColor = { MaterialTheme.colors.snackbarBackground },
        override val action: SnackbarAction = SnackbarAction.Empty,
    ) : SnackbarMessage

    data class Caution(
        override val message: String,
        override val foregroundColour: ComposableColor = { MaterialTheme.colors.onSnackbarYellow },
        override val backgroundColour: ComposableColor = { MaterialTheme.colors.snackbarBackground },
        override val action: SnackbarAction = SnackbarAction.Empty,
    ) : SnackbarMessage

    data class Warning(
        override val message: String,
        override val foregroundColour: ComposableColor = { MaterialTheme.colors.onSnackbarRed },
        override val backgroundColour: ComposableColor = { MaterialTheme.colors.snackbarBackground },
        override val action: SnackbarAction = SnackbarAction.Empty,
    ) : SnackbarMessage
}

data class SnackbarAction(
    val text: String,
    val action: () -> Unit,
) {
    companion object {
        val Empty = SnackbarAction(
            text = "OK",
            action = {},
        )
    }
}
