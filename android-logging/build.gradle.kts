configureAndroidLibrary()
configurePublishing(artifact = "android-logging", ArtifactType.Android)

android {
    namespace = "com.jonapoul.alakazam.logging"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":android-core"))

    api(libs.timber.core)
    implementation(libs.logback.android)
    implementation(libs.slf4j)

    testImplementation(project(":testing-core"))
}