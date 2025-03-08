package alakazam.gradle

import blueprint.core.getVersion
import blueprint.core.libs
import blueprint.recipes.kotlinJvmBlueprint
import org.gradle.api.Plugin
import org.gradle.api.Project

class ConventionKotlin : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    kotlinJvmBlueprint(libs.getVersion("kotlin"))
  }
}
