plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
    google()
}

dependencies {
    api(libs.plugin.agp)
    api(libs.plugin.detekt)
    api(libs.plugin.dokka)
    api(libs.plugin.kotlin.gradle)
    api(libs.plugin.kover)
    api(libs.plugin.ktlint)
    api(libs.plugin.spotless)
    api(libs.plugin.versions)
}
