package kata.strings

object CharacterWithLongestConsecutiveRepetition {
    fun longestRepetition(s: String): Pair<Char?,Int> {
        var char: Char? = null
        var max = 0
        var count = 0

        val charArray = s.toCharArray()
        charArray.forEachIndexed { index, c ->
            if(++count > max) {
                char = c
                max = count
            }
            if(charArray.size > index + 1 && charArray[index + 1] != c) {
                count = 0
            }
        }

        return Pair(char, max)
    }
}