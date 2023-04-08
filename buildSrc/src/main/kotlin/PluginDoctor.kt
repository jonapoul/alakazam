import com.osacky.doctor.DoctorExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure

fun Project.configureDoctor() {
  apply(plugin = "com.osacky.doctor")

  extensions.configure<DoctorExtension> {
    /* Non-default config TBC */
  }
}
