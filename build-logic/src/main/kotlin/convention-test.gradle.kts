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

val isAndroid = project.isAndroid()
val shouldRunOnCheck = project == rootProject

koverReport {
  filters {
    includes { packages("dev.jonpoulton.alakazam") }
    excludes {
      classes(
        "*Hilt_*",
        "*_Factory*",
      )
      packages(
        "*hilt_aggregated_deps.*",
        "*.di.*",
      )
    }
  }

  defaults {
    if (isAndroid) {
      mergeWith("debug")
    }

    html {
      onCheck = shouldRunOnCheck
    }

    log {
      onCheck = shouldRunOnCheck
      coverageUnits = MetricType.INSTRUCTION
      aggregationForGroup = AggregationType.COVERED_PERCENTAGE
    }

    verify {
      onCheck = shouldRunOnCheck
      rule {
        isEnabled = shouldRunOnCheck
        bound {
          minValue = 50
          metric = MetricType.INSTRUCTION
          aggregation = AggregationType.COVERED_PERCENTAGE
        }
      }
    }
  }

  if (isAndroid) {
    androidReports("debug") {
      // No-op, all same config as default
    }
  }
}

rootProject.dependencies {
  // Include this module in test coverage
  kover(project)
}
