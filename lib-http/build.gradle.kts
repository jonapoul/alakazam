import com.android.build.gradle.LibraryExtension

apply(plugin = "kotlinx-serialization")

configureAndroidLibrary()
configurePublishing(artifact = "lib-http")

extensions.configure<LibraryExtension> {
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
    api(project(":lib-json"))
    api(project(":lib-logging"))

    api(libs.okhttp.core)
    api(libs.okhttp.logging)
    api(libs.retrofit.core)
    api(libs.retrofit.serialization)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    testImplementation(project(":testing-core"))
}
