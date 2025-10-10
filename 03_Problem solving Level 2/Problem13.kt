/*
Problem13 |===========================================================

Write a program to read a number and print letter pattern as follows?

Input :
5

Output :
1
22
333
4444
55555

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
 * Prints a number pattern like this (classic nested loop logic):
 * 1
 * 22
 * 333
 * 4444
 * 55555
 */
fun printNumberPatternClassic(number: Short) {
    for (i in 1..number) {              // Loop rows from 1 to N
        for (j in 1..i) {               // Print i, i times
            print(i)
        }
        println()                       // Move to the next line
    }
}


// ===========================================================
// Example 2 — Optimized Kotlin Version
// ===========================================================

/**
 * Reads a positive number (cleaner Kotlin version).
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
 * Prints the same number pattern using Kotlin's repeat() function.
 * This eliminates the need for an inner loop.
 */
fun printNumberPatternOptimized(number: Int) {
    println("\n--- Kotlin Optimized Pattern ---")
    for (i in 1..number) {
        println("$i".repeat(i))          // Repeat the string value of i, i times
    }
}


// ===========================================================
// Main Function — Run Both Examples
// ===========================================================
fun main() {
    val numberClassic = readPositiveShortClassic("Enter a number to print pattern: ")

    println("\n--- Classic Approach ---")
    printNumberPatternClassic(numberClassic)

    println()
    val numberOptimized = numberClassic.toInt()

    // Optimized Kotlin approach
    printNumberPatternOptimized(numberOptimized)
}
