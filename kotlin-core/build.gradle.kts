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
      artifact = "kotlin-core",
      artifactType = ArtifactType.Kotlin,
    )
  }
}

dependencies {
  implementation(libs.kotlin.stdlib)
  testImplementation(projects.testingCore)
}
