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

fun BaseExtension.androidCompileOptions() {
  compileOptions {
    isCoreLibraryDesugaringEnabled = true
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
