plugins {
  `kotlin-dsl`
}

dependencies {
  compileOnly(libs.plugin.agp)
  compileOnly(libs.plugin.androidCacheFix)
  compileOnly(libs.plugin.compose)
  compileOnly(libs.plugin.dependencyAnalysis)
  compileOnly(libs.plugin.dependencyGuard)
  compileOnly(libs.plugin.detekt)
  compileOnly(libs.plugin.dokka)
  compileOnly(libs.plugin.hilt)
  compileOnly(libs.plugin.kotlin)
  compileOnly(libs.plugin.kover)
  compileOnly(libs.plugin.ktlint)
  compileOnly(libs.plugin.licensee)
  compileOnly(libs.plugin.publish)
  compileOnly(libs.plugin.spotless)

  implementation(libs.plugin.blueprint.core)
  implementation(libs.plugin.blueprint.recipes)
}

gradlePlugin {
  plugins {
    create(id = "alakazam.module.android", impl = "alakazam.gradle.ModuleAndroid")
    create(id = "alakazam.module.kotlin", impl = "alakazam.gradle.ModuleKotlin")
    create(id = "alakazam.module.kotlin.nopublish", impl = "alakazam.gradle.ModuleKotlinNoPublish")
    create(id = "alakazam.module.multiplatform", impl = "alakazam.gradle.ModuleMultiplatform")
  }
}

fun NamedDomainObjectContainer<PluginDeclaration>.create(id: String, impl: String) = create(id) {
  this.id = id
  implementationClass = impl
}
