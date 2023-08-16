plugins {
  id("convention-android")
  id("convention-desugaring")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.test.db"
}

dependencies {
  implementation(projects.kotlinCore)

  api(libs.androidx.room.ktx)
  api(libs.androidx.room.runtime)

  api(libs.test.androidx.coreKtx)
  api(libs.test.androidx.room)
}
