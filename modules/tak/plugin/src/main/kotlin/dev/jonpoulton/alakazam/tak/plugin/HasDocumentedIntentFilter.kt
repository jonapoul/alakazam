package dev.jonpoulton.alakazam.tak.plugin

import com.atakmap.android.ipc.AtakBroadcast.DocumentedIntentFilter

public interface HasDocumentedIntentFilter {
  public fun intentFilter(): DocumentedIntentFilter
}
