import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "lib-ui-view")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.common.ui.view"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":lib-ui-core"))

    api(libs.fragment.ktx)
    api(libs.recyclerview)
    api(libs.material)
}
