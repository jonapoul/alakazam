plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "alakazam.test.android"
}

configurations.configureEach {
  exclude(group = "org.junit.jupiter")
}

dependencies {
  api(libs.test.androidx.core.ktx)
  api(libs.test.junit)
  implementation(libs.androidx.lifecycle.common)
  implementation(libs.timber)
}
