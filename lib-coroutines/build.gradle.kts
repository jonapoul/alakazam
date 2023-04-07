import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "lib-coroutines")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.alakazam.coroutines"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":android-core"))

    api(libs.kotlinx.coroutines.core)
    api(libs.kotlinx.coroutines.android)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    testImplementation(project(":testing-core"))
}
