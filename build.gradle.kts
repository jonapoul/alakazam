import com.diffplug.gradle.spotless.SpotlessExtension
import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask
import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import kotlinx.kover.api.CounterType
import kotlinx.kover.api.KoverMergedConfig
import kotlinx.kover.api.KoverProjectConfig
import kotlinx.kover.api.VerificationTarget
import kotlinx.kover.api.VerificationValueType
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.jetbrains.dokka.gradle.DokkaMultiModuleTask
import org.jetbrains.dokka.gradle.DokkaTask
import org.jlleitschuh.gradle.ktlint.KtlintExtension
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

buildscript {
  repositories {
    gradlePluginPortal()
    mavenCentral()
    google()
  }

  dependencies {
    classpath(libs.plugin.agp)
    classpath(libs.plugin.detekt)
    classpath(libs.plugin.dokka)
    classpath(libs.plugin.hilt)
    classpath(libs.plugin.kotlin.gradle)
    classpath(libs.plugin.kotlin.serialization)
    classpath(libs.plugin.kover)
    classpath(libs.plugin.ktlint)
    classpath(libs.plugin.maven.publish)
    classpath(libs.plugin.navigation)
    classpath(libs.plugin.spotless)
    classpath(libs.plugin.versions)
  }
}

/* Detekt config */
allprojects {
  apply(plugin = "io.gitlab.arturbosch.detekt")
  extensions.configure<DetektExtension> {
    config.setFrom(files("${rootProject.rootDir}/detekt.yml"))
    buildUponDefaultConfig = true
  }
  tasks.withType<Detekt> {
    reports.html.required.set(true)
  }
}
/* Dokka config */
allprojects {
  apply(plugin = "org.jetbrains.dokka")
  tasks.withType<DokkaTask> {
    dokkaSourceSets.configureEach {
      includeNonPublic.set(false)
      skipEmptyPackages.set(true)
      reportUndocumented.set(true)
      noAndroidSdkLink.set(false)
    }
  }
  tasks.withType<DokkaMultiModuleTask> {
    outputDirectory.set(File("${rootProject.rootDir}/docs/api"))
  }
}
subprojects {
  afterEvaluate {
// Attach the dokka task to build afterwards, since the build task doesn't exist right now.
    tasks.getByName("build").dependsOn("dokkaHtml")
  }
}
/* Ktlint config */
allprojects {
  apply(plugin = "org.jlleitschuh.gradle.ktlint")
  extensions.configure<KtlintExtension> {
    version.set(rootProject.libs.versions.ktlint.cli.get())
    reporters {
      reporter(ReporterType.HTML)
    }
  }
}
/* Spotless config */
allprojects {
  apply(plugin = "com.diffplug.spotless")
  extensions.configure<SpotlessExtension> {
    format("misc") {
      target("*.gradle", "*.gitignore", "*.pro")
      indentWithSpaces()
      trimTrailingWhitespace()
      endWithNewline()
    }
    freshmark {
      target("*.md")
    }
    json {
      target("*.json")
      simple()
    }
    yaml {
      target("*.yml", "*.yaml")
      jackson()
    }
  }
}

/* Dependency versions config */
apply(plugin = "com.github.ben-manes.versions")
tasks.withType<DependencyUpdatesTask> {
  rejectVersionIf {
    !candidate.version.isStable() && currentVersion.isStable()
  }
}
fun String.isStable(): Boolean = listOf("alpha", "beta", "rc").none { lowercase().contains(it) }
/* Kover konfig */
val koverIncludes = listOf("dev.jonpoulton.alakazam.*")
val koverExcludes = listOf(
  /* Hilt */
  "*.di.*",
  /* Generated classes */
  "*.BuildConfig",
  /* Navigation */
  "*.*FragmentDirections*",
  "*.*FragmentArgs*",
  /* UI classes */
  "*.*Binding",
  "*.ui.*",
  /* Hilt modules */
  "*.di.*",
  /* Test utilities */
  "*.test.*",
  /* Sample app */
  "dev.jonpoulton.alakazam.sample.*",
)

allprojects {
  apply(plugin = "kover")
}
extensions.configure<KoverMergedConfig> {
  enable()
  filters {
    classes {
      includes.addAll(koverIncludes)
      excludes.addAll(koverExcludes)
    }
  }
}
extensions.configure<KoverProjectConfig> {
  filters {
    classes {
      includes.addAll(koverIncludes)
      excludes.addAll(koverExcludes)
    }
  }
  verify {
    onCheck.set(true)
    rule {
      isEnabled = true
      target = VerificationTarget.ALL
      bound {
        minValue = 60
        counter = CounterType.INSTRUCTION
        valueType = VerificationValueType.COVERED_PERCENTAGE
      }
    }
  }
}

allprojects {
  tasks.create("runChecks") {
    dependsOn("detekt", "spotlessCheck", "ktlintCheck")
  }

  repositories {
    mavenCentral()
    google()
  }
}

subprojects {
  tasks.withType<Test> {
    testLogging {
      exceptionFormat = TestExceptionFormat.FULL
      showCauses = true
      showExceptions = true
      showStackTraces = true
      showStandardStreams = true
    }
  }
}
