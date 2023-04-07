package com.jonapoul.alakazam.core

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class EnumsTest {
    private enum class BasicEnum { A, B, C, D }
    private enum class EnumWithVal(val value: Int) { A(1), B(2), C(3), D(4) }

    @Test
    fun `First or null`() {
        assertEquals(
            BasicEnum.A,
            Enums.firstOrNull<BasicEnum> { it.ordinal == 0 },
        )
        assertEquals(
            null,
            Enums.firstOrNull<BasicEnum> { it.ordinal == 4 },
        )
        assertEquals(
            EnumWithVal.A,
            Enums.firstOrNull<EnumWithVal> { it.value == 1 },
        )
        assertEquals(
            null,
            Enums.firstOrNull<EnumWithVal> { it.value == 0 },
        )
    }

    @Test
    fun `First or throw`() {
        assertEquals(
            BasicEnum.B,
            Enums.first<BasicEnum> { it.ordinal == 1 },
        )
        assertThrows(NoSuchElementException::class.java) {
            Enums.first<BasicEnum> { it.ordinal == 4 }
        }
        assertEquals(
            EnumWithVal.B,
            Enums.first<EnumWithVal> { it.value == 2 },
        )
        assertThrows(NoSuchElementException::class.java) {
            Enums.first<EnumWithVal> { it.value == 0 }
        }
    }

    @Test
    fun `First or null from string`() {
        assertEquals(
            BasicEnum.C,
            Enums.firstOrNullFromString<BasicEnum>("C"),
        )
        assertEquals(
            null,
            Enums.firstOrNullFromString<BasicEnum>("E"),
        )
        assertEquals(
            EnumWithVal.C,
            Enums.firstOrNullFromString<EnumWithVal>("C"),
        )
        assertEquals(
            null,
            Enums.firstOrNullFromString<EnumWithVal>("E"),
        )
    }

    @Test
    fun `First or throw from string`() {
        assertEquals(
            BasicEnum.D,
            Enums.firstFromString<BasicEnum>("D"),
        )
        assertThrows(NoSuchElementException::class.java) {
            Enums.firstFromString<BasicEnum>("E")
        }
        assertEquals(
            EnumWithVal.D,
            Enums.firstFromString<EnumWithVal>("D"),
        )
        assertThrows(NoSuchElementException::class.java) {
            Enums.firstFromString<EnumWithVal>("E")
        }
    }
}
