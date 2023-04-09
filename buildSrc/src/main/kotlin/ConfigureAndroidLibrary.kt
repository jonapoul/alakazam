import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply

@Suppress("UnstableApiUsage")
fun Project.configureAndroidLibrary() {
  apply(plugin = "com.android.library")
  apply(plugin = "kotlin-android")
  apply(plugin = "kotlin-kapt")

  android {
    compileSdk = BuildConstants.COMPILE_SDK

    defaultConfig {
      minSdk = BuildConstants.MIN_SDK
      testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
      testInstrumentationRunnerArguments["disableAnalytics"] = "true"
      multiDexEnabled = true
    }

    compileOptions {
      isCoreLibraryDesugaringEnabled = true
      sourceCompatibility = JavaVersion.VERSION_11
      targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
      buildConfig = false
      viewBinding = false
    }

    kotlinOptions {
      jvmTarget = "11"
      freeCompilerArgs += listOf(
        "-Xjvm-default=all-compatibility",
        "-opt-in=kotlin.RequiresOptIn",
        "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
      )
    }

    publishing {
      singleVariant("release") {
        withSourcesJar()
        withJavadocJar()
      }
    }
  }
}
