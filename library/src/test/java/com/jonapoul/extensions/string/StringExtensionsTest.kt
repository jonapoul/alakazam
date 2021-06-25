package com.jonapoul.extensions.string

import org.junit.Assert.*
import org.junit.Test

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
        assertError { "true ".parseBoolean() }
        assertError { " true".parseBoolean() }
        assertError { "false ".parseBoolean() }
        assertError { " false".parseBoolean() }
    }

    @Test
    fun `Fail parsing boolean with random words`() {
        assertError { "No, Neo, that's not true".parseBoolean() }
        assertError { "He's been true to his word".parseBoolean() }
        assertError { "wicked, tricksy, false".parseBoolean() }
        assertError { "False alarm.".parseBoolean() }
    }

    @Test
    fun capitalized() {
        assertEquals("Capitalised", "capitalised".capitalized())
        assertEquals("Capitalised", "Capitalised".capitalized())
        assertEquals("With spaces  ", "with spaces  ".capitalized())
        assertEquals("A bowl of fruit", "a bowl of fruit".capitalized())
        assertNotEquals("Leading space", " leading space".capitalized())
    }

    private fun assertError(block: () -> Unit) {
        assertThrows(IllegalStateException::class.java, block)
    }
}
