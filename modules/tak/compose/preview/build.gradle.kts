plugins {
  id("convention-android")
  id("convention-compose")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.compose.preview"
}

dependencies {
  implementation(projects.modules.tak.compose.core)
}
