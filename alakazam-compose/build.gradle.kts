import blueprint.core.commonMainDependencies

plugins {
  id("alakazam.module.kotlin")
  alias(libs.plugins.kotlin.compose)
  alias(libs.plugins.compose)
}

kotlin {
  commonMainDependencies {
    api(compose.foundation)
    api(compose.runtime)
    implementation(compose.ui)
  }
}

dependencies {
  lintChecks(libs.compose.lint)
}

takDependencyGuard {
  allow("androidx.collection:collection-jvm:1.5.0")
  allow("androidx.collection:collection:1.5.0")
}
