import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.the

plugins {
  kotlin("kapt")
  id("com.google.dagger.hilt.android")
  id("convention-android")
}

val libs = the<LibrariesForLibs>()
val kapt by configurations

dependencies {
  implementation(libs.androidx.hilt.android)
  kapt(libs.androidx.hilt.compiler)
  testImplementation(libs.test.androidx.hilt)
}
