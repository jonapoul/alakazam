import kotlinx.kover.gradle.plugin.dsl.AggregationType
import kotlinx.kover.gradle.plugin.dsl.MetricType
import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
  id("org.jetbrains.kotlinx.kover")
}

tasks.withType<Test> {
  testLogging {
    exceptionFormat = TestExceptionFormat.FULL
    showCauses = true
    showExceptions = true
    showStackTraces = true
    showStandardStreams = true
  }
}

val koverExcludes = listOf(
  /* Hilt */
  "*.di.*",

  /* AGP */
  "*.BuildConfig",

  /* Navigation */
  "*.*FragmentDirections*",
  "*.*FragmentArgs*",

  /* UI classes */
  "*.*Binding",
//   "*.ui.*",

  /* Hilt modules */
  "*.di.*",

  /* Test utilities */
  "*.test.*",

  /* Sample app */
  "dev.jonpoulton.alakazam.sample.*",
)

koverReport {
  filters {
    includes { packages("dev.jonpoulton.alakazam") }
    excludes { classes(koverExcludes) }
  }

  defaults {
    xml { onCheck = false }
    html { onCheck = true }
    verify {
      onCheck = true
      rule {
        isEnabled = true
        filters {
          includes { packages("dev.jonpoulton.alakazam") }
          excludes { classes(koverExcludes) }
        }
        bound {
          minValue = 50
          metric = MetricType.INSTRUCTION
          aggregation = AggregationType.COVERED_PERCENTAGE
        }
      }
    }
  }
}

rootProject.dependencies {
  /* Include this module in test coverage */
  kover(project)
}
