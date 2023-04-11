configureAndroidLibrary()
configurePublishing(artifact = "android-theme", ArtifactType.Android)

android {
    namespace = "dev.jonpoulton.alakazam.theme"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":android-prefs"))
    api(project(":di-hilt"))
    api(libs.preference)

    testImplementation(project(":testing-core"))
}
