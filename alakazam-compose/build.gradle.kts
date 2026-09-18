import blueprint.core.commonMainDependencies

plugins {
  id("alakazam.module.kotlin")
  alias(libs.plugins.kotlin.compose)
  alias(libs.plugins.compose)
}

kotlin {
  commonMainDependencies {
    api(libs.compose.foundation)
    api(libs.compose.runtime)
    implementation(libs.compose.ui)
  }
}

dependencies {
  lintChecks(libs.compose.lint)
}
