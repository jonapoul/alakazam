import blueprint.core.commonMainDependencies
import blueprint.core.commonTestDependencies

plugins {
  id("alakazam.module.kotlin")
}

kotlin {
  compilerOptions {
    freeCompilerArgs.add("-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi")
  }

  commonMainDependencies {
    api(kotlin("test"))
    api(libs.test.junit)
    api(libs.test.kotlin.coroutines)
    compileOnly(libs.kotlinx.coroutines)
    compileOnly(libs.test.turbine)
    compileOnly(project(":alakazam-kotlin"))
  }

  commonTestDependencies {
    implementation(libs.kotlinx.coroutines)
    implementation(libs.test.turbine)
    implementation(project(":alakazam-kotlin"))
  }
}
