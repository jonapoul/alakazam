import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.withType

fun Project.configureVersions() {
    apply(plugin = "com.github.ben-manes.versions")

    tasks.withType<DependencyUpdatesTask> {
        rejectVersionIf {
            !candidate.version.isStable() && currentVersion.isStable()
        }
    }
}

private fun String.isStable(): Boolean =
    listOf("alpha", "beta", "rc").none { lowercase().contains(it) }
