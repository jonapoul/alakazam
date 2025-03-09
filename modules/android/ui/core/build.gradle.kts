import blueprint.recipes.androidResourcesBlueprint

plugins {
  alias(libs.plugins.module.android)
}

android {
  namespace = "alakazam.android.ui.core"
}

androidResourcesBlueprint(viewBinding = false)

dependencies {
  api(libs.androidx.activity.core)
  api(libs.androidx.lifecycle.viewmodel.core)
  api(libs.androidx.recyclerview)
  api(libs.kotlinx.coroutines.core)
  implementation(libs.androidx.annotation)
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.fragment.ktx)
  implementation(libs.androidx.lifecycle.common)
  implementation(libs.androidx.lifecycle.viewmodel.ktx)
  implementation(libs.timber)
  implementation(projects.modules.android.core)
  implementation(projects.modules.kotlin.core)
}
