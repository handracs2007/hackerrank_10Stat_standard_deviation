import kotlin.math.pow
import kotlin.math.sqrt

// https://www.hackerrank.com/challenges/s10-standard-deviation/problem

fun main() {
    readLine() // Ignore the number of numbers
    val numbers = readLine()!!.split(" ").map { it.toInt() }
    val average = numbers.average()
    val stdDev = sqrt(numbers.map { (it.toDouble() - average).pow(2) }.sum() / numbers.size.toDouble())

    println("%.1f".format(stdDev))
}