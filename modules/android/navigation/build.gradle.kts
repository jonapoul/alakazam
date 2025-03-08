@file:Suppress("UnstableApiUsage")

plugins {
  alias(libs.plugins.module.android)
}

android {
  namespace = "alakazam.android.navigation"
}

dependencies {
  api(libs.androidx.appcompat)
  api(libs.androidx.fragment.core)
  api(libs.androidx.navigation.common)
  api(libs.androidx.navigation.runtime)
  implementation(libs.androidx.navigation.fragment.ktx)
}
