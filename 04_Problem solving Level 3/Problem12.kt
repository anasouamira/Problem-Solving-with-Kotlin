/*
Problem12 |===========================================================

Write a program to read a number and print letter pattern as follows?

Input :
5

Output :
55555
4444
333
22
1

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
    } while (number == null || number < 0)
    return number
}

/**
 * Prints the inverted numeric pattern exactly like the C++ version.
 * Example for input 5:
 * 55555
 * 4444
 * 333
 * 22
 * 1
 */
fun printInvertedPatternClassic(number: Short) {
    for (i in number downTo 1) {        // From number down to 1
        for (j in 1..i) {               // Print i, i times
            print(i)
        }
        println()                       // Move to next line
    }
}


// ===========================================================
// Example 2 — Optimized Kotlin Version
// ===========================================================

/**
 * Reads a positive number (cleaner Kotlin version).
 */
fun readPositiveShortOptimized(message: String): Int {
    var number: Int?
    do {
        print(message)
        number = readLine()?.toIntOrNull()
    } while (number == null || number <= 0)
    return number
}

/**
 * Prints the same pattern but using Kotlin's string utilities.
 * Uses the repeat() function to simplify inner loop.
 */
fun printInvertedPatternOptimized(number: Int) {
    println("\n--- Kotlin Optimized Pattern ---")
    for (i in number downTo 1) {
        println("$i".repeat(i))          // Repeat number as string i times
    }
}


// ===========================================================
// Main Function — Run Both Examples
// ===========================================================
fun main() {
    val numberClassic = readPositiveShortClassic("Enter a number to print inverted pattern: ")

    println("\n--- Classic Approach ---")
    printInvertedPatternClassic(numberClassic)

    println()
    val numberOptimized = numberClassic.toInt()

    // Optimized Kotlin approach
    printInvertedPatternOptimized(numberOptimized)
}
