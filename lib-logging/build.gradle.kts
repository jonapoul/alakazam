import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "lib-logging")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.common.logging"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":lib-core"))

    api(libs.timber.runtime)
    implementation(libs.logback.android)
    implementation(libs.slf4j)
}
