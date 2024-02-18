plugins {
  id("module-android")
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
  implementation(libs.androidx.room.common)
  implementation(libs.kotlinx.datetime)
  ksp(libs.androidx.room.compiler)

  testImplementation(projects.modules.testing.db)
  testImplementation(libs.androidx.room.ktx)
  testImplementation(libs.androidx.room.runtime)
  testImplementation(libs.androidx.sqlite)
  testImplementation(libs.test.junit)
  testImplementation(libs.test.kotlin.core)
  testImplementation(libs.test.kotlin.coroutines)
  testImplementation(libs.test.robolectric)
}
