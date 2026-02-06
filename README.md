# Alakazam

![CI](https://github.com/jonapoul/alakazam/actions/workflows/main.yml/badge.svg)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/dev.jonpoulton.alakazam/kotlin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/dev.jonpoulton.alakazam/kotlin)

![Alakazam](docs/alakazam.png)

This is a simple library to hold a bunch of Kotlin extensions and utility functions that I use all the time in various
projects. I just made this repo to keep them all in the same place and stop me copying them around all the time.

## Documentation

TODO

## Usage

Add to your `settings.gradle.kts` file:

```gradle
dependencyResolutionManagement {
  repositories {
    mavenCentral()
  }
}
```

And add a dependency code to your **module**'s `build.gradle.kts` file.

```kotlin
dependencies {
  implementation("dev.jonpoulton.alakazam:android:{version}")
  implementation("dev.jonpoulton.alakazam:compose:{version}")
  implementation("dev.jonpoulton.alakazam:kotlin:{version}")
  testImplementation("dev.jonpoulton.alakazam:testing:{version}")
}
```
