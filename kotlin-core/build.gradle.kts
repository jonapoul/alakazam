configureKotlinLibrary()
configurePublishing(artifact = "kotlin-core", componentName = "java")

dependencies {
    api(libs.kotlin.stdlib)

    testImplementation(project(":testing-core"))
}
