import com.android.build.gradle.LibraryExtension

apply(plugin = "kotlin-kapt")
apply(plugin = "dagger.hilt.android.plugin")

configureAndroidLibrary()
configurePublishing(artifact = "testing-android")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.common.test.android"

    defaultConfig {
        minSdk = 21 // restricted by mockk
    }
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":testing-core"))
    implementation(project(":lib-core"))

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
