configureAndroidLibrary()
configurePublishing(artifact = "di-koin", ArtifactType.Android)

android {
  namespace = "com.jonapoul.alakazam.di"
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)

  api(project(":android-core"))
  api(project(":android-http"))
  api(project(":android-init"))
  api(project(":android-prefs"))
  api(project(":android-ui-core"))
  api(project(":kotlin-coroutines"))

  api(libs.koin.core)
  api(libs.koin.android)

  testImplementation(project(":testing-core"))
}
