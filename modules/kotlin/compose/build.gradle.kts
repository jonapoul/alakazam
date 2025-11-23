import blueprint.core.androidMainDependencies
import blueprint.core.commonMainDependencies

plugins {
  alias(libs.plugins.module.multiplatform)
  alias(libs.plugins.kotlin.compose)
  alias(libs.plugins.compose)
}

kotlin.android {
  namespace = "alakazam.kotlin.compose"
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
    api(compose.foundation)
    api(compose.material3)
    api(compose.runtime)
    implementation(compose.ui)
    implementation(compose.preview)
    implementation(compose.uiTooling)
  }

  androidMainDependencies {
    // TBC
  }
}

dependencies {
  lintChecks(libs.androidx.compose.lint.slack)
}
