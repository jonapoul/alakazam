apply(plugin = "java-library")
apply(plugin = "kotlin")

configureKotlinLibrary()
configurePublishing(artifact = "testing-unit", ArtifactType.Kotlin)

dependencies {
    api(projects.testingCore)
    api(libs.androidx.arch.test)
    api(libs.mockk.core)
    api(libs.robolectric)
}
