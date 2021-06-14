# Android Extensions

This is a simple library to hold a bunch of Kotlin extensions that I use all the time in various projects. I just made this repo to keep them all in the same place and stop me copying them around all the time. 

## Usage 
[![Jitpack](https://jitpack.io/v/jonapoul/android-extensions.svg)](https://jitpack.io/#jonapoul/android-extensions)

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
    implementation "com.github.jonapoul:android-extensions:1.0.1"
}
```
