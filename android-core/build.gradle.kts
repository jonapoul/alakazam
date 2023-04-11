configureAndroidLibrary()
configurePublishing(artifact = "android-core", ArtifactType.Android)

android {
    namespace = "dev.jonpoulton.alakazam.core"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)
    api(projects.kotlinCore)

    implementation(libs.core.ktx)
    implementation(libs.kotlinx.coroutines.android)

    testImplementation(projects.testingCore)
}
