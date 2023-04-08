apply(plugin = "kotlinx-serialization")

configureAndroidLibrary()
configurePublishing(artifact = "android-http", ArtifactType.Android)

android {
    namespace = "com.jonapoul.alakazam.http"

    kotlinOptions {
        freeCompilerArgs += listOf(
            "-opt-in=kotlinx.serialization.ExperimentalSerializationApi",
        )
    }
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":kotlin-core"))
    api(project(":kotlin-json"))
    api(project(":android-core"))

    api(libs.okhttp.core)
    api(libs.okhttp.logging)
    api(libs.retrofit.core)
    api(libs.retrofit.serialization)
    api(libs.timber.core)

    testImplementation(project(":testing-core"))
}
