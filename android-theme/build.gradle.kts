configureAndroidLibrary()
configurePublishing(artifact = "android-theme", ArtifactType.Android)

android {
    namespace = "com.jonapoul.alakazam.theme"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":android-prefs"))
    api(project(":di-hilt"))
    api(libs.preference)

    testImplementation(project(":testing-core"))
}
