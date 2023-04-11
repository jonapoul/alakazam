configureAndroidLibrary()
configurePublishing(artifact = "testing-android", ArtifactType.Android)

apply(plugin = "com.google.dagger.hilt.android")

android {
    namespace = "dev.jonpoulton.alakazam.test.android"

    defaultConfig {
        minSdk = 21 // restricted by mockk
    }
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)
    implementation(project(":android-core"))

    /* General runtime */
    implementation(libs.activity)
    implementation(libs.appcompat)
    implementation(libs.fragment.ktx)

    /* DI */
    implementation(libs.hilt.android)
    api(libs.hilt.test)
    kapt(libs.hilt.compiler)

    /* Testing */
    api(libs.androidx.arch.test)
    api(libs.androidx.junit.test)
    api(libs.core.test)
    api(libs.kaspresso)
    api(libs.mockk.android)
    api(libs.navigation.testing)

    debugImplementation(libs.fragment.test)
}
