plugins {
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
  id("com.vanniktech.maven.publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.db"
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

  implementation(libs.room.ktx)
  implementation(libs.room.runtime)
  kapt(libs.room.compiler)

  testImplementation(projects.testingCore)

  androidTestImplementation(projects.testingAndroid)
  androidTestImplementation(projects.testingDb)
  androidTestImplementation(libs.room.ktx)
  androidTestImplementation(libs.room.runtime)
  kaptAndroidTest(libs.room.compiler)
}
