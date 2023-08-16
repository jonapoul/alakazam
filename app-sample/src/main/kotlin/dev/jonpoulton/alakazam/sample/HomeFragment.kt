package dev.jonpoulton.alakazam.sample

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import dev.jonpoulton.alakazam.core.toast
import dev.jonpoulton.alakazam.sample.databinding.FragmentHomeBinding
import dev.jonpoulton.alakazam.ui.core.CommonFragment
import dev.jonpoulton.alakazam.ui.core.safelyNavigate
import dev.jonpoulton.alakazam.ui.core.showCautionDialog
import dev.jonpoulton.alakazam.ui.core.showLoadingDialog
import dev.jonpoulton.alakazam.ui.core.showWarningDialog
import dev.jonpoulton.alakazam.ui.viewbinding.viewBinding

internal class HomeFragment : CommonFragment(layout = R.layout.fragment_home, menu = R.menu.home) {
  private val binding by viewBinding(FragmentHomeBinding::bind)

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
