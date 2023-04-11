configureAndroidLibrary()
configurePublishing(artifact = "android-prefs", ArtifactType.Android)

android {
    namespace = "dev.jonpoulton.alakazam.prefs"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(projects.androidCore)
    api(projects.androidLogging)

    api(libs.preference)
    api(libs.flowpreferences)

    testImplementation(projects.testingCore)
}
