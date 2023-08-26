package dev.jonpoulton.alakazam.android.prefs

import android.content.Context
import androidx.preference.PreferenceManager
import androidx.test.core.app.ApplicationProvider
import app.cash.turbine.test
import com.fredporciuncula.flow.preferences.FlowSharedPreferences
import dev.jonpoulton.alakazam.test.core.CoroutineRule
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import kotlin.test.assertEquals
import kotlin.test.assertNull

@RunWith(RobolectricTestRunner::class)
class FlowSharedPreferencesExtensionsTest {
  @get:Rule
  val coroutineRule = CoroutineRule()

  private lateinit var flowPrefs: FlowSharedPreferences

  @Before
  fun before() {
    val ctx = ApplicationProvider.getApplicationContext<Context>()
    flowPrefs = FlowSharedPreferences(
      sharedPreferences = PreferenceManager.getDefaultSharedPreferences(ctx),
      coroutineContext = coroutineRule.dispatcher,
    )
  }

  @After
  fun after() {
    flowPrefs.clear()
  }

  @Test
  fun `Int preference`() = runTest {
    val prefPair = PrefPair(key = "int_key", default = -1)
    val pref = flowPrefs.getInt(prefPair)
    pref.asFlow().test {
      assertEquals(expected = -1, actual = awaitItem())
      pref.set(1234)
      assertEquals(expected = 1234, actual = awaitItem())
      pref.delete()
      assertEquals(expected = -1, actual = awaitItem())
      cancelAndIgnoreRemainingEvents()
    }
  }

  @Test
  fun `String preference`() = runTest {
    val prefPair = PrefPair(key = "string_key", default = "default")
    val pref = flowPrefs.getString(prefPair)
    pref.asFlow().test {
      assertEquals(expected = "default", actual = awaitItem())
      pref.set("abcd1234")
      assertEquals(expected = "abcd1234", actual = awaitItem())
      pref.delete()
      assertEquals(expected = "default", actual = awaitItem())
      cancelAndIgnoreRemainingEvents()
    }
  }

  @Test
  fun `Nullable string preference`() = runTest {
    val prefPair = PrefPair<String?>(key = "string_key", default = null)
    val pref = flowPrefs.getNullableString(prefPair)
    pref.asFlow().test {
      assertNull(awaitItem())
      pref.set("abcd1234")
      assertEquals(expected = "abcd1234", actual = awaitItem())
      pref.delete()
      assertNull(awaitItem())
      cancelAndIgnoreRemainingEvents()
    }
  }

  @Test
  fun `Bool preference`() = runTest {
    val prefPair = PrefPair(key = "bool_key", default = false)
    val pref = flowPrefs.getBoolean(prefPair)
    pref.asFlow().test {
      assertEquals(expected = false, actual = awaitItem())
      pref.set(true)
      assertEquals(expected = true, actual = awaitItem())
      pref.delete()
      assertEquals(expected = false, actual = awaitItem())
      cancelAndIgnoreRemainingEvents()
    }
  }

  @Test
  fun `Float preference`() = runTest {
    val prefPair = PrefPair(key = "float_key", default = 1.23f)
    val pref = flowPrefs.getFloat(prefPair)
    pref.asFlow().test {
      assertEquals(expected = 1.23f, actual = awaitItem())
      pref.set(-123.456f)
      assertEquals(expected = -123.456f, actual = awaitItem())
      pref.delete()
      assertEquals(expected = 1.23f, actual = awaitItem())
      cancelAndIgnoreRemainingEvents()
    }
  }

  @Test
  fun `String set preference`() = runTest {
    val default = setOf("a", "b", "c")
    val prefPair = PrefPair(key = "string_set_key", default = default)
    val pref = flowPrefs.getStringSet(prefPair)
    pref.asFlow().test {
      assertEquals(expected = default, actual = awaitItem())
      pref.set(emptySet())
      assertEquals(expected = emptySet(), actual = awaitItem())
      pref.delete()
      assertEquals(expected = default, actual = awaitItem())
      cancelAndIgnoreRemainingEvents()
    }
  }

  private data class ExampleClass(val data: String) {
    override fun toString(): String = data
  }

  @Test
  fun `Object preference`() = runTest {
    val serializer = object : SimpleStringSerializer<ExampleClass>(FlowSharedPreferencesExtensionsTest::ExampleClass) {}
    val default = ExampleClass(data = "abc")
    val prefPair = PrefPair(key = "object_key", default = default)
    val pref = flowPrefs.getObject(prefPair, serializer)

    pref.asFlow().test {
      assertEquals(expected = default, actual = awaitItem())

      val secondValue = ExampleClass(data = "def")
      pref.set(secondValue)
      assertEquals(expected = secondValue, actual = awaitItem())

      pref.delete()
      assertEquals(expected = default, actual = awaitItem())
      cancelAndIgnoreRemainingEvents()
    }
  }

  @Test
  fun `Nullable object preference`() = runTest {
    val serializer = object : SimpleNullableStringSerializer<ExampleClass>(::ExampleClass) {}
    val prefPair = PrefPair<ExampleClass?>(key = "nullable_object_key", default = null)
    val pref = flowPrefs.getNullableObject(prefPair, serializer)

    pref.asFlow().test {
      assertEquals(expected = null, actual = awaitItem())

      val value = ExampleClass(data = "xyz")
      pref.set(value)
      assertEquals(expected = value, actual = awaitItem())

      pref.delete()
      assertEquals(expected = null, actual = awaitItem())
      cancelAndIgnoreRemainingEvents()
    }
  }
}
