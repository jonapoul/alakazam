import com.android.build.gradle.LibraryExtension

apply(plugin = "kotlinx-serialization")

configureAndroidLibrary()
configurePublishing(artifact = "lib-json")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.alakazam.json"

    kotlinOptions {
        freeCompilerArgs += listOf(
            "-opt-in=kotlinx.serialization.ExperimentalSerializationApi",
        )
    }
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":kotlin-core"))
    api(libs.kotlinx.serialization.json)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    testImplementation(project(":testing-core"))
}
