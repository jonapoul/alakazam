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
      artifact = "testing-unit",
      artifactType = ArtifactType.Kotlin,
    )
  }
}

dependencies {
  api(projects.testingCore)

  api(libs.androidx.arch.test)
  api(libs.mockk.core)
  api(libs.robolectric)
}
