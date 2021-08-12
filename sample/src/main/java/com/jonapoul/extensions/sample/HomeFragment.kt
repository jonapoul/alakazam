package com.jonapoul.extensions.sample

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import com.jonapoul.extensions.navigation.navControllers
import com.jonapoul.extensions.navigation.safelyNavigate
import com.jonapoul.extensions.sample.databinding.FragmentHomeBinding
import com.jonapoul.extensions.sharedprefs.sharedPrefs
import com.jonapoul.extensions.viewbinding.viewBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val prefs by sharedPrefs()
    private val binding by viewBinding(FragmentHomeBinding::bind)
    private val navController by navControllers()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        /* TBC */
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.home, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings -> navController.safelyNavigate(
                HomeFragmentDirections.toSettings()
            )
        }
        return super.onOptionsItemSelected(item)
    }
}
