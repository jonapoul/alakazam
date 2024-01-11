package dev.jonpoulton.alakazam.tak.compose.text

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope

internal fun DrawScope.pressedBorder(color: Color, thicknessPx: Float) {
  // Top
  drawRect(
    color = color,
    size = Size(width = size.width, height = thicknessPx),
  )

  // Bottom
  drawRect(
    color = color,
    topLeft = Offset(0f, y = size.height - thicknessPx),
    size = Size(width = size.width, height = thicknessPx),
  )

  // Left
  drawRect(
    color = color,
    size = Size(width = thicknessPx, height = size.height),
  )

  // Right
  drawRect(
    color = color,
    topLeft = Offset(x = size.width - thicknessPx, y = 0f),
    size = Size(width = thicknessPx, height = size.height),
  )
}

internal fun DrawScope.enteredBorder(color: Color, smallThicknessPx: Float, largeThicknessPx: Float) {
  // Bottom
  drawRect(
    color = color,
    topLeft = Offset(0f, y = size.height - smallThicknessPx),
    size = Size(width = size.width, height = smallThicknessPx),
  )

  // Left
  drawRect(
    color = color,
    size = Size(width = largeThicknessPx, height = size.height),
  )
}

internal fun DrawScope.bottomBorder(color: Color, thicknessPx: Float) {
  drawRect(
    color = color,
    topLeft = Offset(0f, y = size.height - thicknessPx),
    size = Size(width = size.width, height = thicknessPx),
  )
}


internal fun DrawScope.topBorder(color: Color, thicknessPx: Float) {
  drawRect(
    color = color,
    size = Size(width = size.width, height = thicknessPx),
  )
}
