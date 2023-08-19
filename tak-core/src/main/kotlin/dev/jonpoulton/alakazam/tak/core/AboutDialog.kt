package dev.jonpoulton.alakazam.tak.core

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.atakmap.android.maps.MapView
import dev.jonpoulton.alakazam.core.IBuildConfig
import dev.jonpoulton.alakazam.core.inflater
import dev.jonpoulton.alakazam.time.localisedFormatter
import dev.jonpoulton.alakazam.ui.core.show

object AboutDialog {
  fun show(appContext: AppContext, pluginContext: PluginContext, buildConfig: IBuildConfig): AlertDialog =
    showImpl(appContext, pluginContext, buildConfig)

  fun show(mapView: MapView, pluginContext: PluginContext, buildConfig: IBuildConfig): AlertDialog =
    showImpl(mapView.context, pluginContext, buildConfig)

  private fun showImpl(appContext: Context, pluginContext: PluginContext, buildConfig: IBuildConfig): AlertDialog {
    val view = pluginContext.inflater.inflate(R.layout.dialog_about, null, false)
    AboutBinding(view).apply {
      version.icon.setImageResource(R.drawable.ic_version)
      version.title.setText(R.string.about_version)
      version.subtitle.text = buildConfig.versionName

      buildTime.icon.setImageResource(R.drawable.ic_calendar)
      buildTime.title.setText(R.string.about_build_time)
      val timestamp = "yyyy-dd-MM HH:mm:ss z".localisedFormatter.format(buildConfig.buildTime)
      buildTime.subtitle.text = timestamp

      source.icon.setImageResource(R.drawable.ic_source)
      source.title.setText(R.string.about_source)
      source.subtitle.text = buildConfig.repoName
      source.launchButton.show()
      source.launchButton.setOnClickListener {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(buildConfig.repoUrl)
        appContext.startActivity(intent)
      }
    }
    return PluginAlertDialogBuilder(appContext, pluginContext)
      .setTitle(R.string.about_title)
      .setView(view)
      .setSimplePositiveButton()
      .show()
  }

  private class AboutBinding(
    val version: AboutItemBinding,
    val buildTime: AboutItemBinding,
    val source: AboutItemBinding,
  ) {
    constructor(view: View) : this(
      version = AboutItemBinding(view.findViewById(R.id.version)),
      buildTime = AboutItemBinding(view.findViewById(R.id.build_time)),
      source = AboutItemBinding(view.findViewById(R.id.source)),
    )
  }

  private class AboutItemBinding(
    val icon: ImageView,
    val title: TextView,
    val subtitle: TextView,
    val launchButton: Button,
  ) {
    constructor(view: View) : this(
      icon = view.findViewById(R.id.icon),
      title = view.findViewById(R.id.title),
      subtitle = view.findViewById(R.id.subtitle),
      launchButton = view.findViewById(R.id.launch_button),
    )
  }
}
