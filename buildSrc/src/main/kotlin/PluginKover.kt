import kotlinx.kover.api.CounterType
import kotlinx.kover.api.KoverMergedConfig
import kotlinx.kover.api.KoverProjectConfig
import kotlinx.kover.api.VerificationTarget
import kotlinx.kover.api.VerificationValueType
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure

fun Project.configureKover() {
  apply(plugin = "kover")

  extensions.configure<KoverMergedConfig> {
    enable()
  }

  extensions.configure<KoverProjectConfig> {
    filters {
      classes {
        includes.addAll(KOVER_INCLUDES)
        excludes.addAll(KOVER_EXCLUDES)
      }
    }

    verify {
      onCheck.set(true)
      rule {
        isEnabled = true
        target = VerificationTarget.ALL
        bound {
          minValue = 60
          counter = CounterType.INSTRUCTION
          valueType = VerificationValueType.COVERED_PERCENTAGE
        }
      }
    }
  }

  subprojects {
    apply(plugin = "kover")
  }
}

private val KOVER_INCLUDES = listOf(
  "com.jonapoul.*",
)

private val KOVER_EXCLUDES = listOf(
  /* Generated classes, mostly Hilt */
  "*.*ViewInjector*",
  "*.*MembersInjector",
  "*.*_Factory*",
  "*.*_Provide*Factory",
  "*.Hilt_*",
  "*.*_HiltModules*",
  "dagger.hilt.internal.*",
  "hilt_aggregated_deps.*",

  /* BuildConfig */
  "*.BuildConfig",

  /* Navigation */
  "*.*FragmentDirections*",
  "*.*FragmentArgs*",

  /* UI classes */
  "*.*Binding",
  "*.ui.*Activity*",
  "*.ui.*Application*",
  "*.ui.*Adapter*",
  "*.ui.*Dialog*",
  "*.ui.*DiffCallbacks*",
  "*.ui.*Fragment*",
  "*.ui.*Service*",
  "*.ui.*ViewHolder*",

  /* Hilt modules */
  "*.di.*",
)
