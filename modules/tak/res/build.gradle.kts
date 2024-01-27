@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.res"

  buildFeatures {
    resValues = true
  }
}
