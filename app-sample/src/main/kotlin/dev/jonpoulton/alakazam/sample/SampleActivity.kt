package dev.jonpoulton.alakazam.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import dev.jonpoulton.alakazam.sample.databinding.ActivitySampleBinding
import dev.jonpoulton.alakazam.ui.core.navControllers
import dev.jonpoulton.alakazam.ui.viewbinding.viewBinding

internal class SampleActivity : AppCompatActivity() {
  private val binding by viewBinding(ActivitySampleBinding::inflate)
  private val navController by navControllers(R.id.nav_host_fragment)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(binding.root)
    setSupportActionBar(binding.toolbar)
    setupActionBarWithNavController(
      navController,
      AppBarConfiguration(navController.graph),
    )
  }

  override fun onSupportNavigateUp(): Boolean = navController.navigateUp() || super.onSupportNavigateUp()
}
