import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.create

enum class ArtifactType(internal val componentName: String) {
  Android(componentName = "release"),
  Kotlin(componentName = "java"),
}

fun Project.configurePublishing(artifact: String, artifactType: ArtifactType) {
  apply(plugin = "maven-publish")

  afterEvaluate {
    extensions.configure<PublishingExtension> {
      publications {
        create<MavenPublication>(name = "maven") {
          groupId = "com.jonapoul.alakazam"
          artifactId = artifact
          version = BuildConstants.LIB_VERSION_NAME
          from(components.getByName(artifactType.componentName))

          pom {
            name.set("Alakazam")
            description.set("A set of useful functions and extensions for Kotlin/Android development.")
            inceptionYear.set("2021")
            url.set("https://github.com/jonapoul/alakazam")
            scm {
              url.set("https://github.com/jonapoul/alakazam")
              connection.set("scm:git:git://github.com/jonapoul/alakazam.git")
              developerConnection.set("scm:git:git://github.com/jonapoul/alakazam.git")
            }
            licenses {
              license {
                name.set("The Apache Software License, Version 2.0")
                url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("repo")
              }
            }
            developers {
              developer {
                id.set("jonapoul")
                name.set("Jon Poulton")
                url.set("https://github.com/jonapoul/")
              }
            }
          }
        }
      }
    }
  }
}
