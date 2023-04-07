import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "lib-db")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.alakazam.db"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":android-core"))

    api(libs.room.ktx)
    api(libs.room.runtime)
    kapt(libs.room.compiler)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    testImplementation(project(":testing-core"))
}
