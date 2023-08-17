plugins {
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.ui.core"

  buildFeatures {
    resValues = true
  }
}

dependencies {
  implementation(projects.kotlinCore)
  implementation(projects.androidCore)
  implementation(libs.androidx.appcompat)
  implementation(libs.androidx.fragmentKtx)
  implementation(libs.androidx.navigation.fragment)
  implementation(libs.androidx.navigation.ui)
  implementation(libs.androidx.recyclerview)
  implementation(libs.material)
}
