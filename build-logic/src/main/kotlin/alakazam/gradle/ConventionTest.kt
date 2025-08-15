package alakazam.gradle

import blueprint.core.getVersion
import blueprint.core.libs
import blueprint.recipes.TestVersions
import blueprint.recipes.koverBlueprint
import blueprint.recipes.powerAssertBlueprint
import blueprint.recipes.testBlueprint
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

@OptIn(ExperimentalKotlinGradlePluginApi::class)
class ConventionTest : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    koverBlueprint()

    powerAssertBlueprint()

    testBlueprint(
      versions = TestVersions(
        alakazam = null,
        androidxArch = libs.getVersion("androidx.arch.test"),
        androidxCoreKtx = null,
        androidxJunit = libs.getVersion("androidx.junit"),
        androidxRules = libs.getVersion("androidx.rules"),
        androidxRunner = libs.getVersion("androidx.runner"),
        coroutines = libs.getVersion("kotlinx.coroutines"),
        junit = libs.getVersion("junit"),
        kotlin = libs.getVersion("kotlin"),
        mockk = libs.getVersion("mockk"),
        robolectric = libs.getVersion("robolectric"),
        turbine = libs.getVersion("turbine"),
      )
    )

    tasks.withType<KotlinCompile>().configureEach {
      compilerOptions {
        freeCompilerArgs.add("-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi")
      }
    }

    tasks.withType<Test>().configureEach {
      // To work around https://github.com/gradle/gradle/issues/33619
      failOnNoDiscoveredTests.set(false)
    }
  }
}
