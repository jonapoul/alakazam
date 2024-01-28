import io.gitlab.arturbosch.detekt.Detekt
import org.gradle.accessors.dm.LibrariesForLibs
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

plugins {
  id("io.gitlab.arturbosch.detekt")
  id("org.jlleitschuh.gradle.ktlint")
}

val libs = the<LibrariesForLibs>()

detekt {
  config.setFrom(files("${rootProject.rootDir}/detekt.yml"))
  buildUponDefaultConfig = true
}

tasks.withType<Detekt> {
  reports.html.required.set(true)
}

val detektMain = tasks.findByName("detektMain")
if (detektMain != null) {
  val check by tasks
  check.dependsOn(detektMain)
}

ktlint {
  android.set(true)
  version.set(libs.versions.ktlint.cli.get())
  reporters {
    reporter(ReporterType.HTML)
  }
}
