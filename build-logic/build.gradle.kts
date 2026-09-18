import io.gitlab.arturbosch.detekt.Detekt
import org.gradle.language.base.plugins.LifecycleBasePlugin.VERIFICATION_GROUP

plugins {
  `kotlin-dsl`
  alias(libs.plugins.detekt)
}

val javaFile = layout.projectDirectory.file("../.java-version")
val jdkVersion = providers.fileContents(javaFile).asText.map { it.trim().toInt() }

kotlin {
  jvmToolchain(jdkVersion.get())
  compilerOptions {
    allWarningsAsErrors.set(true)
  }
}

tasks.validatePlugins {
  enableStricterValidation = true
  failOnWarning = true
}

detekt {
  config.setFrom(file("../config/detekt.yml"))
  buildUponDefaultConfig = true
}

val detektCheck =
  tasks.register("detektCheck") {
    group = VERIFICATION_GROUP
    dependsOn(tasks.withType(Detekt::class))
  }

tasks.check { dependsOn(detektCheck) }

dependencies {
  fun compileOnlyPlugin(plugin: Provider<PluginDependency>) =
    compileOnly(
      plugin.map { "${it.pluginId}:${it.pluginId}.gradle.plugin:${it.version.requiredVersion}" }
    )

  compileOnlyPlugin(libs.plugins.agp)
  compileOnlyPlugin(libs.plugins.compose)
  compileOnlyPlugin(libs.plugins.dependencyAnalysis)
  compileOnlyPlugin(libs.plugins.dependencyGuard)
  compileOnlyPlugin(libs.plugins.detekt)
  compileOnlyPlugin(libs.plugins.dokka)
  compileOnlyPlugin(libs.plugins.kotlin.compose)
  compileOnlyPlugin(libs.plugins.kotlin.multiplatform)
  compileOnlyPlugin(libs.plugins.kotlin.serialization)
  compileOnlyPlugin(libs.plugins.licensee)
  compileOnlyPlugin(libs.plugins.publish)

  implementation(libs.blueprint)
}

gradlePlugin {
  plugins {
    operator fun String.invoke(impl: String) =
      create(this) {
        this.id = this@invoke
        implementationClass = impl
      }

    "alakazam.module.kotlin"(impl = "alakazam.gradle.ModuleKotlin")
    "alakazam.convention.detekt"(impl = "alakazam.gradle.ConventionDetekt")
  }
}
