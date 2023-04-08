package com.jonapoul.alakazam.ui.compose

import android.annotation.SuppressLint
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.ImageBitmap as ComposeImageBitmap
import androidx.compose.ui.graphics.painter.Painter as ComposePainter
import androidx.compose.ui.graphics.vector.ImageVector as ComposeImageVector

@SuppressLint("ComposableNaming")
sealed interface ComposeDrawable {
    class Painter(private val painter: ComposePainter) : ComposeDrawable {
        @Composable
        override fun compose(contentDescription: String?, modifier: Modifier, tint: Color) {
            Icon(
                modifier = modifier,
                painter = painter,
                tint = tint,
                contentDescription = contentDescription,
            )
        }
    }

    class ImageVector(private val imageVector: ComposeImageVector) : ComposeDrawable {
        @Composable
        override fun compose(contentDescription: String?, modifier: Modifier, tint: Color) {
            Icon(
                modifier = modifier,
                imageVector = imageVector,
                tint = tint,
                contentDescription = contentDescription,
            )
        }
    }

    class ImageBitmap(private val imageBitmap: ComposeImageBitmap) : ComposeDrawable {
        @Composable
        override fun compose(contentDescription: String?, modifier: Modifier, tint: Color) {
            val bitmapPainter = remember(imageBitmap) { BitmapPainter(imageBitmap) }
            Painter(bitmapPainter).compose(contentDescription, modifier, tint)
        }
    }

    @Composable
    fun compose(
        contentDescription: String?,
        modifier: Modifier,
        tint: Color,
    )
}

@Composable
fun defaultDrawableColor(): Color = LocalContentColor.current.copy(alpha = LocalContentAlpha.current)

fun ComposePainter.asDrawable(): ComposeDrawable =
    ComposeDrawable.Painter(this)

fun ComposeImageVector.asDrawable(): ComposeDrawable =
    ComposeDrawable.ImageVector(this)

fun ComposeImageBitmap.asDrawable(): ComposeDrawable =
    ComposeDrawable.ImageBitmap(this)
