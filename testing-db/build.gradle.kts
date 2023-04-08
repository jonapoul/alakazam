configureAndroidLibrary()
configurePublishing(artifact = "testing-db", ArtifactType.Android)

android {
  namespace = "com.jonapoul.alakazam.test.db"
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)
  implementation(project(":android-core"))

  implementation(libs.room.ktx)
  implementation(libs.room.runtime)
  api(libs.room.testing)
  kapt(libs.room.compiler)

  api(libs.core.test)
  api(libs.robolectric)
}
