import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

apply(plugin = "java-library")
apply(plugin = "kotlin")

configurePublishing(artifact = "testing-core", componentName = "java")

extensions.configure<JavaPluginExtension> {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

extensions.configure<KotlinProjectExtension> {
    sourceSets.all {
        languageSettings {
            optIn("kotlin.RequiresOptIn")
            optIn("kotlinx.coroutines.ExperimentalCoroutinesApi")
        }
    }
}

dependencies {
    implementation(project(path = ":lib-core", configuration = "default"))

    api(libs.turbine)
    api(libs.mockk.core)
    api(libs.junit)
    api(libs.kotlin.test.common)
    api(libs.kotlin.test.coroutines)
    api(libs.kotlin.test.junit)
    api(libs.timber.junit)
}
