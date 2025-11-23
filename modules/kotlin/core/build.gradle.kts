import blueprint.core.commonMainDependencies
import blueprint.core.commonTestDependencies

plugins {
  alias(libs.plugins.module.multiplatform)
}

kotlin.android {
  namespace = "alakazam.kotlin.core"
}

kotlin {
  commonMainDependencies {
    api(libs.kotlinx.coroutines.core)
  }

  commonTestDependencies {
    implementation(libs.test.junit)
    implementation(libs.test.kotlin.core)
    implementation(libs.test.kotlin.coroutines)
    implementation(libs.test.turbine)
    implementation(projects.modules.kotlin.core)
    implementation(projects.modules.testing.core)
  }
}
