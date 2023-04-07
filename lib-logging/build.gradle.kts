import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "lib-logging")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.alakazam.logging"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":android-core"))

    api(libs.timber.runtime)
    implementation(libs.logback.android)
    implementation(libs.slf4j)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    testImplementation(project(":testing-core"))
}
