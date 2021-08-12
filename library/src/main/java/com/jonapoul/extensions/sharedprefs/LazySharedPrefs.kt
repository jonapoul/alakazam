package com.jonapoul.extensions.sharedprefs

import android.content.Context
import android.content.SharedPreferences
import androidx.fragment.app.Fragment
import androidx.preference.PreferenceManager

fun Context.sharedPrefs(
    name: String? = null,
    mode: Int = Context.MODE_PRIVATE
): Lazy<SharedPreferences> = LazySharedPreferences(name, mode) { this }

fun Fragment.sharedPrefs(
    name: String? = null,
    mode: Int = Context.MODE_PRIVATE
): Lazy<SharedPreferences> = LazySharedPreferences(name, mode) { requireContext() }

internal class LazySharedPreferences(
    private val name: String?,
    private val mode: Int,
    private val contextFactory: () -> Context
) : Lazy<SharedPreferences> {

    private var cached: SharedPreferences? = null

    override val value: SharedPreferences
        get() = cached ?: getPrefs().also { cached = it }

    override fun isInitialized(): Boolean = cached != null

    private fun getPrefs(): SharedPreferences {
        val context = contextFactory.invoke()
        return if (name == null) {
            PreferenceManager.getDefaultSharedPreferences(context)
        } else {
            context.getSharedPreferences(name, mode)
        }
    }
}
