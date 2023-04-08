

configureAndroidLibrary()
configurePublishing(artifact = "android-ui-view", ArtifactType.Android)

android {
    namespace = "com.jonapoul.alakazam.ui.view"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":android-ui-core"))

    api(libs.fragment.ktx)
    api(libs.recyclerview)
    api(libs.material)

    testImplementation(project(":testing-core"))
}
