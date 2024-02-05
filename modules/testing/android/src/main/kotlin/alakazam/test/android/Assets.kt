package alakazam.test.android

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import java.io.InputStream

public fun getTestAssetAsStream(filename: String): InputStream =
  ApplicationProvider.getApplicationContext<Context>()
    .resources
    .assets
    .open(filename)
