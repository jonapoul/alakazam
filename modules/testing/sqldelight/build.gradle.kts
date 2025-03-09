import blueprint.core.commonMainDependencies

plugins {
  alias(libs.plugins.module.multiplatform)
}

android {
  namespace = "alakazam.test.sqldelight"
}

kotlin {
  commonMainDependencies {
    api(libs.sqldelight.driver.sqlite)
    api(libs.test.junit)
    implementation(libs.test.kotlin.junit)
    implementation(projects.modules.db.sqldelight)
  }
}
