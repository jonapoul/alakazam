package alakazam.gradle

import com.vanniktech.maven.publish.MavenPublishPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.jetbrains.dokka.gradle.formats.DokkaJavadocPlugin

class ModuleKotlin : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    with(pluginManager) {
      apply(ModuleKotlinNoPublish::class)
      apply(MavenPublishPlugin::class)
      apply(DokkaJavadocPlugin::class)
    }
  }
}
