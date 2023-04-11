configureAndroidLibrary()
configurePublishing(artifact = "android-logging", ArtifactType.Android)

android {
    namespace = "dev.jonpoulton.alakazam.logging"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(projects.androidCore)

    api(libs.timber.core)
    implementation(libs.logback.android)
    implementation(libs.slf4j)

    testImplementation(projects.testingCore)
}
