package com.jonapoul.extensions

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test
import kotlin.reflect.KClass

class StringExtensionsTest {

    @Test
    fun `Successfully parse boolean`() {
        assertEquals(true, "true".parseBoolean())
        assertEquals(true, "TRUE".parseBoolean())
        assertEquals(true, "TrUe".parseBoolean())
        assertEquals(false, "false".parseBoolean())
        assertEquals(false, "FALSE".parseBoolean())
        assertEquals(false, "fAlSe".parseBoolean())
    }

    @Test
    fun `Fail parsing boolean with leading or trailing spaces`() {
        assertThrows(IllegalStateException::class) { "true ".parseBoolean() }
        assertThrows(IllegalStateException::class) { " true".parseBoolean() }
        assertThrows(IllegalStateException::class) { "false ".parseBoolean() }
        assertThrows(IllegalStateException::class) { " false".parseBoolean() }
    }

    @Test
    fun `Fail parsing boolean with random words`() {
        assertThrows(IllegalStateException::class) { "No, Neo, that's not true".parseBoolean() }
        assertThrows(IllegalStateException::class) { "He's been true to his word".parseBoolean() }
        assertThrows(IllegalStateException::class) { "wicked, tricksy, false".parseBoolean() }
        assertThrows(IllegalStateException::class) { "False alarm.".parseBoolean() }
    }

    @Test
    fun capitalized() {
        assertEquals("Capitalised", "capitalised".capitalized())
        assertEquals("Capitalised", "Capitalised".capitalized())
        assertEquals("With spaces  ", "with spaces  ".capitalized())
        assertEquals("A bowl of fruit", "a bowl of fruit".capitalized())
        assertNotEquals("Leading space", " leading space".capitalized())
    }

    private fun assertThrows(throwableClass: KClass<out Throwable>, block: () -> Unit) {
        try {
            block.invoke()
        } catch (t: Throwable) {
            if (!throwableClass.isInstance(t)) {
                throw t
            }
        }
    }
}
