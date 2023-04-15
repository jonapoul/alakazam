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
      artifact = "kotlin-time",
      artifactType = ArtifactType.Kotlin,
    )
  }
}

dependencies {
  api(projects.kotlinCore)
  testImplementation(projects.testingCore)
}
