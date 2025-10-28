/*
Problem15 |===========================================================

Write a program to read a number and print letter pattern as follows:

Input :
5

Output :
A
BB
CCC
DDDD
EEEEE

=====================================================================
*/

// ===========================================================
// Example 1 — Classic C++ Style Logic
// ===========================================================

/**
 * Reads a positive short number from the user (like in C++).
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
 * Prints the increasing letter pattern:
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 *
 * Logic follows the same steps as in C++ (using ASCII math).
 */
fun printLetterPatternClassic(number: Short) {
    val finalLetterAscii = 65 + (number - 1) // 'A' = 65
    var counter = 1

    for (i in 65..finalLetterAscii) {
        for (j in 1..counter) {
            print(i.toChar()) // Convert ASCII code to letter
        }
        println()
        counter++ // Increase repetition each row
        if (counter > number)
            break
    }
}


// ===========================================================
// Example 2 — Optimized Kotlin Version
// ===========================================================

/**
 * Reads a positive integer in modern Kotlin style.
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
 * Prints the letter pattern using Kotlin features.
 * Uses Char arithmetic and String.repeat() for clarity.
 */
fun printLetterPatternOptimized(number: Int) {
    println("\n--- Kotlin Optimized Pattern ---")
    for (i in 1..number) {
        val letter = 'A' + (i - 1)
        println("$letter".repeat(i))
    }
}


// ===========================================================
// Main Function — Run Both Examples
// ===========================================================
fun main() {
    // Example 1 — Classic (C++ style)
    val numberClassic = readPositiveShortClassic("Enter a number to print letter pattern: ")
    println("\n--- Classic Approach ---")
    printLetterPatternClassic(numberClassic)

    // Example 2 — Modern Kotlin version
    val numberOptimized = numberClassic.toInt()
    printLetterPatternOptimized(numberOptimized)
}
