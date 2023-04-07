
import com.android.build.gradle.LibraryExtension

configureAndroidLibrary()
configurePublishing(artifact = "lib-ui-compose")

@Suppress("UnstableApiUsage")
extensions.configure<LibraryExtension> {
    namespace = "com.jonapoul.alakazam.ui.compose"

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(project(":lib-ui-core"))

    implementation(platform(libs.compose.bom))
    implementation(libs.compose.activity)
    implementation(libs.compose.animation)
    implementation(libs.compose.foundation.core)
    implementation(libs.compose.foundation.layout)
    implementation(libs.compose.material.core)
    implementation(libs.compose.material.icons)
    implementation(libs.compose.navigation.core)
    implementation(libs.compose.navigation.hilt)
    implementation(libs.compose.tooling.preview)
    implementation(libs.compose.ui.core)
    implementation(libs.compose.ui.fonts)
    implementation(libs.compose.ui.tooling)
    implementation(libs.compose.ui.util)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    testImplementation(project(":testing-core"))
}
