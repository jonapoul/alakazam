import io.gitlab.arturbosch.detekt.Detekt
import org.gradle.accessors.dm.LibrariesForLibs
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

plugins {
  id("app.cash.licensee")
  id("com.diffplug.spotless")
  id("io.gitlab.arturbosch.detekt")
  id("org.jlleitschuh.gradle.ktlint")
}

val libs = the<LibrariesForLibs>()

licensee {
  allow(spdxId = "Apache-2.0") /* Most libraries */
  allow(spdxId = "MIT") /* Some other libraries */
  allow(spdxId = "BSD-3-Clause") /* Hamcrest, Protobuf */
  allow(spdxId = "BSD-2-Clause") /* Hamcrest */
  allow(spdxId = "EPL-1.0") /* JUnit */

  allowUrl("http://www.opensource.org/licenses/bsd-license.php") /* Hamcrest, BSD-2-Clause */
  allowUrl("https://jsoup.org/license") /* MIT */
  allowUrl("https://github.com/mockito/mockito/blob/master/LICENSE") /* MIT */
}

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

spotless {
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
