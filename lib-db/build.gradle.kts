import com.android.build.gradle.LibraryExtension

apply(plugin = "kotlin-kapt")

configureAndroidLibrary()
configurePublishing(artifact = "lib-db")

extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.common.db"
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":lib-core"))

    api(libs.room.ktx)
    api(libs.room.runtime)
    kapt(libs.room.compiler)
}
