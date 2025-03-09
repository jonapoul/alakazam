import blueprint.core.commonMainDependencies
import blueprint.core.jvmMainDependencies

plugins {
  alias(libs.plugins.module.multiplatform)
}

android {
  namespace = "alakazam.db.sqldelight"
}

kotlin {
  commonMainDependencies {
    api(libs.sqldelight.runtime)
    compileOnly(libs.kotlinx.datetime)
    compileOnly(libs.kotlinx.serialization.core)
    compileOnly(libs.kotlinx.serialization.json)
    implementation(projects.modules.kotlin.core)
  }

  jvmMainDependencies {
    api(libs.sqldelight.driver.sqlite)
  }
}
