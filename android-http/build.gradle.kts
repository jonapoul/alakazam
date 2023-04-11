apply(plugin = "kotlinx-serialization")

configureAndroidLibrary()
configurePublishing(artifact = "android-http", ArtifactType.Android)

android {
    namespace = "dev.jonpoulton.alakazam.http"

    kotlinOptions {
        freeCompilerArgs += listOf(
            "-opt-in=kotlinx.serialization.ExperimentalSerializationApi",
        )
    }
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(projects.kotlinCore)
    api(projects.kotlinJson)
    api(projects.androidCore)

    implementation(libs.okhttp.core)
    implementation(libs.okhttp.logging)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.serialization)
    implementation(libs.timber.core)

    testImplementation(projects.testingCore)
}
