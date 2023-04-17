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
  androidCompileOptions()
  androidKotlinOptions()
  androidBuildFeatures()
  androidPackagingOptions()
  androidTestOptions()
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)
  implementation(projects.androidCore)

  /* General runtime */
  implementation(libs.activity)
  implementation(libs.appcompat)
  implementation(libs.fragment.ktx)

  /* Testing */
  api(libs.androidx.arch.test)
  api(libs.androidx.junit.test)
  api(libs.core.test)
  api(libs.kaspresso)
  api(libs.mockk.android)
  api(libs.navigation.testing)

  debugImplementation(libs.fragment.test)
}
