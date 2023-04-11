configureAndroidLibrary()
configurePublishing(artifact = "android-ui-view", ArtifactType.Android)

@Suppress("Incubating")
android {
    namespace = "dev.jonpoulton.alakazam.ui.view"

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(projects.androidUiCore)

    implementation(libs.activity)
    implementation(libs.appcompat)
    implementation(libs.fragment.ktx)
    implementation(libs.lifecycle.runtime)
    implementation(libs.material)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.preference)
    implementation(libs.recyclerview)
    implementation(libs.timber.core)

    testImplementation(projects.testingCore)
}
