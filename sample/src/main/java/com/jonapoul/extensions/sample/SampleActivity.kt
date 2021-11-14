package com.jonapoul.extensions.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.jonapoul.extensions.navigation.navControllers
import com.jonapoul.extensions.sample.databinding.ActivitySampleBinding
import com.jonapoul.extensions.viewbinding.viewBinding

class SampleActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivitySampleBinding::inflate)
    private val navController by navControllers(R.id.nav_host_fragment)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        setupActionBarWithNavController(
            navController,
            AppBarConfiguration(navController.graph)
        )
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}
