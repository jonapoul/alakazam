configureKotlinLibrary()
configurePublishing(artifact = "kotlin-coroutines", ArtifactType.Kotlin)

dependencies {
    api(project(":kotlin-core"))

    api(libs.kotlinx.coroutines.core)
    api(libs.kotlinx.coroutines.android)

    testImplementation(project(":testing-core"))
}
