package com.jonapoul.alakazam.core

import java.time.Instant

/**
 * Intended to give a less annoying interface to compile-time constants of the app. This way if we
 * run a project clean, any classes containing BuildConfig logic won't have angry red underlines.
 * This is implemented in the "app" module and injected anywhere else using Hilt.
 */
interface IBuildConfig {
    val debug: Boolean
    val versionName: String
    val versionCode: Int
    val gitId: String
    val buildTime: Instant
    val applicationId: String
    val os: Int
    val platform: String
    val manufacturer: String
    val model: String
}
