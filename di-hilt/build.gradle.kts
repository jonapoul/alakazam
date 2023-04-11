apply(plugin = "dagger.hilt.android.plugin")

configureAndroidLibrary()
configurePublishing(artifact = "di-hilt", ArtifactType.Android)

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

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    testImplementation(projects.testingCore)
}
