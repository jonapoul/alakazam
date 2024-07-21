import blueprint.recipes.androidResourcesBlueprint

plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "alakazam.android.ui.viewbinding"
}

androidResourcesBlueprint(viewBinding = true)

dependencies {
  api(libs.androidx.appcompat)
  api(libs.androidx.lifecycle.common)
  api(libs.kotlinx.coroutines.core)
  implementation(libs.androidx.fragment.ktx)
  implementation(libs.androidx.lifecycle.livedata.core)
  implementation(libs.androidx.recyclerview)
  implementation(projects.modules.android.ui.core)
  implementation(projects.modules.kotlin.core)
}
