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

    api(libs.activity)
    api(libs.appcompat)
    api(libs.lifecycle.runtime)
    api(libs.navigation.fragment)
    api(libs.navigation.ui)
    api(libs.preference)

    testImplementation(projects.testingCore)
}
