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

takDependencyGuard {
  allow("androidx.activity:activity:1.8.2")
  allow("androidx.collection:collection-jvm:1.5.0")
  allow("androidx.collection:collection:1.5.0")
}
