package alakazam.gradle

import com.android.build.gradle.LibraryPlugin
import com.autonomousapps.DependencyAnalysisPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class ModuleAndroid : Plugin<Project> {
  override fun apply(target: Project): Unit =
    with(target) {
      with(pluginManager) {
        apply(LibraryPlugin::class)
        apply(ConventionAndroid::class)
        apply(ConventionPublish::class)
        apply(ConventionStyle::class)
        apply(ConventionTest::class)
        apply(DependencyAnalysisPlugin::class)
      }

      tasks.withType(KotlinCompile::class).configureEach {
        compilerOptions {
          freeCompilerArgs.add("-opt-in=kotlin.time.ExperimentalTime")
        }
      }
    }
}
