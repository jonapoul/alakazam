import com.android.build.gradle.AppExtension

apply(plugin = "com.android.application")
apply(plugin = "kotlin-android")
apply(plugin = "androidx.navigation.safeargs.kotlin")

@Suppress("UnstableApiUsage")
extensions.configure<AppExtension> {
    namespace = "com.jonapoul.alakazam.sample"
    compileSdkVersion(BuildConstants.COMPILE_SDK)

    defaultConfig {
        applicationId("com.jonapoul.alakazam.sample")
        minSdk = 21 // limited by testing-android
        targetSdk = BuildConstants.COMPILE_SDK
        versionCode(BuildConstants.LIB_VERSION_CODE)
        versionName(BuildConstants.LIB_VERSION_NAME)
        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
        multiDexEnabled = true
    }

    buildTypes {
        getByName("release") {
            minifyEnabled(false)
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures.viewBinding = true

    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_11)
        targetCompatibility(JavaVersion.VERSION_11)
    }
}

dependencies {
    coreLibraryDesugaring(libs.desugaring)

    implementation(project(":android-prefs"))
    implementation(project(":android-ui-view"))

    testImplementation(project(":testing-unit"))
    androidTestImplementation(project(":testing-android"))
}