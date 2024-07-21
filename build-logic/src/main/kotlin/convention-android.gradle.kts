@file:Suppress("UnstableApiUsage")

import blueprint.recipes.androidLibBlueprint
import com.android.build.api.dsl.LibraryExtension
import org.gradle.accessors.dm.LibrariesForLibs

val libs = the<LibrariesForLibs>()

androidLibBlueprint()

extensions.configure<LibraryExtension> {
  packagingOptions {
    resources {
      pickFirsts.add("MANIFEST.MF")
    }
  }
}
