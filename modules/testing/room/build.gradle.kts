plugins {
  alias(libs.plugins.module.android)
}

android {
  namespace = "alakazam.test.room"
}

dependencies {
  api(libs.androidx.room.runtime)
  api(libs.test.androidx.core.ktx)
  api(libs.test.junit)
  implementation(projects.modules.kotlin.core)
}
