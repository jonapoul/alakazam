plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-desugaring")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
  id("com.google.devtools.ksp")
}

android {
  namespace = "alakazam.android.db"
}

dependencies {
  api(projects.modules.android.core)

  implementation(libs.androidx.roomKtx)
  implementation(libs.androidx.room.runtime)
  ksp(libs.androidx.room.compiler)
  implementation(libs.kotlinx.datetime)

  testImplementation(projects.modules.testing.android)
  testImplementation(projects.modules.testing.db)
  testImplementation(libs.test.androidx.runner)
  testImplementation(libs.test.robolectric)
}
