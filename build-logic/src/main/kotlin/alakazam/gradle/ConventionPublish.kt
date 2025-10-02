package alakazam.gradle

import com.vanniktech.maven.publish.MavenPublishPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.withType
import org.jetbrains.dokka.gradle.DokkaPlugin
import org.jetbrains.dokka.gradle.DokkaTask

class ConventionPublish : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    with(pluginManager) {
      apply(MavenPublishPlugin::class)
      apply(DokkaPlugin::class)
    }

    tasks.withType<DokkaTask>().configureEach {
      failOnWarning.set(true)
    }
  }
}
