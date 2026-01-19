package alakazam.gradle

import app.cash.licensee.LicenseeExtension
import app.cash.licensee.LicenseePlugin
import app.cash.licensee.UnusedAction.IGNORE
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

class ConventionStyle : Plugin<Project> {
  override fun apply(target: Project): Unit = with(target) {
    with(pluginManager) {
      apply(DetektPlugin::class)
      apply(LicenseePlugin::class)
    }

    extensions.configure(DetektExtension::class) {
      config.setFrom(rootProject.file("config/detekt.yml"))
      buildUponDefaultConfig = true
    }

    val detektTasks = tasks.withType(Detekt::class)
    val detektCheck by tasks.registering { dependsOn(detektTasks) }
    tasks.named("check").configure { dependsOn(detektCheck) }

    detektTasks.configureEach {
      reports.html.required.set(true)
      exclude { it.file.path.contains("generated") }
    }

    extensions.configure(LicenseeExtension::class) {
      allow("Apache-2.0")
      allow("BSD-2-Clause")
      allow("EPL-1.0")
      unusedAction(IGNORE)
    }
  }
}
