package alakazam.gradle

import blueprint.recipes.ideaBlueprint
import blueprint.recipes.kotlinJvmBlueprint
import com.autonomousapps.DependencyAnalysisPlugin
import com.dropbox.gradle.plugins.dependencyguard.DependencyGuardPlugin
import com.dropbox.gradle.plugins.dependencyguard.DependencyGuardPluginExtension
import com.vanniktech.maven.publish.MavenPublishPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.jetbrains.dokka.gradle.formats.DokkaJavadocPlugin
import org.jetbrains.kotlin.gradle.plugin.KotlinAndroidPluginWrapper

class ModuleAndroid : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    with(pluginManager) {
      apply(KotlinAndroidPluginWrapper::class)
      apply(ConventionAndroid::class)
      apply(MavenPublishPlugin::class)
      apply(DokkaJavadocPlugin::class)
      apply(ConventionStyle::class)
      apply(ConventionTest::class)
      apply(DependencyAnalysisPlugin::class.java)
      apply(DependencyGuardPlugin::class)
    }

    kotlinJvmBlueprint()
    ideaBlueprint()

    extensions.configure<DependencyGuardPluginExtension> {
      configuration("releaseRuntimeClasspath")
    }
  }
}
