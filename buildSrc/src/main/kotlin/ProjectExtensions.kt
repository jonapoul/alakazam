import com.android.build.gradle.LibraryExtension
import org.gradle.api.Project
import org.gradle.api.artifacts.Configuration
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val Project.coreLibraryDesugaring: Configuration
  get() = configurations.named("coreLibraryDesugaring").get()

val Project.implementation: Configuration
  get() = configurations.named("implementation").get()

val Project.api: Configuration
  get() = configurations.named("api").get()

val Project.kapt: Configuration
  get() = configurations.named("kapt").get()

val Project.testImplementation: Configuration
  get() = configurations.named("testImplementation").get()

val Project.debugImplementation: Configuration
  get() = configurations.named("debugImplementation").get()

val Project.androidTestImplementation: Configuration
  get() = configurations.named("androidTestImplementation").get()

fun Project.requireProperty(name: String): String =
  properties[name] as? String ?: error("Required property $name from $this!")

fun Project.kotlinOptions(block: KotlinJvmOptions.() -> Unit) {
  tasks.withType<KotlinCompile> {
    kotlinOptions(block)
  }
}

fun Project.android(block: LibraryExtension.() -> Unit) {
  extensions.configure<LibraryExtension>(block)
}
