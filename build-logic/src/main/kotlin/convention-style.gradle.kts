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
  listOf(
    /* Most libraries */
    "Apache-2.0",

    /* Some other libraries */
    "MIT",

    /* Hamcrest, Protobuf */
    "BSD-3-Clause",

    /* Hamcrest */
    "BSD-2-Clause",

    /* JUnit */
    "EPL-1.0",
  ).forEach { license ->
    allow(license)
  }

  listOf<String>(
    /* Hamcrest, BSD-2-Clause */
    "http://www.opensource.org/licenses/bsd-license.php",

    /* MIT */
    "https://jsoup.org/license",
    "https://github.com/mockito/mockito/blob/master/LICENSE",
  ).forEach { url ->
    allowUrl(url)
  }
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
