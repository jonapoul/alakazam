import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "lib-prefs")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.common.prefs"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":lib-core"))
    api(project(":lib-logging"))

    api(libs.preference)
    api(libs.flowpreferences)
}
