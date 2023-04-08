

configureAndroidLibrary()
configurePublishing(artifact = "android-prefs", ArtifactType.Android)

android {
    namespace = "com.jonapoul.alakazam.prefs"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":android-core"))
    api(project(":android-logging"))

    api(libs.preference)
    api(libs.flowpreferences)

    testImplementation(project(":testing-core"))
}
