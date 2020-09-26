package kata.fundamentals

import kotlin.math.pow

fun nbDig(n:Int, d:Int):Int {
    var start = 0
    return generateSequence {
        (start++)
    }.takeWhile {
        it <= n
    }.map {
        it * it
    }.map {
        var occ = 0
        var num = it
        if(num == 0 && d == 0) {
            occ++
        }
        while(num > 0) {
            val digit = num % 10
            if (digit == d) {
                occ++
            }
            num /= 10
        }
        occ
    }.sum()
}