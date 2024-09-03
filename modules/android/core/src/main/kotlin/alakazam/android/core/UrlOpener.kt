package alakazam.android.core

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.core.content.ContextCompat

public class UrlOpener(private val context: Context) {
  public fun openUrl(url: String) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
    ContextCompat.startActivity(context, intent, null)
  }
}
