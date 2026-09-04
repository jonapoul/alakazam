package alakazam.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test
import org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
import org.gradle.api.tasks.testing.logging.TestLogEvent.FAILED
import org.gradle.api.tasks.testing.logging.TestLogEvent.PASSED
import org.gradle.api.tasks.testing.logging.TestLogEvent.SKIPPED
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class ConventionTest : Plugin<Project> {
  override fun apply(target: Project): Unit =
    with(target) {
      tasks.withType(KotlinCompile::class).configureEach {
        compilerOptions {
          freeCompilerArgs.add("-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi")
        }
      }

      tasks.withType(Test::class).configureEach {
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
