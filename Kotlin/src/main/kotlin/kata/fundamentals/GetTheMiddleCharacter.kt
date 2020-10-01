package kata.fundamentals

fun getMiddle(word : String) : String {
    return if(word.length % 2 == 0) {
        word.substring(word.length / 2 - 1, word.length / 2 + 1)
    } else {
        word.substring(word.length / 2, word.length / 2 + 1)
    }

}