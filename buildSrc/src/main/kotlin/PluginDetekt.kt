import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType

fun Project.configureDetekt() {
    allprojects {
        apply(plugin = "io.gitlab.arturbosch.detekt")

        extensions.configure<DetektExtension> {
            config.setFrom(files("${rootProject.rootDir}/detekt.yml"))
            buildUponDefaultConfig = true
        }

        tasks.withType<Detekt> {
            reports.html.required.set(true)
        }
    }
}
