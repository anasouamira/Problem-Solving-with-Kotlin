/*
Problem09 |=============================================================

Write a program to read a number, then print all digit frequencies 
(1–9) appearing in that number.

Input:
1223222

Output:
Digit 1 Frequency is 1 Time(s).
Digit 2 Frequency is 5 Time(s).
Digit 3 Frequency is 1 Time(s).

=======================================================================
*/

// ===========================================================
// Example 1 — Classic C++-style methodology
// ===========================================================

/**
 * Reads a positive integer from the user.
 * Keeps asking until a valid (non-negative) number is entered.
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
 * Counts the frequency of a specific digit within a given number.
 * Uses the same mathematical method as the original C++ code (modulus and division).
 */
fun countDigitFrequencyClassic(digitToCheck: Int, numberInput: Int): Int {
    var number = numberInput
    var remainder: Int
    var frequency = 0

    while (number > 0) {
        remainder = number % 10 // Extract last digit
        number /= 10            // Remove last digit
        if (remainder == digitToCheck)
            frequency++
    }

    return frequency
}

/**
 * Prints the frequency of all digits (1–9) found in the given number.
 */
fun printDigitFrequenciesClassic(number: Int) {
    println("\nDigit frequency (classic approach):")
    for (digit in 1..9) {
        val count = countDigitFrequencyClassic(digit, number)
        if (count > 0) {
            println("Digit $digit Frequency is $count Time(s).")
        }
    }
}


// ===========================================================
// Example 2 — Optimized Kotlin version
// ===========================================================

/**
 * Reads a positive integer (same as before, but reused here).
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
 * Optimized version that uses string processing instead of math.
 * Converts the number to a string and uses count() for each digit.
 */
fun printDigitFrequenciesOptimized(number: Int) {
    val numberStr = number.toString()

    println("\nDigit frequency (optimized Kotlin approach):")
    for (digit in '0'..'9') {
        val count = numberStr.count { it == digit }
        if (count > 0) {
            println("Digit $digit Frequency is $count Time(s).")
        }
    }
}


// ===========================================================
// Main function — Runs both examples
// ===========================================================
fun main() {
    // Read the number once and use it in both methods
    val number = run {
        var n: Int?
        do {
            print("Please enter the main number: ")
            n = readLine()?.toIntOrNull()
        } while (n == null || n <= 0)
        n
    }

    // Example 1 — C++ style
    printDigitFrequenciesClassic(number)

    // Example 2 — Optimized Kotlin style
    printDigitFrequenciesOptimized(number)
}
