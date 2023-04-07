import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "lib-core")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.common.core"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)
}
