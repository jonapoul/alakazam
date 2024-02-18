plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "alakazam.test.db"
}

dependencies {
  implementation(projects.modules.kotlin.core)

  api(libs.androidx.roomKtx)
  api(libs.androidx.room.runtime)

  api(libs.test.androidx.coreKtx)
  api(libs.test.androidx.room)
}
