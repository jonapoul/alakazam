configureAndroidLibrary()
configurePublishing(artifact = "testing-db", ArtifactType.Android)

android {
    namespace = "dev.jonpoulton.alakazam.test.db"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)
    implementation(projects.androidCore)

    implementation(libs.room.ktx)
    implementation(libs.room.runtime)
    api(libs.room.testing)
    kapt(libs.room.compiler)

    api(libs.core.test)
    api(libs.robolectric)
}
