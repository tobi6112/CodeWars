package kata.fundamentals

import kotlin.math.roundToInt

fun nbYear(pp0:Int, percent:Double, aug:Int, p:Int):Int {
    val populationCalculator: (Int, Double, Int) -> Int = {
        iPopulation, iPercent, iAug -> (iPopulation * (1 + (iPercent / 100)) + iAug).roundToInt()
    }

    var years = 1
    var population = pp0

    population = populationCalculator(population, percent, aug)

    while(population < p) {
        population = populationCalculator(population, percent, aug)
        years++
    }
    return years
}