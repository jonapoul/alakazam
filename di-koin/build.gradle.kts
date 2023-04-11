configureAndroidLibrary()
configurePublishing(artifact = "di-koin", ArtifactType.Android)

android {
    namespace = "dev.jonpoulton.alakazam.di"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(projects.androidCore)
    api(projects.androidHttp)
    api(projects.androidInit)
    api(projects.androidPrefs)
    api(projects.androidUiCore)
    api(projects.kotlinCoroutines)

    implementation(libs.koin.core)
    implementation(libs.koin.android)

    testImplementation(projects.testingCore)
}
