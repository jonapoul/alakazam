package alakazam.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinBaseExtension
import org.jetbrains.kotlin.gradle.dsl.abi.ExperimentalAbiValidation
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class ConventionKotlinBase : Plugin<Project> {
  override fun apply(target: Project): Unit =
    with(target) {
      tasks.withType<KotlinCompile>().configureEach {
        compilerOptions {
          freeCompilerArgs.addAll(
            "-opt-in=kotlin.RequiresOptIn",
            "-Xexplicit-api=strict",
          )
        }
      }

      tasks.withType<Test>().configureEach {
        useJUnit()
      }

      extensions.configure(KotlinBaseExtension::class) {
        explicitApi()

        @OptIn(ExperimentalAbiValidation::class)
        abiValidation {
          referenceDumpDir.convention(layout.projectDirectory.dir("api"))
        }
      }

      tasks.register("compileAll") {
        dependsOn(tasks.withType<KotlinCompile>())
      }
    }
}
