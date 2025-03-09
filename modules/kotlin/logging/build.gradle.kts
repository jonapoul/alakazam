import blueprint.core.androidMainDependencies
import blueprint.core.commonMainDependencies

plugins {
  alias(libs.plugins.module.multiplatform)
}

android {
  namespace = "alakazam.kotlin.logging"
}

kotlin {
  commonMainDependencies {
    api(libs.kotlin.stdlib)
  }

  androidMainDependencies {
    implementation(libs.slf4j)
  }
}
