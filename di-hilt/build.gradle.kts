plugins {
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
  id("dagger.hilt.android.plugin")
  id("com.vanniktech.maven.publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.di"
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

  api(projects.androidCore)
  api(projects.androidHttp)
  api(projects.androidInit)
  api(projects.androidPrefs)
  api(projects.androidUiCore)
  api(projects.kotlinCore)

  implementation(libs.flowpreferences)
  implementation(libs.hilt.android)
  implementation(libs.preference)
  kapt(libs.hilt.compiler)

  testImplementation(projects.testingCore)
}
