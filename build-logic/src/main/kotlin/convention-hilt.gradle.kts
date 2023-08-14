import gradle.kotlin.dsl.accessors._9885c8525475a2a77e0b650bdf1e3c81.implementation
import gradle.kotlin.dsl.accessors._9885c8525475a2a77e0b650bdf1e3c81.testImplementation
import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin
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
