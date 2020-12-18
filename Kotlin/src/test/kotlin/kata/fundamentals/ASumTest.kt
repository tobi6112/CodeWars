package kata.fundamentals

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class ASumTest {

    private fun testing(n: Long, expected: Long) {
        val actual = ASum.findNb2(n)
        assertEquals(expected, actual)
    }
    @Test
    fun fixedTests() {
        testing(56396345062501, -1)
        testing(6132680780625, 2225)
        testing(28080884739601, -1)

    }
}