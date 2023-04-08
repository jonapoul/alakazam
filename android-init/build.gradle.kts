

configureAndroidLibrary()
configurePublishing(artifact = "android-init", ArtifactType.Android)

android {
    namespace = "com.jonapoul.alakazam.init"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":android-core"))
    api(project(":android-logging"))

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    testImplementation(project(":testing-core"))
}
