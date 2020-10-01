package kata.fundamentals

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class GetTheMiddleCharacterKtTest {

    @Test
    fun basicTest() {
        assertEquals("es", getMiddle("test"));
        assertEquals("dd", getMiddle("middle"));
        assertEquals("t", getMiddle("testing"));
        assertEquals("A", getMiddle("A"));
    }
}