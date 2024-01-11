import org.gradle.accessors.dm.LibrariesForLibs

configurations.configureEach {
  // Exclude dependencies which are already included in the SDK jar
  exclude(group = "androidx.activity", module = "activity")
  exclude(group = "androidx.annotation", module = "annotation")
  exclude(group = "androidx.annotation", module = "annotation-experimental")
  exclude(group = "androidx.appcompat", module = "appcompat")
  exclude(group = "androidx.arch.core", module = "core-common")
  exclude(group = "androidx.arch.core", module = "core-runtime")
  exclude(group = "androidx.collection", module = "collection")
  exclude(group = "androidx.core", module = "core")
  exclude(group = "androidx.customview", module = "customview")
  exclude(group = "androidx.exifinterface", module = "exifinterface")
  exclude(group = "androidx.fragment", module = "fragment")
  exclude(group = "androidx.lifecycle", module = "lifecycle")
  exclude(group = "androidx.lifecycle", module = "lifecycle-common")
  exclude(group = "androidx.lifecycle", module = "lifecycle-livedata-core")
  exclude(group = "androidx.lifecycle", module = "lifecycle-process")
  exclude(group = "androidx.lifecycle", module = "lifecycle-runtime")
  exclude(group = "androidx.lifecycle", module = "lifecycle-viewmodel")
  exclude(group = "androidx.lifecycle", module = "lifecycle-viewmodel-savedstate")
  exclude(group = "androidx.preference", module = "preference")
  exclude(group = "androidx.savedstate", module = "savedstate")
}

val compileOnly by configurations
val testImplementation by configurations
val androidTestImplementation by configurations

val libs = the<LibrariesForLibs>()

// Fetch these off my local machine
dependencies {
  compileOnly(libs.atak.sdk)
  testImplementation(libs.atak.sdk)
  androidTestImplementation(libs.atak.sdk)
}
