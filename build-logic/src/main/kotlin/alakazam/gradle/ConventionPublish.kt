package alakazam.gradle

import com.vanniktech.maven.publish.MavenPublishPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.jetbrains.dokka.gradle.DokkaExtension
import org.jetbrains.dokka.gradle.DokkaPlugin

class ConventionPublish : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    with(pluginManager) {
      apply(MavenPublishPlugin::class)
      apply(DokkaPlugin::class)
    }

    extensions.configure<DokkaExtension> {
      dokkaPublications.configureEach {
        failOnWarning.set(true)
      }

      dokkaSourceSets.configureEach {
        suppressGeneratedFiles.set(true)
      }
    }
  }
}
