package alakazam.gradle

import blueprint.recipes.ideaBlueprint
import blueprint.recipes.kotlinBaseBlueprint
import blueprint.recipes.kotlinMultiplatformBlueprint
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinMultiplatformPluginWrapper

class ModuleMultiplatform : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    with(pluginManager) {
      apply(KotlinMultiplatformPluginWrapper::class)
      apply(ConventionPublish::class)
      apply(ConventionStyle::class)
      apply(ConventionTest::class)
      // apply(DependencyAnalysisPlugin::class) // doesn't work
    }

    kotlinBaseBlueprint()
    kotlinMultiplatformBlueprint()
    ideaBlueprint()

    extensions.configure<KotlinMultiplatformExtension> {
      compilerOptions {
        freeCompilerArgs.add("-opt-in=kotlin.time.ExperimentalTime")
      }
    }
  }
}
