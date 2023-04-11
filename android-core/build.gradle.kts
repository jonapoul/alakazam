configureAndroidLibrary()
configurePublishing(artifact = "android-core", ArtifactType.Android)

android {
    namespace = "dev.jonpoulton.alakazam.core"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)
    api(projects.kotlinCore)
    api(libs.core.ktx)
    api(libs.kotlinx.coroutines.android)

    testImplementation(projects.testingCore)
}
