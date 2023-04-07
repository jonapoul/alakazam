apply(plugin = "java-library")
apply(plugin = "kotlin")

configurePublishing(artifact = "testing-unit", componentName = "java")

extensions.configure<JavaPluginExtension> {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    api(project(":testing-core"))
    api(libs.androidx.arch.test)
    api(libs.mockk.core)
    api(libs.robolectric)
}
