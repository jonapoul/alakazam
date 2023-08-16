import com.android.build.gradle.api.AndroidBasePlugin
import org.gradle.api.Project

fun Project.isAndroid(): Boolean {
  return plugins.any { it is AndroidBasePlugin }
}
