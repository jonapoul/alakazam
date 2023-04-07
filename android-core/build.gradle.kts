import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "android-core")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.alakazam.core"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)
    api(project(":kotlin-core"))

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
}
