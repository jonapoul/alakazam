package alakazam.gradle

import blueprint.core.intProperty
import com.android.build.api.dsl.KotlinMultiplatformAndroidLibraryTarget
import com.android.build.gradle.api.KotlinMultiplatformAndroidPlugin
import com.autonomousapps.DependencyAnalysisPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinMultiplatformPluginWrapper
import takdevx.dependencyguard.TakDependencyGuardExtension
import takdevx.dependencyguard.TakDependencyGuardPlugin

class ModuleKotlin : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    with(pluginManager) {
      apply(KotlinMultiplatformPluginWrapper::class)
      apply(KotlinMultiplatformAndroidPlugin::class)
      apply(ConventionKotlinBase::class)
      apply(ConventionPublish::class)
      apply(ConventionStyle::class)
      apply(ConventionTest::class)
      apply(DependencyAnalysisPlugin::class)
      apply(TakDependencyGuardPlugin::class)
    }

    extensions.configure(TakDependencyGuardExtension::class) {
      configuration("androidRuntimeClasspath")
      configuration("jvmRuntimeClasspath")
    }

    extensions.configure(KotlinMultiplatformExtension::class) {
      applyDefaultHierarchyTemplate()
      jvm()

      // Configure jvmShared source set for code shared between JVM and Android
      sourceSets.apply {
        val commonMain = getByName("commonMain")
        val jvmSharedMain = create("jvmSharedMain") { dependsOn(commonMain) }
        named("jvmMain") { dependsOn(jvmSharedMain) }
        named("androidMain") { dependsOn(jvmSharedMain) }
      }

      extensions.configure(KotlinMultiplatformAndroidLibraryTarget::class) {
        namespace = namespace()
        minSdk = providers.intProperty("alakazam.minSdk").get()
        compileSdk = providers.intProperty("alakazam.compileSdk").get()

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
      }

      compilerOptions {
        freeCompilerArgs.add("-opt-in=kotlin.time.ExperimentalTime")
      }
    }
  }
}
