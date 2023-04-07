import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "lib-prefs")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.alakazam.prefs"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":android-core"))
    api(project(":lib-logging"))

    api(libs.preference)
    api(libs.flowpreferences)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    testImplementation(project(":testing-core"))
}
