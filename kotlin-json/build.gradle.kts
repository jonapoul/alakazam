plugins {
  id("java-library")
  id("kotlin")
  id("kotlinx-serialization")
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
      artifact = "kotlin-json",
      artifactType = ArtifactType.Kotlin,
    )
  }
}

dependencies {
  api(projects.kotlinCore)
  implementation(libs.kotlinx.serialization.json)
  testImplementation(projects.testingCore)
}
