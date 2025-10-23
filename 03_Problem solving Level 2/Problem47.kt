// ===============================================================
// Problem 47 | Custom Round Function without using built-in round()
// ===============================================================

import kotlin.math.abs
import kotlin.math.round

// Function to get the fractional part of a floating-point number
// Example: if number = 4.75, it returns 0.75
fun getFractionPart(number: Float): Float {
    return number - number.toInt()
}

// Function to round a number manually (without built-in round())
fun myRound(number: Float): Int {
    // Get the integer part of the number
    var intPart = number.toInt()

    // Get the fractional part
    val fractionPart = getFractionPart(number)

    // If the absolute value of fractional part >= 0.5, adjust the integer part
    return if (abs(fractionPart) >= 0.5) {
        if (number > 0)
            ++intPart // round up for positive numbers
        else
            --intPart // round down for negative numbers
    } else {
        intPart // keep integer part as is
    }
}

// Function to read a floating-point number from user
fun readNumber(): Float {
    print("Please enter a float number: ")
    return readLine()!!.toFloat()
}

fun main() {
    // Read the number from user
    val number = readNumber()

    // Print result using our custom function
    println("My Round Result : ${myRound(number)}")

    // Print result using Kotlin built-in round() function
    println("Kotlin Round Result: ${round(number).toInt()}")

    // ==============================================================
    // Modern Kotlin version (clean & expressive)
    // ==============================================================

    println("\n================ Kotlin Professional Version ================\n")

    print("Enter a number: ")
    val input = readLine()!!.toFloat()

    // Custom round logic in one line using expression body
    val customRound = if (abs(input - input.toInt()) >= 0.5)
        if (input > 0) input.toInt() + 1 else input.toInt() - 1
    else
        input.toInt()

    println("My Round Result : $customRound")
    println("Kotlin Round Result: ${round(input).toInt()}")
}
