plugins {
  alias(libs.plugins.agp) apply false
  alias(libs.plugins.androidCacheFix) apply false
  alias(libs.plugins.androidx.hilt) apply false
  alias(libs.plugins.androidx.navigation) apply false
  alias(libs.plugins.dependencySort) apply false
  alias(libs.plugins.detekt) apply false
  alias(libs.plugins.dokka) apply false
  alias(libs.plugins.kotlin.android) apply false
  alias(libs.plugins.kotlin.compose) apply false
  alias(libs.plugins.kotlin.serialization) apply false
  alias(libs.plugins.ksp) apply false
  alias(libs.plugins.ktlint) apply false
  alias(libs.plugins.licensee) apply false
  alias(libs.plugins.powerAssert) apply false
  alias(libs.plugins.publish) apply false
  alias(libs.plugins.spotless) apply false
  alias(libs.plugins.sqldelight) apply false

  alias(libs.plugins.dependencyAnalysis)
  alias(libs.plugins.dependencyGuard)
  alias(libs.plugins.doctor)
  alias(libs.plugins.publishReport)
  alias(libs.plugins.kover)
  alias(libs.plugins.versions)
}

tasks.dependencyUpdates.configure {
  rejectVersionIf { !candidate.version.isStable() && currentVersion.isStable() }
}

fun String.isStable(): Boolean = listOf("alpha", "beta", "rc").none { lowercase().contains(it) }

doctor {
  javaHome {
    ensureJavaHomeMatches.set(false)
    ensureJavaHomeIsSet.set(true)
    failOnError.set(true)
  }
}

dependencyAnalysis {
  structure {
    ignoreKtx(ignore = true)
    bundle(name = "kotlin") { includeGroup("org.jetbrains.kotlin") }
    bundle(name = "modules") { include("^:.*\$".toRegex()) }
    bundle(name = "okhttp") { includeGroup(group = "com.squareup.okhttp3") }
  }

  reporting {
    printBuildHealth(true)
    onlyOnFailure(true)
  }

  abi {
    exclusions {
      ignoreInternalPackages()
      ignoreGeneratedCode()
    }
  }

  issues {
    all {
      onAny { severity(value = "fail") }
      onRuntimeOnly { severity(value = "ignore") }
    }
  }
}

dependencyGuard {
  configuration("classpath")
}
