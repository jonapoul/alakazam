@file:Suppress("DSL_SCOPE_VIOLATION")

buildscript {
  repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
    maven { url = uri("https://jitpack.io") }
    mavenLocal()
  }
  dependencies {
    classpath(libs.plugin.publish)
  }
}

plugins {
  alias(libs.plugins.agp) apply false
  alias(libs.plugins.androidCacheFix) apply false
  alias(libs.plugins.androidx.hilt) apply false
  alias(libs.plugins.androidx.navigation) apply false
  alias(libs.plugins.dependencyAnalysis)
  alias(libs.plugins.dependencyGuard)
  alias(libs.plugins.detekt) apply false
  alias(libs.plugins.doctor)
  alias(libs.plugins.dokka) apply false
  alias(libs.plugins.kotlin.android) apply false
  alias(libs.plugins.kotlin.serialization) apply false
  alias(libs.plugins.kover)
  alias(libs.plugins.ksp) apply false
  alias(libs.plugins.ktlint) apply false
  alias(libs.plugins.licensee) apply false
  alias(libs.plugins.spotless) apply false
  alias(libs.plugins.versions)
}

// Dependency versions config
tasks.dependencyUpdates.configure {
  rejectVersionIf {
    !candidate.version.isStable() && currentVersion.isStable()
  }
}

fun String.isStable(): Boolean = listOf("alpha", "beta", "rc").none { lowercase().contains(it) }

doctor {
  javaHome {
    ensureJavaHomeMatches.set(false)
    ensureJavaHomeIsSet.set(true)
    failOnError.set(true)
  }
}

dependencyAnalysis {
  // See https://github.com/autonomousapps/dependency-analysis-gradle-plugin/wiki/Customizing-plugin-behavior
  issues {
    all {
      ignoreKtx(ignore = true)

      onAny {
        // strict mode!
        severity(value = "fail")

        // https://github.com/autonomousapps/dependency-analysis-gradle-plugin/issues/884
        exclude("() -> java.io.File?")
      }

      onRuntimeOnly { exclude("com.github.tony19:logback-android", "androidx.compose.ui:ui-tooling") }
      onCompileOnly { exclude("androidx.annotation:annotation") }
      onUsedTransitiveDependencies { exclude("com.google.dagger:dagger-compiler") }
    }
  }
  dependencies {
    bundle("kotlin-stdlib") {
      includeGroup("org.jetbrains.kotlin")
    }
  }
}

dependencyGuard {
  configuration("classpath")
}
