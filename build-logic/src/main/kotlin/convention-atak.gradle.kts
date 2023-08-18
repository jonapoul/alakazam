@file:Suppress("UnstableApiUsage")

import org.gradle.accessors.dm.LibrariesForLibs
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("android")
  id("convention-android")
}

android {
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    jvmTarget = "1.8"
    freeCompilerArgs += listOf(
      "-Xjvm-default=all-compatibility",
      "-opt-in=kotlin.RequiresOptIn",
      "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
    )
  }
}

val libs = the<LibrariesForLibs>()

dependencies {
  val atakVersion = libs.versions.atak.get()
  compileOnly("com.atakmap:sdk:${atakVersion}.+")
  testImplementation("com.atakmap:sdk:${atakVersion}.+")
  androidTestImplementation("com.atakmap:sdk:${atakVersion}.+")
}
