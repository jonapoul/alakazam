package dev.jonpoulton.alakazam.sample

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import dev.jonpoulton.alakazam.android.core.toast
import dev.jonpoulton.alakazam.android.navigation.navControllers
import dev.jonpoulton.alakazam.android.navigation.safelyNavigate
import dev.jonpoulton.alakazam.android.ui.appcompat.CommonFragment
import dev.jonpoulton.alakazam.android.ui.material.showCautionDialog
import dev.jonpoulton.alakazam.android.ui.material.showLoadingDialog
import dev.jonpoulton.alakazam.android.ui.material.showWarningDialog
import dev.jonpoulton.alakazam.android.ui.viewbinding.viewBinding
import dev.jonpoulton.alakazam.sample.databinding.FragmentHomeBinding

internal class HomeFragment : CommonFragment(layout = R.layout.fragment_home, menu = R.menu.home) {
  private val binding by viewBinding(FragmentHomeBinding::bind)
  private val navController by navControllers()

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
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
        onClickCancel = { requireContext().toast("Loading cancelled!") }
      )
    }
  }

  override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
    when (menuItem.itemId) {
      R.id.action_settings -> navController.safelyNavigate(HomeFragmentDirections.toSettings())
      else -> return false
    }
    return true
  }
}
