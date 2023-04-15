import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

fun KotlinJvmProjectExtension.kotlinConfig() {
  sourceSets.all {
    languageSettings {
      optIn("kotlin.RequiresOptIn")
      optIn("kotlinx.coroutines.ExperimentalCoroutinesApi")
    }
  }
}
