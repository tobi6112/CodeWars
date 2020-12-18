package kata.fundamentals

import kotlin.math.pow

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
}

fun Long.pow(e: Int) = this.toDouble().pow(e).toLong()