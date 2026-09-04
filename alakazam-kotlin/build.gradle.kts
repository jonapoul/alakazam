import blueprint.core.commonMainDependencies
import blueprint.core.commonTestDependencies

plugins {
  id("alakazam.module.kotlin")
  alias(libs.plugins.kotlin.serialization)
}

kotlin {
  commonMainDependencies {
    api(libs.kotlinx.coroutines)
    api(libs.kotlinx.datetime)
    api(libs.kotlinx.serialization.core)
  }

  commonTestDependencies {
    implementation(kotlin("test"))
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.test.junit)
    implementation(libs.test.kotlin.coroutines)
    implementation(libs.test.turbine)
    implementation(project(":alakazam-kotlin"))
    implementation(project(":alakazam-testing"))
  }
}
