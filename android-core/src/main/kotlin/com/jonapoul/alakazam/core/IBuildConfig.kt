package com.jonapoul.alakazam.core

import java.time.Instant

/**
 * Intended to give a less annoying interface to compile-time constants of the app. This way if we run a project
 * clean, any classes containing BuildConfig logic won't have angry red underlines. This is implemented in the "app"
 * module and injected anywhere else using DI.
 */
interface IBuildConfig {
  val debug: Boolean // BuildConfig.DEBUG
  val versionName: String // BuildConfig.VERSION_NAME
  val versionCode: Int // BuildConfig.VERSION_CODE
  val applicationId: String // BuildConfig.APPLICATION_ID
  val gitId: String // custom build config field
  val buildTime: Instant // custom build config field
  val os: Int // Build.VERSION.SDK_INT
  val platform: String // name of your app
  val manufacturer: String // Build.MANUFACTURER
  val model: String // Build.MODEL
}
