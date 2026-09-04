package alakazam.test

import java.util.TimeZone
import org.junit.rules.ExternalResource

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
