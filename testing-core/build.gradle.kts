plugins {
  id("java-library")
  id("kotlin")
  id("maven-publish")
}

java {
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
}

kotlin {
  kotlinConfig()
}

afterEvaluate {
  publishing {
    addPublication(
      project = project,
      artifact = "testing-core",
      artifactType = ArtifactType.Kotlin,
    )
  }
}

dependencies {
  implementation(projects.kotlinCore)

  api(libs.turbine)
  api(libs.mockk.core)
  api(libs.junit)
  api(libs.kotlin.test.common)
  api(libs.kotlin.test.coroutines)
  api(libs.kotlin.test.junit)
  api(libs.timber.junit)
}
