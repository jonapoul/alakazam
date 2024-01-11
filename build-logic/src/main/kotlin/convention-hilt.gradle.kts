import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.the

plugins {
  id("convention-android")
  id("com.google.dagger.hilt.android")
  kotlin("kapt")
}

val libs = the<LibrariesForLibs>()
val kapt by configurations

dependencies {
  implementation(libs.androidx.hilt.android)
  kapt(libs.androidx.hilt.compiler)
  testImplementation(libs.test.androidx.hilt)
}
