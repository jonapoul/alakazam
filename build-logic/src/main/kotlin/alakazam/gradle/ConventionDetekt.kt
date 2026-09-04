package alakazam.gradle

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
import org.gradle.language.base.plugins.LifecycleBasePlugin

class ConventionDetekt : Plugin<Project> {
  override fun apply(target: Project): Unit =
    with(target) {
      pluginManager.apply(DetektPlugin::class)

      extensions.configure(DetektExtension::class) {
        config.setFrom(rootProject.file("config/detekt.yml"))
        source.from("./*.gradle.kts")
        buildUponDefaultConfig = true
      }

      val detektTasks = tasks.withType(Detekt::class)

      val detektCheck by tasks.registering {
        group = LifecycleBasePlugin.VERIFICATION_GROUP
        dependsOn(detektTasks)
      }

      pluginManager.withPlugin("base") {
        tasks.named("check").configure { dependsOn(detektCheck) }
      }

      detektTasks.configureEach {
        reports.html.required.set(true)
        exclude { it.file.path.contains("generated") }
      }
    }
}
