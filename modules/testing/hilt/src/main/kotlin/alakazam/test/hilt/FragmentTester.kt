package alakazam.test.hilt

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.annotation.NavigationRes
import androidx.annotation.StyleRes
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.testing.TestNavHostController
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider

public class FragmentTester(
  @StyleRes public val themeResId: Int,
  @NavigationRes public val navGraph: Int,
  @IdRes public val navDestination: Int,
) {
  public inline fun <reified F : Fragment> launchFragment() {
    val navController = TestNavHostController(ApplicationProvider.getApplicationContext())
    launchFragmentInHiltContainer<F>(themeResId) {
      navController.setGraph(navGraph)
      navController.setCurrentDestination(navDestination)
      this.viewLifecycleOwnerLiveData.observeForever {
        if (it != null) {
          Navigation.setViewNavController(requireView(), navController)
        }
      }
    }
  }

  public inline fun <reified F : Fragment> launchFragmentInHiltContainer(
    @StyleRes themeResId: Int,
    fragmentArgs: Bundle? = null,
    crossinline action: F.() -> Unit = {},
  ) {
    val intent = Intent.makeMainActivity(
      ComponentName(
        ApplicationProvider.getApplicationContext(),
        HiltTestActivity::class.java
      )
    ).putExtra(
      "androidx.fragment.app.testing.FragmentScenario.EmptyFragmentActivity.THEME_EXTRAS_BUNDLE_KEY",
      themeResId
    )

    ActivityScenario.launch<HiltTestActivity>(intent).onActivity { activity ->
      val fragment = activity.supportFragmentManager.fragmentFactory.instantiate(
        F::class.java.classLoader!!,
        F::class.java.name
      ) as F
      fragment.arguments = fragmentArgs
      activity.supportFragmentManager
        .beginTransaction()
        .add(android.R.id.content, fragment, "")
        .commitNow()

      fragment.action()
    }
  }
}
