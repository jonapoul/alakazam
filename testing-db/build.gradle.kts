plugins {
  id("convention-android")
  id("convention-desugaring")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.test.db"
}

dependencies {
  implementation(projects.androidCore)

  api(libs.androidx.room.ktx)
  api(libs.androidx.room.runtime)

  api(libs.test.androidx.coreKtx)
  api(libs.test.androidx.room)
}
