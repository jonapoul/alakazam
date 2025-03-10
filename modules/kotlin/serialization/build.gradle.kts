import blueprint.core.commonMainDependencies
import blueprint.core.commonTestDependencies

plugins {
  alias(libs.plugins.module.multiplatform)
  alias(libs.plugins.kotlin.serialization)
}

android {
  namespace = "alakazam.kotlin.serialization"
}

kotlin {
  commonMainDependencies {
    api(libs.kotlinx.serialization.core)
  }

  commonTestDependencies {
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.test.junit)
    implementation(libs.test.kotlin.core)
    implementation(libs.test.kotlin.coroutines)
  }
}
