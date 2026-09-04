package alakazam.test

import java.util.Locale
import org.junit.rules.ExternalResource

public class LocaleRule(private val locale: Locale) : ExternalResource() {
  private lateinit var default: Locale

  override fun before() {
    default = Locale.getDefault()
    Locale.setDefault(locale)
  }

  override fun after() {
    Locale.setDefault(default)
  }
}
