/*
Problem08 |============================================================

Write a program to read a number and a digit,
then print the frequency of that digit inside the number.

Input:
1223222
2

Output:
Digit 2 Frequency is 5 Time(s).

======================================================================
*/

import kotlin.math.*

// ===========================================================
// Example 1 — Classic style (Direct C++ translation)
// ===========================================================

/**
 * Data class equivalent to C++ struct.
 * It holds both the number and the digit to search for.
 */
data class NumberDigit(val number: Int, val digit: Int)

/**
 * Reads a positive number and a single digit (0–9) from the user.
 * Keeps asking until valid inputs are entered.
 */
fun readNumberAndDigitClassic(): NumberDigit {
    var number: Int
    var digit: Int

    do {
        print("Enter a positive number: ")
        number = readLine()?.toIntOrNull() ?: -1

        print("Enter a single digit (0–9): ")
        digit = readLine()?.toIntOrNull() ?: -1
    } while (number < 0 || digit < 0 || digit > 9)

    return NumberDigit(number, digit)
}

/**
 * Counts how many times a given digit appears inside a given number.
 * Uses modulo (%) and integer division (/) like in the C++ version.
 */
fun digitFrequencyClassic(data: NumberDigit): Int {
    var temp = data.number
    var remainder: Int
    var count = 0

    do {
        remainder = temp % 10         // Extract last digit
        temp /= 10                    // Remove last digit
        if (remainder == data.digit)
            count++                   // Increment count if matched
    } while (temp > 0)

    return count
}

/**
 * Prints result for the classic method.
 */
fun printDigitFrequencyClassic() {
    val data = readNumberAndDigitClassic()
    val frequency = digitFrequencyClassic(data)
    println("Digit ${data.digit} Frequency is $frequency Time(s).")
}


// ===========================================================
// Example 2 — Optimized professional Kotlin version
// ===========================================================

/**
 * Reads a positive integer with a message prompt.
 * Keeps asking until the input is valid.
 */
fun readPositiveInt(message: String): Int {
    var value: Int?
    do {
        print(message)
        value = readLine()?.toIntOrNull()
    } while (value == null || value < 0)
    return value
}

/**
 * Optimized function to count digit frequency using string processing.
 * Converts the number to a string and counts occurrences of the digit.
 */
fun digitFrequencyOptimized(number: Int, digit: Int): Int {
    val digitChar = digit.toString().single()           // Convert digit to Char
    return number.toString().count { it == digitChar }  // Count matching characters
}

/**
 * Prints result for the optimized method.
 */
fun printDigitFrequencyOptimized() {
    val number = readPositiveInt("Enter a positive number: ")
    val digit = readPositiveInt("Enter a single digit (0–9): ").coerceIn(0, 9)

    val frequency = digitFrequencyOptimized(number, digit)

    println("Digit $digit Frequency is $frequency Time(s).")
}


// ===========================================================
// Main function — Runs both examples sequentially
// ===========================================================
fun main() {
    println("===== Example 1: Classic C++ Methodology =====")
    printDigitFrequencyClassic()

    println("\n===== Example 2: Optimized Kotlin Version =====")
    printDigitFrequencyOptimized()
}
