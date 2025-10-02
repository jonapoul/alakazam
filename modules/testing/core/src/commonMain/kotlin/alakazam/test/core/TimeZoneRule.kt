/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.test.core

import org.junit.rules.ExternalResource
import java.util.TimeZone

public class TimeZoneRule(private val tz: TimeZone) : ExternalResource() {
  private lateinit var default: TimeZone

  override fun before() {
    default = TimeZone.getDefault()
    TimeZone.setDefault(tz)
  }

  override fun after() {
    TimeZone.setDefault(default)
  }
}
