

configureAndroidLibrary()
configurePublishing(artifact = "android-ui-core", ArtifactType.Android)

android {
    namespace = "com.jonapoul.alakazam.ui.core"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":android-core"))
    api(project(":android-logging"))
    api(project(":kotlin-coroutines"))

    api(libs.activity)
    api(libs.appcompat)
    api(libs.lifecycle.runtime)
    api(libs.navigation.fragment)
    api(libs.navigation.ui)
    api(libs.preference)

    testImplementation(project(":testing-core"))
}
