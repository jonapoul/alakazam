import blueprint.recipes.androidComposeBlueprint

plugins {
  alias(libs.plugins.module.android)
}

android {
  namespace = "alakazam.android.ui.compose"
}

androidComposeBlueprint(
  composeBomVersion = libs.versions.androidx.compose.bom,
  composeLintVersion = libs.versions.androidx.compose.lint.slack,
  experimentalApis = listOf(
    "androidx.compose.foundation.ExperimentalFoundationApi",
    "androidx.compose.material.ExperimentalMaterialApi",
  ),
)

dependencies {
  api(libs.androidx.compose.material.core)
  api(libs.androidx.compose.runtime)
  debugImplementation(libs.androidx.compose.ui.tooling)
  implementation(libs.androidx.compose.foundation.core)
  implementation(libs.androidx.compose.ui.core)
  implementation(libs.androidx.compose.ui.graphics)
  implementation(libs.androidx.compose.ui.preview)
}
