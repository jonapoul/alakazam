package alakazam.gradle

import kotlinx.validation.BinaryCompatibilityValidatorPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinBaseExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class ConventionKotlinBase : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    pluginManager.apply(BinaryCompatibilityValidatorPlugin::class)

    tasks.withType<KotlinCompile>().configureEach {
      compilerOptions {
        freeCompilerArgs.addAll(
          "-Xjvm-default=all-compatibility",
          "-opt-in=kotlin.RequiresOptIn",
          "-Xexplicit-api=strict",
        )
      }
    }

    extensions.configure(KotlinBaseExtension::class) {
      explicitApi()
    }

    tasks.register("compileAll") {
      dependsOn(tasks.withType<KotlinCompile>())
    }
  }
}
