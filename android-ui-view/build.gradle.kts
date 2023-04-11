configureAndroidLibrary()
configurePublishing(artifact = "android-ui-view", ArtifactType.Android)

@Suppress("Incubating")
android {
    namespace = "dev.jonpoulton.alakazam.ui.view"

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(projects.androidUiCore)

    implementation(libs.fragment.ktx)
    implementation(libs.recyclerview)
    implementation(libs.material)

    testImplementation(projects.testingCore)
}
