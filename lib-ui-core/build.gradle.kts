import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "lib-ui-core")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.alakazam.ui.core"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":android-core"))
    api(project(":lib-coroutines"))
    api(project(":lib-logging"))

    api(libs.activity)
    api(libs.appcompat)
    api(libs.lifecycle.runtime)
    api(libs.navigation.fragment)
    api(libs.navigation.ui)
    api(libs.preference)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    testImplementation(project(":testing-core"))
}
