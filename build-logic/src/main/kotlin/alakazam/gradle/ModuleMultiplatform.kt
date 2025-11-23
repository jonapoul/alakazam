package alakazam.gradle

import blueprint.core.intProperty
import blueprint.core.multiplatformDependencies
import blueprint.recipes.ideaBlueprint
import blueprint.recipes.kotlinBaseBlueprint
import com.android.build.api.dsl.KotlinMultiplatformAndroidLibraryTarget
import com.android.build.gradle.api.KotlinMultiplatformAndroidPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler
import org.jetbrains.kotlin.gradle.plugin.KotlinMultiplatformPluginWrapper
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension as KMPExtension

class ModuleMultiplatform : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    with(pluginManager) {
      apply(KotlinMultiplatformPluginWrapper::class)
      apply(KotlinMultiplatformAndroidPlugin::class)
      apply(ConventionPublish::class)
      apply(ConventionStyle::class)
      apply(ConventionTest::class)
    }

    kotlinBaseBlueprint()
    ideaBlueprint()

    extensions.configure(KotlinMultiplatformExtension::class) {
      applyDefaultHierarchyTemplate()
      jvm()

      extensions.configure(KotlinMultiplatformAndroidLibraryTarget::class) {
        minSdk = intProperty("blueprint.android.minSdk")
        compileSdk = intProperty("blueprint.android.compileSdk")

        packaging.resources.excludes.addAll(
          listOf(
            "META-INF/DEPENDENCIES",
            "META-INF/LICENSE*",
            "META-INF/NOTICE*",
            "META-INF/ASL2.0",
          ),
        )

        lint {
          abortOnError = true
          checkGeneratedSources = false
          checkReleaseBuilds = false
          checkTestSources = true
          explainIssues = true
          htmlReport = true
          xmlReport = true
          lintConfig = project.rootProject.file("config/lint.xml")
        }

        withHostTest {
          // For Robolectric
          isIncludeAndroidResources = true
        }
      }

      compilerOptions {
        freeCompilerArgs.add("-opt-in=kotlin.time.ExperimentalTime")
      }
    }
  }
}

fun KMPExtension.androidHostTestDependencies(handler: KotlinDependencyHandler.() -> Unit): Unit =
  multiplatformDependencies(name = "androidHostTest", handler)
