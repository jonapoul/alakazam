import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.withType
import org.jetbrains.dokka.DokkaDefaults.includeNonPublic
import org.jetbrains.dokka.gradle.DokkaMultiModuleTask
import org.jetbrains.dokka.gradle.DokkaTask
import java.io.File

fun Project.configureDokka() {
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
}
