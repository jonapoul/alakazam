package alakazam.gradle

import blueprint.recipes.licenseeBlueprint
import com.diffplug.gradle.spotless.SpotlessExtension
import com.diffplug.gradle.spotless.SpotlessPlugin
import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.DetektPlugin
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.getValue
import org.gradle.kotlin.dsl.provideDelegate
import org.gradle.kotlin.dsl.registering
import org.gradle.kotlin.dsl.withType
import org.gradle.plugins.ide.idea.IdeaPlugin
import org.gradle.plugins.ide.idea.model.IdeaModel

class ConventionStyle : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    with(pluginManager) {
      apply(IdeaPlugin::class)
      apply(DetektPlugin::class)
      apply(SpotlessPlugin::class)
    }

    extensions.configure<IdeaModel> {
      module {
        isDownloadSources = true
        isDownloadJavadoc = true
      }
    }

    extensions.configure<DetektExtension> {
      config.setFrom(rootProject.file("config/detekt.yml"))
      buildUponDefaultConfig = true
    }

    val detektTasks = tasks.withType<Detekt>()
    val detektCheck by tasks.registering { dependsOn(detektTasks) }
    tasks.named("check").configure { dependsOn(detektCheck) }

    detektTasks.configureEach {
      reports.html.required.set(true)
      exclude { it.file.path.contains("generated") }
    }

    extensions.configure<SpotlessExtension> {
      format("misc") {
        target("*.gradle", "*.md", ".gitignore")
        trimTrailingWhitespace()
        leadingTabsToSpaces(2)
        endWithNewline()
      }

      format("licenseKotlin") {
        licenseHeaderFile(rootProject.file("config/spotless.kt"), "(package|@file:)")
        target("src/**/*.kt")
      }
    }

    licenseeBlueprint(
      allowedUrls = listOf(
        "https://opensource.org/license/mit", // slf4j
      ),
    )
  }
}
