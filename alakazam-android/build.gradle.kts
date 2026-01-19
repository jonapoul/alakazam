plugins {
  id("alakazam.module.android")
}

dependencies {
  implementation(libs.androidx.annotation)
  implementation(libs.androidx.core)
  implementation(libs.androidx.coreKtx)
  testImplementation(kotlin("test"))
}
