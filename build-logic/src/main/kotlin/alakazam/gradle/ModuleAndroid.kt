package alakazam.gradle

import com.android.build.gradle.LibraryPlugin
import com.autonomousapps.DependencyAnalysisPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.plugin.KotlinAndroidPluginWrapper
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import takdevx.dependencyguard.TakDependencyGuardExtension
import takdevx.dependencyguard.TakDependencyGuardPlugin

class ModuleAndroid : Plugin<Project> {
  override fun apply(target: Project): Unit =
    with(target) {
      with(pluginManager) {
        apply(KotlinAndroidPluginWrapper::class)
        apply(LibraryPlugin::class)
        apply(ConventionAndroid::class)
        apply(ConventionPublish::class)
        apply(ConventionStyle::class)
        apply(ConventionTest::class)
        apply(DependencyAnalysisPlugin::class)
        apply(TakDependencyGuardPlugin::class)
      }

      extensions.configure(TakDependencyGuardExtension::class) {
        configuration("releaseRuntimeClasspath")
      }

      tasks.withType(KotlinCompile::class).configureEach {
        compilerOptions {
          freeCompilerArgs.add("-opt-in=kotlin.time.ExperimentalTime")
        }
      }
    }
}
