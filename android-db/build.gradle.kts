configureAndroidLibrary()
configurePublishing(artifact = "android-db", ArtifactType.Android)

android {
    namespace = "dev.jonpoulton.alakazam.db"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(projects.androidCore)

    api(libs.room.ktx)
    api(libs.room.runtime)
    kapt(libs.room.compiler)

    testImplementation(projects.testingCore)
}
