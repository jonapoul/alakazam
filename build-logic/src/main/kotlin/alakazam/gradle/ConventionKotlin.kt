package alakazam.gradle

import blueprint.recipes.kotlinJvmBlueprint
import org.gradle.api.Plugin
import org.gradle.api.Project

class ConventionKotlin : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    kotlinJvmBlueprint()
  }
}
