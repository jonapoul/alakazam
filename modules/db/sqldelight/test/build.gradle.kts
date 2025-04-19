import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  alias(libs.plugins.module.kotlinNoPublish)
  alias(libs.plugins.sqldelight)
  alias(libs.plugins.kotlin.serialization)
}

tasks.withType<KotlinCompile> {
  compilerOptions {
    freeCompilerArgs.add("-opt-in=kotlin.uuid.ExperimentalUuidApi")
  }
}

sqldelight {
  databases {
    create("TestDatabase") {
      packageName = "alakazam.db.sqldelight.test"
    }
  }
}

dependencies {
  implementation(libs.kotlinx.datetime)
  implementation(libs.kotlinx.serialization.core)
  implementation(libs.kotlinx.serialization.json)
  implementation(libs.sqldelight.runtime)
  implementation(projects.modules.db.sqldelight)
  implementation(projects.modules.kotlin.core)
  testImplementation(libs.test.kotlin.common)
  testImplementation(libs.test.kotlin.junit)
}
