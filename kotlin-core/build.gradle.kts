configureKotlinLibrary()
configurePublishing(artifact = "kotlin-core", ArtifactType.Kotlin)

dependencies {
    implementation(libs.kotlin.stdlib)

    testImplementation(projects.testingCore)
}
