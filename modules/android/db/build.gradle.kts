plugins {
  id("module-android")
  id("convention-desugaring")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
  alias(libs.plugins.ksp)
}

android {
  namespace = "alakazam.android.db"
}

dependencies {
  implementation(libs.androidx.room.common)
  implementation(libs.kotlinx.datetime)
  kspTest(libs.androidx.room.compiler)
  testImplementation(libs.androidx.room.ktx)
  testImplementation(libs.androidx.room.runtime)
  testImplementation(libs.androidx.sqlite)
  testImplementation(libs.test.junit)
  testImplementation(libs.test.kotlin.core)
  testImplementation(libs.test.kotlin.coroutines)
  testImplementation(libs.test.robolectric)
  testImplementation(projects.modules.testing.db)
}
