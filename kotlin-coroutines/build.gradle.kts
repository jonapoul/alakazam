configureKotlinLibrary()
configurePublishing(artifact = "kotlin-coroutines", ArtifactType.Kotlin)

dependencies {
    api(projects.kotlinCore)

    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)

    testImplementation(projects.testingCore)
}
