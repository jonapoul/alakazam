package com.jonapoul.extensions.sample

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import com.jonapoul.extensions.domain.safelyNavigate
import com.jonapoul.extensions.domain.toast
import com.jonapoul.extensions.sample.databinding.FragmentHomeBinding
import com.jonapoul.extensions.ui.dialogs.showCautionDialog
import com.jonapoul.extensions.ui.dialogs.showLoadingDialog
import com.jonapoul.extensions.ui.dialogs.showWarningDialog
import com.jonapoul.extensions.ui.navControllers
import com.jonapoul.extensions.ui.viewbinding.viewBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)
    private val navController by navControllers()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initCautionButton()
        initWarningButton()
        initLoadingButton()
    }

    private fun initCautionButton() {
        binding.cautionDialog.setOnClickListener {
            showCautionDialog("Something happened!")
        }
    }

    private fun initWarningButton() {
        binding.warningDialog.setOnClickListener {
            showWarningDialog("Something happened!")
        }
    }

    private fun initLoadingButton() {
        binding.loadingDialog.setOnClickListener {
            showLoadingDialog(
                onClickCancel = {
                    requireContext().toast("Loading cancelled!")
                }
            )
        }
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
