package com.jonapoul.common.ui.notifier

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

/**
 * A method of getting an [Notifier] object into your [Fragment].
 */
fun Fragment.notifiers(): Lazy<Notifier> = LazyNotifier()

/**
 * A method of getting an [Notifier] object into your [AppCompatActivity].
 */
fun AppCompatActivity.notifiers(): Lazy<Notifier> = LazyNotifier()

internal class LazyNotifier : Lazy<Notifier> {
    private var cached: Notifier? = null

    override val value: Notifier
        get() = cached ?: Notifier().also { cached = it }

    override fun isInitialized(): Boolean = cached != null
}
