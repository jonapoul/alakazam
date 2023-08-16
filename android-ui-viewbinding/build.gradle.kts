plugins {
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.ui.viewbinding"

  buildFeatures {
    resValues = true
    viewBinding = true
  }
}

dependencies {
  implementation(projects.androidUiCore)
  implementation(libs.androidx.appcompat)
  implementation(libs.androidx.fragment.ktx)
  implementation(libs.androidx.lifecycle.runtime)
  implementation(libs.androidx.recyclerview)
}
