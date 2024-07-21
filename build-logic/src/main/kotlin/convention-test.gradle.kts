import blueprint.recipes.TestVersions
import blueprint.recipes.koverBlueprint
import blueprint.recipes.testBlueprint
import org.gradle.accessors.dm.LibrariesForLibs

val libs = the<LibrariesForLibs>()

koverBlueprint()

testBlueprint(
  versions = TestVersions(
    alakazam = null,
    androidxArch = libs.versions.androidx.arch.test,
    androidxCoreKtx = null,
    androidxJunit = libs.versions.androidx.junit,
    androidxRules = libs.versions.androidx.rules,
    androidxRunner = libs.versions.androidx.runner,
    coroutines = libs.versions.kotlinx.coroutines,
    junit = libs.versions.junit,
    kotlin = libs.versions.kotlin,
    mockk = libs.versions.mockk,
    robolectric = libs.versions.robolectric,
    turbine = libs.versions.turbine,
  )
)
