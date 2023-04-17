plugins {
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
  id("com.vanniktech.maven.publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.test.android"
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
  api(libs.timber.core)

  /* Testing */
  api(libs.androidx.test.arch)
  api(libs.androidx.test.coreKtx)
  api(libs.androidx.test.junit)
  api(libs.androidx.test.navigation)
  api(libs.androidx.test.rules)
  api(libs.androidx.test.runner)
  api(libs.kaspresso)
  api(libs.mockk.android)

  api(libs.androidx.test.fragment)
}
