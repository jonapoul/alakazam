apply(plugin = "dagger.hilt.android.plugin")

configureAndroidLibrary()
configurePublishing(artifact = "di-hilt", ArtifactType.Android)

android {
    namespace = "dev.jonpoulton.alakazam.di"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":android-core"))
    api(project(":android-http"))
    api(project(":android-init"))
    api(project(":android-prefs"))
    api(project(":android-ui-core"))
    api(project(":kotlin-coroutines"))

    api(libs.hilt.android)
    kapt(libs.hilt.compiler)

    testImplementation(project(":testing-core"))
}
