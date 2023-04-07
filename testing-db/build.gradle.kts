import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "testing-db")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.alakazam.test.db"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)
    implementation(project(":android-core"))

    implementation(libs.room.ktx)
    implementation(libs.room.runtime)
    api(libs.room.testing)
    kapt(libs.room.compiler)

    api(libs.core.test)
    api(libs.robolectric)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
}
