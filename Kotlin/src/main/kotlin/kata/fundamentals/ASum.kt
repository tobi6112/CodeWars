package kata.fundamentals

import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.sqrt

//https://www.codewars.com/kata/5592e3bd57b64d00f3000047
object ASum {

    fun findNb(m: Long): Long {
        var res = 0L
        var n = 1L

        while(res < m) {
            res += n.pow(3)
            n++
        }

        return if(res == m) n else -1
    }

    //Alternative solution
    fun findNb2(m: Long): Long {
        val n = (sqrt(8 * sqrt(m.toDouble()) + 1) - 1) / 2;
        return if(n == floor(n)) n.toLong() else -1
    }
}

fun Long.pow(e: Int) = this.toDouble().pow(e).toLong()