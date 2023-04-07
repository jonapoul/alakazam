apply(plugin = "java-library")
apply(plugin = "kotlin")

configureKotlinLibrary()
configurePublishing(artifact = "testing-core", componentName = "java")

dependencies {
    implementation(project(":kotlin-core"))

    api(libs.turbine)
    api(libs.mockk.core)
    api(libs.junit)
    api(libs.kotlin.test.common)
    api(libs.kotlin.test.coroutines)
    api(libs.kotlin.test.junit)
    api(libs.timber.junit)
}
