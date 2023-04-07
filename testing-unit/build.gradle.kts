apply(plugin = "java-library")
apply(plugin = "kotlin")

configureKotlinLibrary()
configurePublishing(artifact = "testing-unit", componentName = "java")

dependencies {
    api(project(":testing-core"))
    api(libs.androidx.arch.test)
    api(libs.mockk.core)
    api(libs.robolectric)
}
