package src.learnException

import java.lang.NumberFormatException

fun main() {
    val x = try {
        readLine()?.toInt()
    } catch (e: NumberFormatException) {
        0
    } finally {
        println("the number is inputted")
    }
    println("the number is $x")
    val ans = try {
        divide(6.0, 0.0)
    } catch (e: DivisionByZeroException) {
        println("Please choose other divisor")
    }
}

class DivisionByZeroException : Exception("Cannot divide by zero")

fun divide(x: Double, y: Double): Double {
    if(y == 0.0) {
        throw DivisionByZeroException()
    }
    return x/y
}