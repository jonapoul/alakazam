dependencyResolutionManagement {
  repositories {
    google {
      mavenContent {
        includeGroupByRegex(".*android.*")
        includeGroupByRegex(".*google.*")
      }
    }
    mavenCentral()
    gradlePluginPortal()
    mavenLocal()
    maven("https://central.sonatype.com/repository/maven-snapshots/")
  }
}

pluginManagement {
  repositories {
    google {
      mavenContent {
        includeGroupByRegex(".*android.*")
        includeGroupByRegex(".*google.*")
      }
    }
    mavenCentral()
    gradlePluginPortal()
    mavenLocal()
    maven("https://central.sonatype.com/repository/maven-snapshots/")
  }
}
