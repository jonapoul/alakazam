import org.gradle.api.tasks.testing.logging.TestExceptionFormat

buildscript {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }

    dependencies {
        classpath(libs.plugin.agp)
        classpath(libs.plugin.detekt)
        classpath(libs.plugin.doctor)
        classpath(libs.plugin.dokka)
        classpath(libs.plugin.hilt)
        classpath(libs.plugin.kotlin.gradle)
        classpath(libs.plugin.kotlin.serialization)
        classpath(libs.plugin.kover)
        classpath(libs.plugin.ktlint)
        classpath(libs.plugin.navigation)
        classpath(libs.plugin.spotless)
        classpath(libs.plugin.versions)
    }
}

configureDetekt()
configureDoctor()
configureDokka()
configureKover()
configureKtlint(libs.versions.ktlint.cli)
configureSpotless()
configureVersions()

allprojects {
    tasks.create("runChecks") {
        dependsOn("detekt", "spotlessCheck", "ktlintCheck")
    }

    repositories {
        mavenCentral()
        google()
    }
}

subprojects {
    tasks.withType<Test> {
        testLogging {
            exceptionFormat = TestExceptionFormat.FULL
            showCauses = true
            showExceptions = true
            showStackTraces = true
            showStandardStreams = true
        }
    }
}
