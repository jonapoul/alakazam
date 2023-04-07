import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "lib-time")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.common.time"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":lib-core"))
}
