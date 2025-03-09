package alakazam.gradle

import blueprint.recipes.ideaBlueprint
import com.autonomousapps.DependencyAnalysisPlugin
import com.dropbox.gradle.plugins.dependencyguard.DependencyGuardPlugin
import com.dropbox.gradle.plugins.dependencyguard.DependencyGuardPluginExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.plugin.KotlinPluginWrapper

class ModuleKotlin : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    with(pluginManager) {
      apply(KotlinPluginWrapper::class)
      apply(ConventionKotlin::class)
      apply(ConventionPublish::class)
      apply(ConventionStyle::class)
      apply(ConventionTest::class)
      apply(DependencyAnalysisPlugin::class.java)
      apply(DependencyGuardPlugin::class)
    }

    ideaBlueprint()

    extensions.configure<DependencyGuardPluginExtension> {
      configuration("runtimeClasspath")
    }
  }
}
