import blueprint.recipes.androidResourcesBlueprint

plugins {
  alias(libs.plugins.module.android)
}

android {
  namespace = "alakazam.android.ui.appcompat"
}

androidResourcesBlueprint(viewBinding = false)

dependencies {
  api(libs.androidx.appcompat)
  api(libs.androidx.core.core)
  api(libs.androidx.fragment.core)
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.lifecycle.common)
  implementation(libs.androidx.lifecycle.viewmodel.core)
  implementation(libs.androidx.recyclerview)
}
