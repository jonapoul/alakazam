configureAndroidLibrary()
configurePublishing(artifact = "android-core", ArtifactType.Android)

android {
    namespace = "com.jonapoul.alakazam.core"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)
    api(project(":kotlin-core"))
    api(libs.core.ktx)
    api(libs.kotlinx.coroutines.android)

    testImplementation(project(":testing-core"))
}
