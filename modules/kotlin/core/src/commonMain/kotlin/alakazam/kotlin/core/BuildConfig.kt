/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.core

import kotlin.time.Instant

/**
 * Intended to give a less annoying interface to compile-time constants of the app. This way if we run a project
 * clean, any classes containing BuildConfig logic won't have angry red underlines. This is implemented in the "app"
 * module and injected anywhere else using DI.
 */
public interface BuildConfig {
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

  public fun interface Provider {
    public fun get(): BuildConfig
  }
}

public data class BasicBuildConfig(
  override val debug: Boolean,
  override val versionName: String,
  override val versionCode: Int,
  override val applicationId: String,
  override val gitId: String,
  override val buildTime: Instant,
  override val platform: String,
  override val os: Int,
  override val manufacturer: String,
  override val model: String,
  override val repoName: String,
  override val repoUrl: String,
) : BuildConfig
