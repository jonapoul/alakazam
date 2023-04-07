import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "lib-coroutines")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.common.coroutines"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":lib-core"))

    api(libs.kotlinx.coroutines.core)
    api(libs.kotlinx.coroutines.android)
}
