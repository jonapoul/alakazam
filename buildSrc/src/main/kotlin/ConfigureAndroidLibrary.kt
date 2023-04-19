import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun BaseExtension.androidDefaultConfig() {
  defaultConfig {
    minSdk = BuildConstants.MIN_SDK
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    testInstrumentationRunnerArguments["disableAnalytics"] = "true"
    multiDexEnabled = true
  }
}

fun BaseExtension.androidCompileOptions(desugaring: Boolean = true) {
  compileOptions {
    isCoreLibraryDesugaringEnabled = desugaring
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }
}

fun LibraryExtension.androidBuildFeatures() {
  buildFeatures {
    buildConfig = false
    viewBinding = false
  }
}

fun BaseExtension.androidPackagingOptions() {
  packagingOptions {
    jniLibs {
      useLegacyPackaging = true
    }

    resources {
      pickFirsts.add("MANIFEST.MF")
      excludes.addAll(
        listOf(
          "META-INF/DEPENDENCIES",
          "META-INF/LICENSE",
          "META-INF/LICENSE.md",
          "META-INF/LICENSE.txt",
          "META-INF/license.txt",
          "META-INF/LICENSE-notice.md",
          "META-INF/NOTICE",
          "META-INF/NOTICE.txt",
          "META-INF/notice.txt",
          "META-INF/ASL2.0",
        )
      )
    }
  }
}

fun BaseExtension.androidTestOptions() {
  testOptions {
    unitTests {
      isIncludeAndroidResources = true
    }
  }
}

fun Project.androidKotlinOptions() {
  tasks.withType<KotlinCompile> {
    kotlinOptions {
      jvmTarget = "11"
      freeCompilerArgs += listOf(
        "-Xjvm-default=all-compatibility",
        "-opt-in=kotlin.RequiresOptIn",
        "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
        "-opt-in=kotlinx.serialization.ExperimentalSerializationApi",
      )
    }
  }
}
