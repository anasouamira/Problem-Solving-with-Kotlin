// ===============================================================
// Problem 50 | Custom Square Root Function without using sqrt()
// ===============================================================

import kotlin.math.sqrt
import kotlin.math.pow

// Function to calculate the square root of a number
// Using power operation with exponent 0.5
fun mySqrt(number: Float): Double {
    return number.toDouble().pow(0.5)
}

// Function to read a number from user input
fun readNumber(): Float {
    print("Please enter a number: ")
    return readLine()!!.toFloat()
}

fun main() {
    // Read input from the user
    val number = readNumber()

    // Display custom sqrt result
    println("My MySqrt Result : ${mySqrt(number)}")

    // Display built-in Kotlin sqrt result
    println("Kotlin sqrt Result: ${sqrt(number)}")

    // ==============================================================
    // Kotlin Professional Version (concise & idiomatic)
    // ==============================================================

    println("\n================ Kotlin Professional Version ================\n")

    print("Enter a positive number: ")
    val input = readLine()!!.toDouble()

    // Custom sqrt using iterative approximation (Newton-Raphson Method)
    fun customSqrt(num: Double, epsilon: Double = 1e-6): Double {
        if (num < 0) throw IllegalArgumentException("Cannot compute sqrt of negative number")
        var guess = num / 2
        while (kotlin.math.abs(guess * guess - num) > epsilon) {
            guess = (guess + num / guess) / 2
        }
        return guess
    }

    println("My MySqrt Result : ${customSqrt(input)}")
    println("Kotlin sqrt Result: ${sqrt(input)}")
}
