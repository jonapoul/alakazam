configureAndroidLibrary()
configurePublishing(artifact = "android-ui-compose", ArtifactType.Android)

@Suppress("UnstableApiUsage")
android {
    namespace = "dev.jonpoulton.alakazam.ui.compose"

    defaultConfig {
        minSdk = 21 // limited by hilt-navigation-compose
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    api(projects.androidUiCore)

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

    testImplementation(projects.testingCore)
}
