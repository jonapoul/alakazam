plugins {
  id("java-library")
  id("kotlin")
  id("com.vanniktech.maven.publish")
}

java {
  sourceCompatibility = JavaVersion.VERSION_17
  targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
  kotlinConfig()
}

dependencies {
  api(projects.kotlinCore)
  testImplementation(projects.testingCore)
}
