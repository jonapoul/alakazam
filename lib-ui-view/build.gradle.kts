import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "lib-ui-view")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.alakazam.ui.view"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":lib-ui-core"))

    api(libs.fragment.ktx)
    api(libs.recyclerview)
    api(libs.material)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    testImplementation(project(":testing-core"))
}
