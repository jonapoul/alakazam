# Alakazam

![Build](https://github.com/jonapoul/alakazam/actions/workflows/actions.yml/badge.svg)
[![Jitpack](https://jitpack.io/v/jonapoul/alakazam.svg)](https://jitpack.io/#jonapoul/alakazam)

![Alakazam](img/alakazam.png)

This is a simple library to hold a bunch of Kotlin extensions and utility functions that I use all the time in various
projects. I just made this repo to keep them all in the same place and stop me copying them around all the time.

## API Reference

See [https://jonapoul.github.io/alakazam/api/](https://jonapoul.github.io/alakazam/api/).

## Usage

Add below codes to your **root** `build.gradle` file (not your module build.gradle file).

```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```

And add a dependency code to your **module**'s `build.gradle` file.

```gradle
dependencies {
    /* Android libraries */
    implementation "com.github.jonapoul.alakazam:android-core:{version}"
    implementation "com.github.jonapoul.alakazam:android-db:{version}"
    implementation "com.github.jonapoul.alakazam:android-http:{version}"
    implementation "com.github.jonapoul.alakazam:android-init:{version}"
    implementation "com.github.jonapoul.alakazam:android-logging:{version}"
    implementation "com.github.jonapoul.alakazam:android-prefs:{version}"
    implementation "com.github.jonapoul.alakazam:android-theme:{version}"
    implementation "com.github.jonapoul.alakazam:android-ui-core:{version}"
    implementation "com.github.jonapoul.alakazam:android-ui-compose:{version}"
    implementation "com.github.jonapoul.alakazam:android-ui-view:{version}"
    
    /* DI libraries */
    implementation "com.github.jonapoul.alakazam:di-hilt:{version}"
    implementation "com.github.jonapoul.alakazam:di-koin:{version}"
        
    /* Kotlin libraries */
    implementation "com.github.jonapoul.alakazam:kotlin-core:{version}"
    implementation "com.github.jonapoul.alakazam:kotlin-coroutines:{version}"
    implementation "com.github.jonapoul.alakazam:kotlin-json:{version}"
    implementation "com.github.jonapoul.alakazam:kotlin-time:{version}"

    /* Testing libraries */
    testImplementation "com.github.jonapoul.alakazam:testing-core:{version}"
    testImplementation "com.github.jonapoul.alakazam:testing-db:{version}"
    testImplementation "com.github.jonapoul.alakazam:testing-unit:{version}"
    androidTestImplementation "com.github.jonapoul.alakazam:testing-android:{version}"
}
```
