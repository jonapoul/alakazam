import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "lib-init")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.common.init"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":lib-core"))
    api(project(":lib-logging"))
}
