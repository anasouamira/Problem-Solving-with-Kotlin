/*
Problem11 |=============================================================

Write a program to read a number and check if it is Palindrome?

Input :
1234
12321

Output :
No, it is NOT a Palindrome number.
Yes, it is a Palindrome number.

=======================================================================
*/

import kotlin.math.*

// ===========================================================
// Example 1 — Classic C++-style logic
// ===========================================================

/**
 * Reads a positive integer from the user.
 * Keeps asking until the input is valid (positive number).
 */
fun readPositiveNumberClassic(message: String): Int {
    var number: Int?
    do {
        print(message)
        number = readLine()?.toIntOrNull()
    } while (number == null || number < 0)
    return number
}

/**
 * Reverses a number manually (like the C++ version using remainder and division).
 */
fun reverseNumberClassic(numberInput: Int): Int {
    var number = numberInput
    var remainder: Int
    var reversed = 0

    while (number > 0) {
        remainder = number % 10           // Extract last digit
        number /= 10                      // Remove last digit
        reversed = reversed * 10 + remainder  // Build reversed number
    }

    return reversed
}

/**
 * Checks if a number is a palindrome by comparing it with its reversed version.
 */
fun isPalindromeClassic(number: Int): Boolean {
    return number == reverseNumberClassic(number)
}


// ===========================================================
// Example 2 — Optimized Kotlin version
// ===========================================================

/**
 * Reads a positive number (cleaner Kotlin version).
 */
fun readPositiveNumberOptimized(message: String): Int {
    var number: Int?
    do {
        print(message)
        number = readLine()?.toIntOrNull()
    } while (number == null || number < 0)
    return number
}

/**
 * Checks palindrome using string reversal — modern Kotlin way.
 */
fun isPalindromeOptimized(number: Int): Boolean {
    val text = number.toString()          // Convert number to string
    return text == text.reversed()        // Compare with its reversed form
}


// ===========================================================
// Main — Run both examples
// ===========================================================
fun main() {
    // Read number once for both methods
    val number = readPositiveNumberClassic("Enter a number to check if it is a Palindrome: ")

    println("\n--- Classic Approach ---")
    if (isPalindromeClassic(number))
        println("Yes, it is a Palindrome number.")
    else
        println("No, it is NOT a Palindrome number.")

    println("\n--- Kotlin Optimized Approach ---")
    if (isPalindromeOptimized(number))
        println("✅ Palindrome (checked using string reversal).")
    else
        println("❌ Not a Palindrome (checked using string reversal).")
}
