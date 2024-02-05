plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-compose")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "alakazam.android.ui.compose"
}

dependencies {
  api(libs.androidx.coreKtx)
}
