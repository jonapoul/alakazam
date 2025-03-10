import blueprint.core.commonMainDependencies

plugins {
  alias(libs.plugins.module.multiplatform)
}

android {
  namespace = "alakazam.test.core"
}

configurations.configureEach {
  exclude(group = "org.junit.jupiter")
}

kotlin {
  compilerOptions {
    freeCompilerArgs.add("-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi")
  }

  commonMainDependencies {
    api(libs.test.junit)
    api(libs.test.kotlin.common)
    api(libs.test.kotlin.coroutines)
    api(libs.test.kotlin.junit)
    compileOnly(libs.kotlinx.coroutines.core)
    compileOnly(libs.kotlinx.datetime)
    compileOnly(libs.test.turbine)
    compileOnly(projects.modules.kotlin.core)
  }
}
