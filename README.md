# Alakazam

![Check](https://github.com/jonapoul/alakazam/actions/workflows/check.yml/badge.svg)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/dev.jonpoulton.alakazam/android-core/badge.svg)](https://maven-badges.herokuapp.com/maven-central/dev.jonpoulton.alakazam/android-core)

![Alakazam](docs/alakazam.png)

This is a simple library to hold a bunch of Kotlin extensions and utility functions that I use all the time in various
projects. I just made this repo to keep them all in the same place and stop me copying them around all the time.

## API Reference

See [https://jonapoul.github.io/alakazam/api/](https://jonapoul.github.io/alakazam/api/).

## Usage

Add below codes to your **root** `build.gradle` file (not your module build.gradle file).

```gradle
allprojects {
    repositories {
        mavenCentral()
    }
}
```

And add a dependency code to your **module**'s `build.gradle` file.

```gradle
dependencies {
    /* Android libraries */
    implementation "dev.jonpoulton.alakazam:android-core:{version}"
    implementation "dev.jonpoulton.alakazam:android-db:{version}"
    implementation "dev.jonpoulton.alakazam:android-http:{version}"
    implementation "dev.jonpoulton.alakazam:android-init:{version}"
    implementation "dev.jonpoulton.alakazam:android-logging:{version}"
    implementation "dev.jonpoulton.alakazam:android-prefs:{version}"
    implementation "dev.jonpoulton.alakazam:android-theme:{version}"
    implementation "dev.jonpoulton.alakazam:android-ui-core:{version}"
    implementation "dev.jonpoulton.alakazam:android-ui-compose:{version}"
    implementation "dev.jonpoulton.alakazam:android-ui-view:{version}"

    /* DI libraries */
    implementation "dev.jonpoulton.alakazam:di-hilt:{version}"
    implementation "dev.jonpoulton.alakazam:di-koin:{version}"

    /* Kotlin libraries */
    implementation "dev.jonpoulton.alakazam:kotlin-core:{version}"
    implementation "dev.jonpoulton.alakazam:kotlin-coroutines:{version}"
    implementation "dev.jonpoulton.alakazam:kotlin-json:{version}"
    implementation "dev.jonpoulton.alakazam:kotlin-time:{version}"

    /* Testing libraries */
    testImplementation "dev.jonpoulton.alakazam:testing-core:{version}"
    testImplementation "dev.jonpoulton.alakazam:testing-db:{version}"
    testImplementation "dev.jonpoulton.alakazam:testing-unit:{version}"
    androidTestImplementation "dev.jonpoulton.alakazam:testing-android:{version}"
}
```
