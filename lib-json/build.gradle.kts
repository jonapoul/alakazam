import com.android.build.gradle.LibraryExtension

apply(plugin = "kotlinx-serialization")

configureAndroidLibrary()
configurePublishing(artifact = "lib-json")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.common.json"

    kotlinOptions {
        freeCompilerArgs += listOf(
            "-opt-in=kotlinx.serialization.ExperimentalSerializationApi",
        )
    }
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":lib-core"))
    api(libs.kotlinx.serialization.json)
}
