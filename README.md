# Android Common

![Build](https://github.com/jonapoul/android-common/actions/workflows/actions.yml/badge.svg)
[![Jitpack](https://jitpack.io/v/jonapoul/android-common.svg)](https://jitpack.io/#jonapoul/android-common)

This is a simple library to hold a bunch of Kotlin extensions and utility functions that I use all the time in various
projects. I just made this repo to keep them all in the same place and stop me copying them around all the time.

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
    implementation "com.github.jonapoul.android-common:lib-core:{version}"
    implementation "com.github.jonapoul.android-common:lib-coroutines:{version}"
    implementation "com.github.jonapoul.android-common:lib-db:{version}"
    implementation "com.github.jonapoul.android-common:lib-http:{version}"
    implementation "com.github.jonapoul.android-common:lib-init:{version}"
    implementation "com.github.jonapoul.android-common:lib-json:{version}"
    implementation "com.github.jonapoul.android-common:lib-logging:{version}"
    implementation "com.github.jonapoul.android-common:lib-prefs:{version}"
    implementation "com.github.jonapoul.android-common:lib-time:{version}"
    implementation "com.github.jonapoul.android-common:lib-ui-core:{version}"
    implementation "com.github.jonapoul.android-common:lib-ui-view:{version}"
    implementation "com.github.jonapoul.android-common:lib-ui-compose:{version}"
    implementation "com.github.jonapoul.android-common:lib-domain:{version}"
    implementation "com.github.jonapoul.android-common:lib-data:{version}"

    testImplementation "com.github.jonapoul.android-common:testing-core:{version}"
    testImplementation "com.github.jonapoul.android-common:testing-db:{version}"
    testImplementation "com.github.jonapoul.android-common:testing-unit:{version}"
    androidTestImplementation "com.github.jonapoul.android-common:testing-android:{version}"
}
```
