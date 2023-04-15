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
  implementation(libs.kotlin.stdlib)
  testImplementation(projects.testingCore)
}
