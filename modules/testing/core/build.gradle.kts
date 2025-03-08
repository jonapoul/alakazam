import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  alias(libs.plugins.module.kotlin)
}

configurations.configureEach {
  exclude(group = "org.junit.jupiter")
}

tasks.withType<KotlinCompile> {
  compilerOptions {
    freeCompilerArgs.add("-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi")
  }
}

dependencies {
  api(libs.kotlinx.coroutines.core)
  api(libs.kotlinx.datetime)
  api(libs.test.junit)
  api(libs.test.kotlin.common)
  api(libs.test.kotlin.coroutines)
  api(libs.test.kotlin.junit)
  api(libs.test.mockk.core)
  api(libs.test.turbine)
  api(projects.modules.kotlin.core)
}
