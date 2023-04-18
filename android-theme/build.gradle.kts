plugins {
  id("com.android.library")
  id("kotlin-android")
  id("com.vanniktech.maven.publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.theme"
  compileSdk = BuildConstants.COMPILE_SDK

  androidDefaultConfig()
  androidCompileOptions()
  androidKotlinOptions()
  androidBuildFeatures()
  androidPackagingOptions()
  androidTestOptions()
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)

  api(projects.androidPrefs)
  api(projects.diHilt)

  implementation(libs.hilt.android)
  implementation(libs.preference)

  testImplementation(projects.testingCore)
}
