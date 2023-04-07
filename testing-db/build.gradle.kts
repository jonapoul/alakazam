import com.android.build.gradle.LibraryExtension

apply(plugin = "kotlin-kapt")

configureAndroidLibrary()
configurePublishing(artifact = "testing-db")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.common.test.db"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    implementation(project(":lib-core"))
    api(project(":testing-core"))

    /* Database */
    implementation(libs.room.ktx)
    implementation(libs.room.runtime)
    api(libs.room.testing)
    kapt(libs.room.compiler)

    /* Testing */
    api(libs.core.test)
    api(libs.robolectric)
}
