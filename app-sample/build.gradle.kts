import com.android.build.gradle.AppExtension

apply(plugin = "com.android.application")
apply(plugin = "kotlin-android")
apply(plugin = "androidx.navigation.safeargs.kotlin")

@Suppress("UnstableApiUsage")
extensions.configure<AppExtension> {
    namespace = "com.jonapoul.common.sample"
    compileSdkVersion(BuildConstants.COMPILE_SDK)

    defaultConfig {
        applicationId("com.jonapoul.common.sample")
        minSdk = BuildConstants.MIN_SDK
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
    implementation(project(":lib-ui-view"))
    implementation(project(":lib-prefs"))

    testImplementation(project(":testing-unit"))
    androidTestImplementation(project(":testing-android"))

    implementation(libs.appcompat)
    implementation(libs.constraintlayout)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.preference)
    implementation(libs.material)
    implementation(libs.kotlin.stdlib)
}
