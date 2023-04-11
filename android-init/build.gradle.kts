configureAndroidLibrary()
configurePublishing(artifact = "android-init", ArtifactType.Android)

android {
    namespace = "dev.jonpoulton.alakazam.init"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(projects.androidCore)
    api(projects.androidLogging)

    testImplementation(projects.testingCore)
}
