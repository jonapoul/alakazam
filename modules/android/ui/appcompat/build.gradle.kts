import blueprint.recipes.androidResourcesBlueprint

plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
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
