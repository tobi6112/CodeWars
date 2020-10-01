package kata.algorithms

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class DecodeTheMorseCodeKtTest {

    @Test
    fun decodeMorse() {
        assertEquals("HEY JUDE", decodeMorse(".... . -.--   .--- ..- -.. ."))
    }
}