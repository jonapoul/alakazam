plugins {
  id("java-library")
  id("kotlin")
  id("com.vanniktech.maven.publish")
}

java {
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
}

kotlin {
  kotlinConfig()
}

dependencies {
  api(projects.testingCore)

  api(libs.androidx.test.arch)
  api(libs.mockk.core)
  api(libs.robolectric)
}
