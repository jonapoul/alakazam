package dev.jonpoulton.alakazam.android.core

import android.annotation.SuppressLint
import android.os.Build
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
  val platform: String // name of your app
  val os: Int // Build.VERSION.SDK_INT
  val manufacturer: String // Build.MANUFACTURER
  val model: String // Build.MODEL
  val repoName: String // e.g. "jonapoul/alakazam"
  val repoUrl: String // e.g. "https://github.com/jonapoul/alakazam"
}

@Suppress("LongParameterList")
@SuppressLint("AnnotateVersionCheck")
fun buildConfig(
  debug: Boolean,
  versionName: String,
  versionCode: Int,
  applicationId: String,
  gitId: String,
  buildTime: Instant,
  platform: String,
  repoName: String,
  repoUrl: String,
): IBuildConfig = object : IBuildConfig {
  override val debug = debug
  override val versionName = versionName
  override val versionCode = versionCode
  override val applicationId = applicationId
  override val gitId = gitId
  override val buildTime = buildTime
  override val platform = platform
  override val os = Build.VERSION.SDK_INT
  override val manufacturer = Build.MANUFACTURER
  override val model = Build.MODEL
  override val repoName = repoName
  override val repoUrl = repoUrl
}
