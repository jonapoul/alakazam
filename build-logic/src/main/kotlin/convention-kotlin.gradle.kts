import blueprint.recipes.kotlinJvmBlueprint
import org.gradle.accessors.dm.LibrariesForLibs

val libs = the<LibrariesForLibs>()

kotlinJvmBlueprint(kotlinVersion = libs.versions.kotlin)
