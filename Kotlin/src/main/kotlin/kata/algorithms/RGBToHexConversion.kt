package kata.algorithms

//https://www.codewars.com/kata/513e08acc600c94f01000001
fun rgb(r: Int, g: Int, b: Int): String {
    return "${hexValue(r)}${hexValue(g)}${hexValue(b)}"
}

fun hexValue(n: Int): String {
    return if(n < 0 ) "00" else if(n > 255) "FF" else n.toString(16).padStart(2, '0').toUpperCase()
}