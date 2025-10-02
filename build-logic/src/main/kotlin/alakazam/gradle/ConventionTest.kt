package alakazam.gradle

import blueprint.core.libs
import blueprint.core.version
import blueprint.recipes.TestVersions
import blueprint.recipes.koverBlueprint
import blueprint.recipes.powerAssertBlueprint
import blueprint.recipes.testBlueprint
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test
import org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
import org.gradle.api.tasks.testing.logging.TestLogEvent.FAILED
import org.gradle.api.tasks.testing.logging.TestLogEvent.PASSED
import org.gradle.api.tasks.testing.logging.TestLogEvent.SKIPPED
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
        androidxArch = libs.version("androidx.arch.test"),
        androidxCoreKtx = null,
        androidxJunit = libs.version("androidx.junit"),
        androidxRules = libs.version("androidx.rules"),
        androidxRunner = libs.version("androidx.runner"),
        coroutines = libs.version("kotlinx.coroutines"),
        junit = libs.version("junit"),
        kotlin = libs.version("kotlin"),
        mockk = libs.version("mockk"),
        robolectric = libs.version("robolectric"),
        turbine = libs.version("turbine"),
      ),
    )

    tasks.withType<KotlinCompile>().configureEach {
      compilerOptions {
        freeCompilerArgs.add("-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi")
      }
    }

    tasks.withType<Test>().configureEach {
      // To work around https://github.com/gradle/gradle/issues/33619
      failOnNoDiscoveredTests.set(false)

      testLogging {
        events = setOf(PASSED, SKIPPED, FAILED)
        exceptionFormat = FULL
        showCauses = true
        showExceptions = true
        showStackTraces = true
        showStandardStreams = false
        displayGranularity = 2
      }
    }
  }
}
