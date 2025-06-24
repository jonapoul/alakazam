import blueprint.core.androidUnitTestDependencies
import blueprint.core.commonMainDependencies
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  alias(libs.plugins.module.multiplatform)
  alias(libs.plugins.ksp)
}

android {
  namespace = "alakazam.db.room"
}

tasks.withType<KotlinCompile>().configureEach {
  compilerOptions {
    freeCompilerArgs.add("-opt-in=kotlin.uuid.ExperimentalUuidApi")
  }
}

kotlin {
  commonMainDependencies {
    api(libs.kotlin.stdlib)
    implementation(libs.androidx.room.common)
  }

  androidUnitTestDependencies {
    implementation(libs.androidx.room.ktx)
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.sqlite)
    implementation(libs.test.junit)
    implementation(libs.test.kotlin.core)
    implementation(libs.test.kotlin.coroutines)
    implementation(libs.test.robolectric)
    implementation(projects.modules.testing.room)
  }
}

val kspAndroidTest by configurations
dependencies {
  kspAndroidTest(libs.androidx.room.compiler)
}
