# Alakazam

![Build](https://github.com/jonapoul/alakazam/actions/workflows/actions.yml/badge.svg)
[![Jitpack](https://jitpack.io/v/jonapoul/alakazam.svg)](https://jitpack.io/#jonapoul/alakazam)

This is a simple library to hold a bunch of Kotlin extensions and utility functions that I use all the time in various
projects. I just made this repo to keep them all in the same place and stop me copying them around all the time.

## API Reference

See [https://jonapoul.github.io/alakazam](https://jonapoul.github.io/alakazam).

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
    implementation "com.github.jonapoul.alakazam:lib-core:{version}"
    implementation "com.github.jonapoul.alakazam:lib-coroutines:{version}"
    implementation "com.github.jonapoul.alakazam:lib-db:{version}"
    implementation "com.github.jonapoul.alakazam:lib-http:{version}"
    implementation "com.github.jonapoul.alakazam:lib-init:{version}"
    implementation "com.github.jonapoul.alakazam:lib-json:{version}"
    implementation "com.github.jonapoul.alakazam:lib-logging:{version}"
    implementation "com.github.jonapoul.alakazam:lib-prefs:{version}"
    implementation "com.github.jonapoul.alakazam:lib-time:{version}"
    implementation "com.github.jonapoul.alakazam:lib-ui-core:{version}"
    implementation "com.github.jonapoul.alakazam:lib-ui-view:{version}"
    implementation "com.github.jonapoul.alakazam:lib-ui-compose:{version}"
    implementation "com.github.jonapoul.alakazam:lib-domain:{version}"
    implementation "com.github.jonapoul.alakazam:lib-data:{version}"

    testImplementation "com.github.jonapoul.alakazam:testing-core:{version}"
    testImplementation "com.github.jonapoul.alakazam:testing-db:{version}"
    testImplementation "com.github.jonapoul.alakazam:testing-unit:{version}"
    androidTestImplementation "com.github.jonapoul.alakazam:testing-android:{version}"
}
```
