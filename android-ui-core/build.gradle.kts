configureAndroidLibrary()
configurePublishing(artifact = "android-ui-core", ArtifactType.Android)

android {
    namespace = "dev.jonpoulton.alakazam.ui.core"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(projects.androidCore)
    api(projects.androidLogging)
    api(projects.kotlinCoroutines)

    implementation(libs.activity)
    implementation(libs.appcompat)
    implementation(libs.lifecycle.runtime)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.preference)

    testImplementation(projects.testingCore)
}
