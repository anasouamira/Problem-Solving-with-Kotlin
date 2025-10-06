// 🔹 Problem06: Read a number and print the sum of its digits
// This file includes two examples:
// Example 1 → Classic translation from C++ (same logic step-by-step)
// Example 2 → Professional Kotlin version (concise and idiomatic)


// ===========================================================
// Example 1 — Classic translation from the C++ methodology
// ===========================================================

/**
 * Reads a positive integer from the user.
 * Keeps asking until a non-negative number is entered.
 */
fun readPositiveNumberClassic(message: String): Int {
    var number: Int
    do {
        print(message)
        number = readLine()?.toIntOrNull() ?: -1
    } while (number < 0)
    return number
}

/**
 * Calculates and prints the sum of digits using arithmetic operations.
 */
fun printSumOfDigitsClassic(number: Int) {
    var num = number
    var sum = 0

    do {
        val remainder = num % 10  // Extract the last digit
        sum += remainder          // Add it to the sum
        num /= 10                 // Remove the last digit
    } while (num > 0)

    println("Sum of digits (classic method): $sum")
}


// ===========================================================
// Example 2 — Professional idiomatic Kotlin version
// ===========================================================

/**
 * Calculates the sum of digits using functional Kotlin features.
 */
fun printSumOfDigitsOptimized(number: Int) {
    val sum = number.toString().sumOf { it.digitToInt() }
    println("Sum of digits (optimized Kotlin method): $sum")
}


// ===========================================================
// Main function
// ===========================================================

fun main() {
    val number = readPositiveNumberClassic("Enter a positive number to calculate the sum of its digits: ")

    // Example 1: C++-style logic
    printSumOfDigitsClassic(number)

    // Example 2: Professional Kotlin-style solution
    printSumOfDigitsOptimized(number)
}
