import com.diffplug.gradle.spotless.SpotlessExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure

fun Project.configureSpotless() {
  allprojects {
    apply(plugin = "com.diffplug.spotless")

    extensions.configure<SpotlessExtension> {
      format("misc") {
        target("*.gradle", "*.gitignore", "*.pro")
        indentWithSpaces()
        trimTrailingWhitespace()
        endWithNewline()
      }

      freshmark {
        target("*.md")
      }

      json {
        target("*.json")
        simple()
      }

      yaml {
        target("*.yml", "*.yaml")
        jackson()
      }
    }
  }
}
