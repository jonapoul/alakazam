configureAndroidLibrary()
configurePublishing(artifact = "android-init", ArtifactType.Android)

android {
    namespace = "dev.jonpoulton.alakazam.init"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(projects.androidCore)
    api(projects.androidLogging)

    implementation(libs.hilt.android)
    implementation(libs.timber.core)

    testImplementation(projects.testingCore)
}
