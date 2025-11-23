import blueprint.core.commonMainDependencies

plugins {
  alias(libs.plugins.module.multiplatform)
}

kotlin.android {
  namespace = "alakazam.test.logging"
}

kotlin {
  commonMainDependencies {
    api(libs.test.junit)
    api(projects.modules.kotlin.logging)
  }
}
