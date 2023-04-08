configureKotlinLibrary()
configurePublishing(artifact = "kotlin-time", ArtifactType.Kotlin)

dependencies {
    api(project(":kotlin-core"))

    testImplementation(project(":testing-core"))
}
