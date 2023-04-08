configureKotlinLibrary()
configurePublishing(artifact = "kotlin-core", ArtifactType.Kotlin)

dependencies {
  api(libs.kotlin.stdlib)

  testImplementation(project(":testing-core"))
}
