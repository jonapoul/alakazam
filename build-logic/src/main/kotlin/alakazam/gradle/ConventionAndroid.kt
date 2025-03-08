package alakazam.gradle

import blueprint.core.getVersion
import blueprint.core.libs
import blueprint.recipes.androidDesugaringBlueprint
import blueprint.recipes.androidLibBlueprint
import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class ConventionAndroid : Plugin<Project> {
  override fun apply(target: Project) = with(target) {
    androidLibBlueprint()
    androidDesugaringBlueprint(libs.getVersion("desugaring"))

    extensions.configure<LibraryExtension> {
      packaging {
        resources {
          pickFirsts.add("MANIFEST.MF")
        }
      }
    }
  }
}
