import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

apply(plugin = "kotlinx-serialization")

configureKotlinLibrary()
configurePublishing(artifact = "kotlin-json", ArtifactType.Kotlin)

tasks.withType<KotlinCompile> {
    compilerOptions {
        freeCompilerArgs.addAll(
            "-opt-in=kotlinx.serialization.ExperimentalSerializationApi",
        )
    }
}

dependencies {
    api(project(":kotlin-core"))
    api(libs.kotlinx.serialization.json)

    testImplementation(project(":testing-core"))
}