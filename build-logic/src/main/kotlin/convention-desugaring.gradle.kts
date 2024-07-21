import blueprint.recipes.androidDesugaringBlueprint
import org.gradle.accessors.dm.LibrariesForLibs

val libs = the<LibrariesForLibs>()

androidDesugaringBlueprint(desugaringVersion = libs.versions.desugaring)
