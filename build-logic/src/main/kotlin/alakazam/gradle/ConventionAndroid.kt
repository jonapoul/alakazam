@file:Suppress("UnstableApiUsage")

package alakazam.gradle

import blueprint.core.intProperty
import com.android.build.api.dsl.LibraryExtension
import org.gradle.android.AndroidCacheFixPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.findByType
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompilerOptions
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class ConventionAndroid : Plugin<Project> {
  override fun apply(target: Project) = with(target) {
    with(pluginManager) {
      apply(AndroidCacheFixPlugin::class)
      apply(ConventionKotlinBase::class)
    }

    tasks.withType(KotlinCompile::class).configureEach {
      compilerOptions {
        jvmTarget.set(jvmTarget())
      }
    }

    extensions.configure(LibraryExtension::class) {
      namespace = namespace()
      compileSdk = providers.intProperty(key = "alakazam.compileSdk").get()

      defaultConfig {
        minSdk = providers.intProperty(key = "alakazam.minSdk").get()
        testInstrumentationRunnerArguments["disableAnalytics"] = "true"
      }

      extensions
        .findByType(KotlinJvmCompilerOptions::class)
        ?.jvmTarget
        ?.set(jvmTarget())

      val version = javaVersion().get()
      compileOptions {
        sourceCompatibility = version
        targetCompatibility = version
      }

      buildFeatures {
        aidl = false
        buildConfig = false
        compose = false
        prefab = false
        renderScript = false
        resValues = false
        shaders = false
        viewBinding = false
      }

      lint {
        abortOnError = false
        checkGeneratedSources = false
        checkReleaseBuilds = false
        checkReleaseBuilds = false
        checkTestSources = true
        explainIssues = true
        htmlReport = true
        xmlReport = true
        lintConfig = rootProject
          .isolated
          .projectDirectory
          .file("config/lint.xml")
          .asFile
      }

      packaging {
        resources {
          pickFirsts.add("MANIFEST.MF")
        }
      }

      testOptions {
        unitTests {
          isIncludeAndroidResources = true
          isReturnDefaultValues = true
        }
      }
    }
  }
}
