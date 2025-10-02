/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.test.core

import org.junit.rules.ExternalResource
import java.util.Locale

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
