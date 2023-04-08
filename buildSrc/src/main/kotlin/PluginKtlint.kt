import org.gradle.api.Project
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.jlleitschuh.gradle.ktlint.KtlintExtension
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

fun Project.configureKtlint(ktlintVersion: Provider<String>) {
  allprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint")

    extensions.configure<KtlintExtension> {
      version.set(ktlintVersion.get())
      reporters {
        reporter(ReporterType.HTML)
      }
    }
  }
}
