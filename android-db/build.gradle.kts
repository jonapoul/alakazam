configureAndroidLibrary()
configurePublishing(artifact = "android-db", ArtifactType.Android)

android {
  namespace = "com.jonapoul.alakazam.db"
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)

  api(project(":android-core"))

  api(libs.room.ktx)
  api(libs.room.runtime)
  kapt(libs.room.compiler)

  testImplementation(project(":testing-core"))
}
