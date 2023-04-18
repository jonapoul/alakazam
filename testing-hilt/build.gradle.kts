plugins {
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
  id("com.google.dagger.hilt.android")
  id("com.vanniktech.maven.publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.test.hilt"
  compileSdk = BuildConstants.COMPILE_SDK

  androidDefaultConfig()
  androidCompileOptions(desugaring = false)
  androidKotlinOptions()
  androidBuildFeatures()
  androidPackagingOptions()
  androidTestOptions()
}

dependencies {
  implementation(projects.androidCore)
  api(projects.testingCore)

  /* General runtime */
  api(libs.appcompat)
  api(libs.lifecycle.runtime)

  /* DI */
  implementation(libs.hilt.android)
  api(libs.hilt.test)
  kapt(libs.hilt.compiler)

  /* Testing */
  api(libs.androidx.test.navigation)
  api(libs.androidx.test.runner)

  api(libs.androidx.test.fragment)
}
