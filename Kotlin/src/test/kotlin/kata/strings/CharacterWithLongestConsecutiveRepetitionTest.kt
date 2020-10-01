package kata.strings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CharacterWithLongestConsecutiveRepetitionTest {

    private fun runTest(s: String,sol: Pair<Char?,Int>) = assertEquals(sol,CharacterWithLongestConsecutiveRepetition.longestRepetition(s))

    @Test
    fun longestRepetition() {
        runTest("aaaabb", Pair('a',4))
        runTest("bbbaaabaaaa", Pair('a',4))
        runTest("cbdeuuu900", Pair('u',3))
        runTest("abbbbb", Pair('b',5))
        runTest("aabb", Pair('a',2))
        runTest("", Pair(null,0))
        runTest("ba", Pair('b',1))
    }
}