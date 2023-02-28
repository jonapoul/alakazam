package com.jonapoul.common.core

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.core.content.ContextCompat
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import kotlin.reflect.KClass

class ActivityLauncher @Inject constructor(
    @ApplicationContext private val context: Context,
) {
    fun launch(
        action: String,
        data: Uri? = null,
        flags: Int? = null,
        options: Bundle? = null,
    ) {
        val intent = Intent(action)
        data?.let { intent.data = it }
        flags?.let { intent.flags = it }
        ContextCompat.startActivity(context, intent, options)
    }

    fun <T : Activity> launch(
        activityClass: KClass<T>,
        data: Uri? = null,
        flags: Int? = null,
        options: Bundle? = null,
    ) {
        val intent = Intent(context, activityClass.java)
        data?.let { intent.data = it }
        flags?.let { intent.flags = it }
        ContextCompat.startActivity(context, intent, options)
    }
}
