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

  testImplementation(projects.testingAndroid)
  testImplementation(libs.androidx.test.runner)
  testImplementation(libs.robolectric)

  testImplementation(projects.testingDb)
  testImplementation(libs.room.ktx)
  testImplementation(libs.room.runtime)
  kaptTest(libs.room.compiler)
}
