package alakazam.android.core

import android.annotation.SuppressLint
import android.os.Build
import kotlinx.datetime.Instant

/**
 * Intended to give a less annoying interface to compile-time constants of the app. This way if we run a project
 * clean, any classes containing BuildConfig logic won't have angry red underlines. This is implemented in the "app"
 * module and injected anywhere else using DI.
 */
public interface IBuildConfig {
  public val debug: Boolean // BuildConfig.DEBUG
  public val versionName: String // BuildConfig.VERSION_NAME
  public val versionCode: Int // BuildConfig.VERSION_CODE
  public val applicationId: String // BuildConfig.APPLICATION_ID
  public val gitId: String // custom build config field
  public val buildTime: Instant // custom build config field
  public val platform: String // name of your app
  public val os: Int // Build.VERSION.SDK_INT
  public val manufacturer: String // Build.MANUFACTURER
  public val model: String // Build.MODEL
  public val repoName: String // e.g. "jonapoul/alakazam"
  public val repoUrl: String // e.g. "https://github.com/jonapoul/alakazam"
}

@Suppress("FunctionName")
@SuppressLint("AnnotateVersionCheck")
public fun BuildConfig(
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
