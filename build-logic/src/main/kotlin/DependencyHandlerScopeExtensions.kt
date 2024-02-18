@file:Suppress("DeprecatedCallableAddReplaceWith", "UNUSED_PARAMETER", "UnusedReceiverParameter")

import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory.SubDependencyFactory
import org.gradle.kotlin.dsl.DependencyHandlerScope

@Deprecated(
  message = "You probably meant to enter some child of the libs coordinate.",
  level = DeprecationLevel.ERROR,
)
fun DependencyHandlerScope.implementation(factory: SubDependencyFactory): Nothing = error("Not supported!")

@Deprecated(
  message = "You probably meant to enter some child of the libs coordinate.",
  level = DeprecationLevel.ERROR,
)
fun DependencyHandlerScope.api(factory: SubDependencyFactory): Nothing = error("Not supported!")

@Deprecated(
  message = "You probably meant to enter some child of the libs coordinate.",
  level = DeprecationLevel.ERROR,
)
fun DependencyHandlerScope.compileOnly(factory: SubDependencyFactory): Nothing = error("Not supported!")

@Deprecated(
  message = "You probably meant to enter some child of the libs coordinate.",
  level = DeprecationLevel.ERROR,
)
fun DependencyHandlerScope.runtimeOnly(factory: SubDependencyFactory): Nothing = error("Not supported!")

@Deprecated(
  message = "You probably meant to enter some child of the libs coordinate.",
  level = DeprecationLevel.ERROR,
)
fun DependencyHandlerScope.testImplementation(factory: SubDependencyFactory): Nothing = error("Not supported!")
