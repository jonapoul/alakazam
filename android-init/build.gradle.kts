configureAndroidLibrary()
configurePublishing(artifact = "android-init", ArtifactType.Android)

android {
  namespace = "com.jonapoul.alakazam.init"
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)

  api(project(":android-core"))
  api(project(":android-logging"))

  testImplementation(project(":testing-core"))
}
