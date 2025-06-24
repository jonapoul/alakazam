package alakazam.gradle

import com.vanniktech.maven.publish.MavenPublishPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.withType
import org.jetbrains.dokka.gradle.formats.DokkaJavadocPlugin
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class ModuleKotlin : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    with(pluginManager) {
      apply(ModuleKotlinNoPublish::class)
      apply(MavenPublishPlugin::class)
      apply(DokkaJavadocPlugin::class)
    }

    tasks.withType<KotlinCompile>().configureEach {
      compilerOptions {
        freeCompilerArgs.add("-opt-in=kotlin.time.ExperimentalTime")
      }
    }
  }
}
