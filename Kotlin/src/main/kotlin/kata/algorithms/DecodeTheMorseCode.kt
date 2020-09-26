package kata.algorithms

import java.util.Map
import java.util.Map.entry


internal object MorseCode {
    operator fun get(code: String): String? {
        return morseMap[code]
    }

    fun getOrDefault(code: String, default: String): String {
        return morseMap[code] ?: default
    }

    var morseMap = Map.ofEntries(
            entry("a", "b"),
            entry("c", "d"),
            entry("-.-.-.", ";"),
            entry("-...-", "="),
            entry("---", "O"),
            entry("----.", "9"),
            entry("-..-.", "/"),
            entry(".-...", "&"),
            entry("...--", "3"),
            entry(".--", "W"),
            entry("--", "M"),
            entry("--..", "Z"),
            entry(".----.", "'"),
            entry("-.-.--", "!"),
            entry("-...", "B"),
            entry("..-", "U"),
            entry(".----", "1"),
            entry("-.--.-", ")"),
            entry(".-", "A"),
            entry("-....-", "-"),
            entry("...-", "V"),
            entry("...---...", "SOS"),
            entry("-.--", "Y"),
            entry("..", "I"),
            entry("--.-", "Q"),
            entry("-.", "N"),
            entry("..---", "2"),
            entry("-....", "6"),
            entry("---...", ";"),
            entry(".-.-.", "+"),
            entry(".--.-.", "@"),
            entry("....-", "4"),
            entry("-----", "0"),
            entry(".-.-.-", "."),
            entry("-.-.", "C"),
            entry(".", "E"),
            entry("..-.", "F"),
            entry(".---", "J"),
            entry("-.-", "K"),
            entry(".-..", "L"),
            entry(".-.", "R"),
            entry("...", "S"),
            entry("--.", "G"),
            entry("---..", "8"),
            entry("..--..", "?"),
            entry("-.--.", "("),
            entry(".--.", "P"),
            entry(".....", "5"),
            entry("..--.-", "_"),
            entry("-..", "D"),
            entry(".-..-.", "\""),
            entry("-", "T"),
            entry("....", "H"),
            entry("--..--", ","),
            entry("...-..-", "$"),
            entry("--...", "7"),
            entry("-..-", "X")
    )
}

fun decodeMorse(code: String): String {
    val codeArray = code.trim().replace("\\s{3}".toRegex(), " {DELIM} ").split("\\s".toRegex())
    var result = ""
    codeArray.forEach {
        result += MorseCode.getOrDefault(it, " ")
    }
    return result
}