import blueprint.core.commonMainDependencies

plugins {
  alias(libs.plugins.module.multiplatform)
  alias(libs.plugins.kotlin.compose)
  alias(libs.plugins.compose)
}

android {
  namespace = "alakazam.kotlin.compose"

  buildFeatures {
    compose = true
  }
}

kotlin {
  compilerOptions {
    freeCompilerArgs.addAll(
      listOf(
        "androidx.compose.foundation.ExperimentalFoundationApi",
        "androidx.compose.material.ExperimentalMaterialApi",
      ).map { "-opt-in=$it" },
    )
  }

  commonMainDependencies {
    api(libs.compose.foundation.layout)
    api(libs.compose.material3)
    api(libs.compose.runtime)
    implementation(libs.compose.foundation.core)
    implementation(libs.compose.ui.core)
    implementation(libs.compose.ui.graphics)
    implementation(libs.compose.ui.preview)
    implementation(libs.compose.ui.tooling)
    implementation(libs.compose.ui.unit)
  }
}

dependencies {
  lintChecks("com.slack.lint.compose:compose-lint-checks:${libs.versions.androidx.compose.lint.slack.get()}")
}
