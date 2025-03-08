package alakazam.gradle

import app.cash.licensee.LicenseeExtension
import app.cash.licensee.LicenseePlugin
import blueprint.core.getVersion
import blueprint.core.libs
import blueprint.recipes.DetektAll
import blueprint.recipes.detektBlueprint
import blueprint.recipes.ktlintBlueprint
import blueprint.recipes.spotlessBlueprint
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure

class ConventionStyle : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    pluginManager.apply(LicenseePlugin::class)

    detektBlueprint(
      detektAllConfig = DetektAll.Apply(ignoreRelease = true),
    )

    ktlintBlueprint(
      ktlintCliVersion = libs.getVersion("ktlint.cli"),
      ktlintComposeVersion = libs.getVersion("androidx.compose.lint.twitter"),
    )

    spotlessBlueprint()

    extensions.configure<LicenseeExtension> {
      allow(spdxId = "Apache-2.0") // Most libraries
      allow(spdxId = "MIT") // Some other libraries
      allow(spdxId = "BSD-3-Clause") // Hamcrest, Protobuf
      allow(spdxId = "BSD-2-Clause") // Hamcrest
      allow(spdxId = "EPL-1.0") // JUnit

      allowUrl(url = "http://www.opensource.org/licenses/bsd-license.php") // Hamcrest, BSD-2-Clause
      allowUrl(url = "https://github.com/mockito/mockito/blob/master/LICENSE") // MIT
    }
  }
}
