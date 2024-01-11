plugins {
  id("convention-android")
  id("convention-compose")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.android.ui.compose"
}

dependencies {
  api(libs.androidx.coreKtx)
}
