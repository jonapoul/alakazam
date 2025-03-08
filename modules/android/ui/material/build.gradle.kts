import blueprint.recipes.androidResourcesBlueprint

plugins {
  alias(libs.plugins.module.android)
}

android {
  namespace = "alakazam.android.ui.material"
}

androidResourcesBlueprint(viewBinding = false)

dependencies {
  api(libs.androidx.appcompat)
  api(libs.androidx.fragment.core)
  api(libs.material)
  api(projects.modules.android.core)
  implementation(libs.androidx.cardview)
  implementation(projects.modules.android.ui.appcompat)
  implementation(projects.modules.android.ui.core)
  implementation(projects.modules.kotlin.core)
}
