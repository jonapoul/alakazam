import com.android.build.gradle.AppExtension

apply(plugin = "com.android.application")
apply(plugin = "kotlin-android")
apply(plugin = "androidx.navigation.safeargs.kotlin")

@Suppress("UnstableApiUsage")
extensions.configure<AppExtension> {
    namespace = "dev.jonpoulton.alakazam.sample"
    compileSdkVersion(BuildConstants.COMPILE_SDK)

    defaultConfig {
        applicationId("dev.jonpoulton.alakazam.sample")
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

    implementation(projects.androidPrefs)
    implementation(projects.androidUiView)

    testImplementation(projects.testingUnit)
    androidTestImplementation(projects.testingAndroid)
}
