plugins {
  `kotlin-dsl`
}

fun DependencyHandler.plugin(dependency: Provider<PluginDependency>) =
  dependency.get().run { create("$pluginId:$pluginId.gradle.plugin:$version") }

dependencies {
  compileOnly(libs.plugin.agp)
  compileOnly(libs.plugin.kotlin)
  compileOnly(plugin(libs.plugins.androidCacheFix))
  compileOnly(plugin(libs.plugins.androidx.hilt))
  compileOnly(plugin(libs.plugins.compose))
  compileOnly(plugin(libs.plugins.detekt))
  compileOnly(plugin(libs.plugins.dokka))
  compileOnly(plugin(libs.plugins.kover))
  compileOnly(plugin(libs.plugins.licensee))
  compileOnly(plugin(libs.plugins.publish))
  compileOnly(plugin(libs.plugins.spotless))

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
