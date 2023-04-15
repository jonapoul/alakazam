plugins {
  id("java-library")
  id("kotlin")
  id("kotlinx-serialization")
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
  api(projects.kotlinCore)
  implementation(libs.kotlinx.serialization.json)
  testImplementation(projects.testingCore)
}
