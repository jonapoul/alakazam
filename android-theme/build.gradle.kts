configureAndroidLibrary()
configurePublishing(artifact = "android-theme", ArtifactType.Android)

android {
    namespace = "dev.jonpoulton.alakazam.theme"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(projects.androidPrefs)
    api(projects.diHilt)

    implementation(libs.preference)

    testImplementation(projects.testingCore)
}
