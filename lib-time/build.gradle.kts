import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "lib-time")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.alakazam.time"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":kotlin-core"))

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    testImplementation(project(":testing-core"))
}
