# Android Common

![Build](https://github.com/jonapoul/android-common/actions/workflows/actions.yml/badge.svg)
[![Jitpack](https://jitpack.io/v/jonapoul/android-common.svg)](https://jitpack.io/#jonapoul/android-common)

This is a simple library to hold a bunch of Kotlin extensions and utility functions that I use all the time in various projects. I just made this repo to keep them all in the same place and stop me copying them around all the time.

## API Reference
See [https://jonapoul.github.io/android-common](https://jonapoul.github.io/android-common).

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
    implementation "com.github.jonapoul:android-common:lib-ui:{version}"
    implementation "com.github.jonapoul:android-common:lib-domain:{version}"
    implementation "com.github.jonapoul.android-common:lib-data:{version}"
}
```
