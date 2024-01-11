plugins {
  id("convention-android")
  id("convention-atak")
  id("convention-publish")
  id("convention-style")
  kotlin("kapt")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.dagger"
}

dependencies {
  compileOnly(projects.modules.android.core)
  compileOnly(projects.modules.kotlin.core)
  compileOnly(projects.modules.kotlin.time)
  compileOnly(projects.modules.tak.core)
  api(projects.modules.tak.plugin)

  compileOnly(libs.flowpreferences)
  implementation(libs.dagger.core)
  kapt(libs.dagger.compiler)

  testImplementation(projects.modules.testing.core)
}
