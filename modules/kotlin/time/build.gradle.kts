import blueprint.core.commonMainDependencies
import blueprint.core.commonTestDependencies

plugins {
  alias(libs.plugins.module.multiplatform)
}

kotlin.android {
  namespace = "alakazam.kotlin.time"
}

kotlin {
  commonMainDependencies {
    api(libs.kotlinx.datetime)
  }

  commonTestDependencies {
    implementation(libs.test.junit)
    implementation(libs.test.kotlin.core)
    implementation(libs.test.kotlin.coroutines)
  }
}
