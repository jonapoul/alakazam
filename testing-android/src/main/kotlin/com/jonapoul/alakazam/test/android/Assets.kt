package com.jonapoul.alakazam.test.android

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import java.io.InputStream

fun getTestAssetAsStream(filename: String): InputStream =
    ApplicationProvider.getApplicationContext<Context>()
        .resources
        .assets
        .open(filename)
