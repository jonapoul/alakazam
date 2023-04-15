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
      artifact = "kotlin-coroutines",
      artifactType = ArtifactType.Kotlin,
    )
  }
}

dependencies {
  api(projects.kotlinCore)
  implementation(libs.kotlinx.coroutines.core)
  implementation(libs.kotlinx.coroutines.android)
  testImplementation(projects.testingCore)
}
