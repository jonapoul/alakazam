configureKotlinLibrary()
configurePublishing(artifact = "kotlin-coroutines", ArtifactType.Kotlin)

dependencies {
    api(projects.kotlinCore)

    api(libs.kotlinx.coroutines.core)
    api(libs.kotlinx.coroutines.android)

    testImplementation(projects.testingCore)
}
