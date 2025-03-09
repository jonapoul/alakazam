package alakazam.gradle

import blueprint.core.getVersion
import blueprint.core.libs
import blueprint.recipes.DetektAll
import blueprint.recipes.detektBlueprint
import blueprint.recipes.ktlintBlueprint
import blueprint.recipes.licenseeBlueprint
import blueprint.recipes.spotlessBlueprint
import org.gradle.api.Plugin
import org.gradle.api.Project

class ConventionStyle : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    detektBlueprint(
      detektAllConfig = DetektAll.Apply(ignoreRelease = true),
    )

    ktlintBlueprint(
      ktlintCliVersion = libs.getVersion("ktlint.cli"),
      ktlintComposeVersion = libs.getVersion("androidx.compose.lint.twitter"),
    )

    spotlessBlueprint()

    licenseeBlueprint(
      allowedUrls = listOf(
        "https://opensource.org/license/mit", // slf4j
      ),
    )
  }
}
