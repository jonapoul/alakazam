import blueprint.recipes.androidResourcesBlueprint

plugins {
  alias(libs.plugins.module.android)
}

android {
  namespace = "alakazam.android.theme"
}

androidResourcesBlueprint(viewBinding = false)

dependencies {
  implementation(libs.androidx.appcompat)
  implementation(libs.androidx.core.core)
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.preference)
  implementation(projects.modules.kotlin.core)
}
