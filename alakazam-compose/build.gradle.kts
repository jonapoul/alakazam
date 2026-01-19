import blueprint.core.commonMainDependencies

plugins {
  id("alakazam.module.kotlin")
  alias(libs.plugins.kotlin.compose)
  alias(libs.plugins.compose)
}

kotlin {
  commonMainDependencies {
    api(compose.foundation)
    api(compose.material3)
    api(compose.runtime)
    implementation(compose.ui)
    implementation(compose.preview)
    implementation(compose.uiTooling)
  }
}

dependencies {
  lintChecks(libs.compose.lint)
}
