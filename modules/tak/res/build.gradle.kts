@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android")
  id("convention-publish")
  id("convention-style-licensee")
  id("convention-style-spotless")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.res"

  buildFeatures {
    resValues = true
  }
}
