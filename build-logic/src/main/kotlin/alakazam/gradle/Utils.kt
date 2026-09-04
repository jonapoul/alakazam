package alakazam.gradle

import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.provider.Provider
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

internal fun Project.javaVersionString(): Provider<String> =
  providers.gradleProperty("alakazam.javaVersion")

internal fun Project.javaVersionInt(): Provider<Int> = javaVersionString().map(String::toInt)

internal fun Project.javaVersion(): Provider<JavaVersion> =
  javaVersionInt().map(JavaVersion::toVersion)

internal fun Project.jvmTarget(): Provider<JvmTarget> =
  javaVersionString().map(JvmTarget::fromTarget)

internal fun Project.namespace(): String =
  path.split(":", "-").filter { it.isNotBlank() }.joinToString(".")
