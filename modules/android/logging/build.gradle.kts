plugins {
  alias(libs.plugins.module.android)
}

android {
  namespace = "alakazam.android.logging"
}

dependencies {
  api(projects.modules.android.core)
  implementation(libs.logback.android)
  implementation(libs.slf4j)
  implementation(libs.timber)
}
