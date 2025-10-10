/*
Problem14 |===========================================================

Write a program to read a number and print letter pattern as follows:

Input :
5

Output :
EEEEE
DDDD
CCC
BB
A

=====================================================================
*/

// ===========================================================
// Example 1 — Classic C++ Style Logic
// ===========================================================

/**
 * Reads a positive short number from the user.
 * Keeps asking until a valid positive number is entered.
 */
fun readPositiveShortClassic(message: String): Short {
    var number: Short?
    do {
        print(message)
        number = readLine()?.toShortOrNull()
    } while (number == null || number <= 0)
    return number
}

/**
 * Prints an inverted letter pattern like:
 * EEEEE
 * DDDD
 * CCC
 * BB
 * A
 *
 * This function follows the same logic as the C++ version (using ASCII math).
 */
fun printInvertedLetterPatternClassic(number: Short) {
    var currentCharCode = 65 + (number - 1) // ASCII of 'A' + (n - 1)
    var count = number

    for (i in currentCharCode downTo 65) { // Loop from 'E' to 'A'
        for (j in 1..count) {              // Print letter multiple times
            print(i.toChar())
        }
        println()
        count-- // Decrease repetitions for next line
    }
}


// ===========================================================
// Example 2 — Optimized Kotlin Version
// ===========================================================

/**
 * Reads a positive integer (simplified Kotlin style).
 */
fun readPositiveIntOptimized(message: String): Int {
    var number: Int?
    do {
        print(message)
        number = readLine()?.toIntOrNull()
    } while (number == null || number <= 0)
    return number
}

/**
 * Prints the inverted letter pattern using modern Kotlin style.
 * Uses Char arithmetic and String.repeat() for simplicity.
 */
fun printInvertedLetterPatternOptimized(number: Int) {
    println("\n--- Kotlin Optimized Pattern ---")

    for (i in number downTo 1) {
        val letter = 'A' + (i - 1) // Convert number to corresponding letter
        println("$letter".repeat(i))
    }
}


// ===========================================================
// Main Function — Run Both Examples
// ===========================================================
fun main() {
    // Example 1 — Classic C++ methodology
    val numberClassic = readPositiveShortClassic("Enter a number to print inverted letter pattern: ")
    println("\n--- Classic Approach ---")
    printInvertedLetterPatternClassic(numberClassic)

    // Example 2 — Modern Kotlin version
    val numberOptimized = numberClassic.toInt()
    printInvertedLetterPatternOptimized(numberOptimized)
}
