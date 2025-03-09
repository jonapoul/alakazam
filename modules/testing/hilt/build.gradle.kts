plugins {
  alias(libs.plugins.module.android)
  alias(libs.plugins.androidx.hilt)
  alias(libs.plugins.ksp)
}

android {
  namespace = "alakazam.test.hilt"
}

dependencies {
  api(libs.androidx.appcompat)
  api(libs.androidx.hilt.android)
  api(libs.androidx.hilt.core)
  api(libs.androidx.lifecycle.viewmodel.core)
  api(libs.test.androidx.runner)
  implementation(libs.androidx.activity.core)
  implementation(libs.androidx.annotation)
  implementation(libs.androidx.core.core)
  implementation(libs.androidx.fragment.core)
  implementation(libs.androidx.lifecycle.common)
  implementation(libs.androidx.lifecycle.livedata.core)
  implementation(libs.androidx.navigation.runtime)
  implementation(libs.test.androidx.core.core)
  implementation(libs.test.androidx.hilt)
  implementation(libs.test.androidx.navigation)
  ksp(libs.androidx.hilt.compiler)
}
