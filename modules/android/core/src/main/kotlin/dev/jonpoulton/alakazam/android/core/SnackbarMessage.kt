package dev.jonpoulton.alakazam.android.core

import android.view.View

public sealed class SnackbarMessage(public val notify: INotifier.(View) -> Unit) {
  public abstract val message: String

  public data class Info(
    override val message: String,
    val action: INotifier.Action = INotifier.EMPTY_ACTION,
  ) : SnackbarMessage({ v -> info(v, message, action) })

  public data class Success(
    override val message: String,
    val action: INotifier.Action = INotifier.EMPTY_ACTION,
  ) : SnackbarMessage({ v -> success(v, message, action) })

  public data class Caution(
    override val message: String,
    val action: INotifier.Action = INotifier.EMPTY_ACTION,
  ) : SnackbarMessage({ v -> caution(v, message, action) })

  public data class Warning(
    override val message: String,
    val action: INotifier.Action = INotifier.EMPTY_ACTION,
  ) : SnackbarMessage({ v -> warning(v, message, action) })
}
