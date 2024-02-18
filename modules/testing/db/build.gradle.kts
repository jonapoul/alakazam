plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "alakazam.test.db"
}

dependencies {
  api(libs.androidx.room.runtime)
  api(libs.test.androidx.core.ktx)
  api(libs.test.junit)
  implementation(projects.modules.kotlin.core)
}
