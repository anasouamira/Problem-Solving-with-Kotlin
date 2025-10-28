// 🔹 Problem05: Read a number and print it in reversed order
// This file includes two examples:
// Example 1 → Classic translation from C++ (same logic step-by-step)
// Example 2 → Professional Kotlin version (more idiomatic and concise)


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
 * Prints digits of a number in reverse order using arithmetic operations.
 */
fun printReversedClassic(number: Int) {
    var num = number
    println("\nReversed order (classic method):")
    do {
        val remainder = num % 10   // Extract last digit
        println(remainder)         // Print it
        num /= 10                  // Remove last digit
    } while (num > 0)
}


// ===========================================================
// Example 2 — Professional idiomatic Kotlin version
// ===========================================================

/**
 * Prints digits of a number in reverse order using Kotlin string manipulation.
 */
fun printReversedOptimized(number: Int) {
    println("\nReversed order (optimized Kotlin method):")
    number.toString().reversed().forEach { digit ->
        println(digit)
    }
}


// ===========================================================
// Main function
// ===========================================================

fun main() {
    val number = readPositiveNumberClassic("Enter a number to print it in reversed order: ")

    // Example 1: Same logic as original C++ version
    printReversedClassic(number)

    // Example 2: Professional optimized Kotlin approach
    printReversedOptimized(number)
}
