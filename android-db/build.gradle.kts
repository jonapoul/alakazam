plugins {
  id("convention-android")
  id("convention-desugaring")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
  id("com.google.devtools.ksp")
}

android {
  namespace = "dev.jonpoulton.alakazam.db"
}

dependencies {
  api(projects.androidCore)

  implementation(libs.androidx.room.ktx)
  implementation(libs.androidx.room.runtime)
  ksp(libs.androidx.room.compiler)

  testImplementation(projects.testingAndroid)
  testImplementation(projects.testingDb)
  testImplementation(libs.test.androidx.runner)
  testImplementation(libs.test.robolectric)
}
