import blueprint.recipes.androidResourcesBlueprint

plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "alakazam.android.prefs.ui"
}

androidResourcesBlueprint(viewBinding = false)

dependencies {
  api(libs.androidx.core.core)
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.fragment.core)
  implementation(libs.androidx.lifecycle.viewmodel.core)
  implementation(libs.androidx.preference)
  implementation(libs.androidx.recyclerview)
  implementation(libs.timber)
  implementation(projects.modules.android.core)
}
