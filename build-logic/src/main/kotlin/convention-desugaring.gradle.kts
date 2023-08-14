import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.kotlin.dsl.the

plugins {
  id("com.android.library")
}

val libs = the<LibrariesForLibs>()

android {
  compileOptions {
    isCoreLibraryDesugaringEnabled = true
  }
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)
}
