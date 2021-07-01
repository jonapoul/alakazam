package com.jonapoul.extensions.snackbar

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

/**
 * A method of getting an [INotifier] object into your [Fragment].
 */
fun Fragment.notifiers(): Lazy<INotifier> = LazyNotifier()

/**
 * A method of getting an [INotifier] object into your [AppCompatActivity].
 */
fun AppCompatActivity.notifiers(): Lazy<INotifier> = LazyNotifier()

internal class LazyNotifier : Lazy<INotifier> {
    private var cached: INotifier? = null

    override val value: INotifier
        get() = cached ?: Notifier().also { cached = it }

    override fun isInitialized(): Boolean = cached != null
}
