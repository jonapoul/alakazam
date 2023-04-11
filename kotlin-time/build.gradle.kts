configureKotlinLibrary()
configurePublishing(artifact = "kotlin-time", ArtifactType.Kotlin)

dependencies {
    api(projects.kotlinCore)

    testImplementation(projects.testingCore)
}
