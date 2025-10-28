/*
Problem10 |============================================================

Write a program to read a number and print it in order 
from left to right.

Input :
1234

Output :
1
2
3
4

=======================================================================
*/

// ===========================================================
// Example 1 — Classic C++-style methodology
// ===========================================================

/**
 * Reads a positive number from the user.
 * Keeps asking until the user enters a valid positive integer.
 */
fun readPositiveNumberClassic(message: String): Int {
    var number: Int?
    do {
        print(message)
        number = readLine()?.toIntOrNull()
    } while (number == null || number <= 0)
    return number
}

/**
 * Reverses the digits of the given number (same logic as in C++).
 */
fun reverseNumberClassic(numberInput: Int): Int {
    var number = numberInput
    var remainder: Int
    var reversed = 0

    while (number > 0) {
        remainder = number % 10
        number /= 10
        reversed = reversed * 10 + remainder
    }

    return reversed
}

/**
 * Prints each digit of the number on a new line.
 */
fun printDigitsClassic(numberInput: Int) {
    var number = numberInput
    var remainder: Int

    while (number > 0) {
        remainder = number % 10
        number /= 10
        println(remainder)
    }
}


// ===========================================================
// Example 2 — Optimized Kotlin version
// ===========================================================

/**
 * Reads a positive number (same validation, but cleaner function).
 */
fun readPositiveNumberOptimized(message: String): Int {
    var number: Int?
    do {
        print(message)
        number = readLine()?.toIntOrNull()
    } while (number == null || number <= 0)
    return number
}

/**
 * Prints digits from left to right directly by converting to string.
 * This avoids reversing and arithmetic operations.
 */
fun printDigitsOptimized(number: Int) {
    println("\nDigits (optimized Kotlin approach):")
    number.toString().forEach { digit ->
        println(digit)
    }
}


// ===========================================================
// Main — Run both examples
// ===========================================================
fun main() {
    // Read the number once and use it for both methods
    val number = run {
        var n: Int?
        do {
            print("Please enter a positive number: ")
            n = readLine()?.toIntOrNull()
        } while (n == null || n <= 0)
        n
    }

    println("\nDigits (classic approach):")
    printDigitsClassic(reverseNumberClassic(number))

    printDigitsOptimized(number)
}
