import blueprint.recipes.DetektAll
import blueprint.recipes.detektBlueprint
import blueprint.recipes.ktlintBlueprint
import org.gradle.accessors.dm.LibrariesForLibs

val libs = the<LibrariesForLibs>()

detektBlueprint(
  detektAllConfig = DetektAll.Apply(ignoreRelease = true),
)

ktlintBlueprint(
  ktlintCliVersion = libs.versions.ktlint.cli,
  ktlintComposeVersion = libs.versions.androidx.compose.lint.twitter,
)
