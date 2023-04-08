package com.jonapoul.alakazam.ui.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.AlertDialog
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.contentColorFor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

@Composable
fun BasicTextDialog(
  modifier: Modifier = Modifier,
  title: String,
  text: String,
  titleIcon: ComposeDrawable? = null,
  highlightColor: Color = MaterialTheme.colors.primary,
  positiveText: String = stringResource(id = android.R.string.ok),
  negativeText: String? = stringResource(id = android.R.string.cancel),
  onPositiveClick: () -> Unit = {},
  onNegativeClick: () -> Unit = {},
  isDismissible: Boolean = true,
  onDismiss: () -> Unit = onNegativeClick,
) {
  AlertDialog(
    modifier = modifier,
    properties = DialogProperties(dismissOnBackPress = isDismissible, dismissOnClickOutside = isDismissible),
    onDismissRequest = onDismiss,
    confirmButton = {
      TextButton(
        modifier = modifier.wrapContentSize(),
        onClick = { onPositiveClick.invoke() },
      ) {
        Text(
          modifier = modifier,
          text = positiveText,
          color = highlightColor,
        )
      }
    },
    dismissButton = negativeText?.let {
      {
        TextButton(
          modifier = modifier.wrapContentSize(),
          onClick = { onNegativeClick.invoke() },
        ) {
          Text(
            modifier = modifier,
            text = negativeText,
            color = highlightColor,
          )
        }
      }
    },

    title = {
      Row(
        modifier = modifier.wrapContentSize(),
        verticalAlignment = Alignment.CenterVertically
      ) {
        titleIcon?.compose(
          modifier = modifier
            .wrapContentSize()
            .padding(end = 4.dp),
          contentDescription = title,
          tint = highlightColor,
        )
        Text(
          modifier = modifier.wrapContentSize(),
          text = title,
          color = highlightColor,
        )
      }
    },
    text = {
      Text(
        modifier = modifier.wrapContentSize(),
        text = text,
      )
    }
  )
}

@PreviewThemes
@Composable
private fun PreviewBasicTextDialog() {
  PreviewScreen {
    BasicTextDialog(
      titleIcon = Icons.Filled.Warning.asDrawable(),
      title = "Hello world",
      text = "Something goes here",
      highlightColor = MaterialTheme.colors.onSurfaceOrange,
    )
  }
}

@PreviewThemes
@Composable
private fun PreviewBasicTextDialogWithNoIcon() {
  PreviewScreen {
    BasicTextDialog(
      title = "Hello world",
      text = "Something goes here",
      highlightColor = MaterialTheme.colors.onSurfaceOrange,
    )
  }
}

@PreviewThemes
@Composable
private fun PreviewBasicTextDialogWithNoColour() {
  PreviewScreen {
    BasicTextDialog(
      titleIcon = Icons.Filled.Warning.asDrawable(),
      title = "Hello world",
      text = "Something goes here",
    )
  }
}

@Composable
fun BasicComposableDialog(
  modifier: Modifier = Modifier,
  title: String?,
  titleIcon: ImageVector? = null,
  highlightColor: Color = MaterialTheme.colors.primary,
  backgroundColor: Color = MaterialTheme.colors.dialogBackground,
  contentColor: Color = contentColorFor(backgroundColor),
  positiveText: String? = stringResource(id = android.R.string.ok),
  negativeText: String? = stringResource(id = android.R.string.cancel),
  onPositiveClick: () -> Unit = {},
  onNegativeClick: () -> Unit = {},
  isDismissible: Boolean = true,
  onDismiss: () -> Unit = onNegativeClick,
  content: @Composable () -> Unit,
) {
  Dialog(
    properties = DialogProperties(
      dismissOnBackPress = isDismissible,
      dismissOnClickOutside = isDismissible,
    ),
    onDismissRequest = onDismiss,
  ) {
    Surface(
      modifier = modifier,
      color = backgroundColor,
      shape = MaterialTheme.shapes.medium,
      contentColor = contentColor,
    ) {
      Column(
        modifier = modifier
          .wrapContentWidth()
          .wrapContentHeight(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,
      ) {
        Column(
          modifier = modifier.padding(vertical = 24.dp),
          horizontalAlignment = Alignment.Start,
        ) {
          BasicComposableDialogTitleRow(
            modifier = modifier,
            title = title,
            titleIcon = titleIcon,
            highlightColor = highlightColor,
          )

          Box(
            modifier = modifier
              .padding(start = 24.dp, end = 24.dp, top = 16.dp)
              .fillMaxWidth()
              .wrapContentHeight(),
            contentAlignment = Alignment.Center,
          ) {
            content.invoke()
          }
        }
        BasicComposableDialogButtonsRow(
          modifier = modifier,
          highlightColor = highlightColor,
          positiveText = positiveText,
          negativeText = negativeText,
          onPositiveClick = onPositiveClick,
          onNegativeClick = onNegativeClick,
        )
      }
    }
  }
}

@Composable
private fun BasicComposableDialogTitleRow(
  modifier: Modifier = Modifier,
  title: String?,
  titleIcon: ImageVector? = null,
  highlightColor: Color = MaterialTheme.colors.primary,
) {
  Row(
    modifier = modifier
      .wrapContentSize()
      .padding(horizontal = 24.dp),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.Start,
  ) {
    if (titleIcon != null) {
      Icon(
        modifier = modifier
          .wrapContentSize()
          .padding(end = 4.dp),
        imageVector = titleIcon,
        contentDescription = title,
        tint = highlightColor,
      )
    }
    if (title != null) {
      Text(
        modifier = modifier.wrapContentSize(),
        text = title,
        color = highlightColor,
      )
    }
  }
}

@Composable
private fun BasicComposableDialogButtonsRow(
  modifier: Modifier = Modifier,
  highlightColor: Color = MaterialTheme.colors.primary,
  positiveText: String? = stringResource(id = android.R.string.ok),
  negativeText: String? = stringResource(id = android.R.string.cancel),
  onPositiveClick: () -> Unit = {},
  onNegativeClick: () -> Unit = {},
) {
  Row(
    modifier = modifier
      .fillMaxWidth()
      .wrapContentHeight(),
    horizontalArrangement = Arrangement.End,
    verticalAlignment = Alignment.CenterVertically,
  ) {
    if (negativeText != null) {
      TextButton(
        modifier = modifier.wrapContentSize(),
        onClick = { onNegativeClick.invoke() },
      ) {
        Text(
          modifier = modifier.wrapContentSize(),
          text = negativeText,
          color = highlightColor,
        )
      }
    }
    if (positiveText != null) {
      TextButton(
        modifier = modifier.wrapContentSize(),
        onClick = { onPositiveClick.invoke() },
      ) {
        Text(
          modifier = modifier.wrapContentSize(),
          text = positiveText,
          color = highlightColor,
        )
      }
    }
  }
}

@PreviewThemes
@Composable
private fun PreviewBasicComposableDialog() {
  PreviewScreen {
    BasicComposableDialog(
      titleIcon = Icons.Filled.Warning,
      title = "Hello world",
    ) {
      CircularProgressIndicator(progress = 0.5f)
    }
  }
}

@PreviewThemes
@Composable
private fun PreviewBasicComposableDialogWithTint() {
  PreviewScreen {
    BasicComposableDialog(
      titleIcon = Icons.Filled.Check,
      title = "Hello world",
      highlightColor = MaterialTheme.colors.onSurfaceGreen,
    ) {
      CircularProgressIndicator(
        progress = 0.5f,
        color = MaterialTheme.colors.onSurfaceGreen,
      )
    }
  }
}

@PreviewThemes
@Composable
private fun PreviewBasicComposableDialogWithoutTitle() {
  PreviewScreen {
    BasicComposableDialog(
      titleIcon = null,
      title = null,
    ) {
      CircularProgressIndicator(
        progress = 0.5f,
      )
    }
  }
}
