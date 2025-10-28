// 🔹 Problem: Check if a number is perfect
// Provide two versions in one file:
// - Example 1: Direct translation that preserves the original C++ methodology (enum, check up to n/2).
// - Example 2: Professional/optimized version using sqrt and an efficient proper-divisors summation.

import kotlin.math.sqrt

// ===========================================================
// Example 1 — Classic style (preserve C++ methodology)
// ===========================================================

/**
 * Enum to represent whether a divisor check returns Divisor or NotDivisor.
 * This mirrors the C++ enum enmDivisorNotDivisor.
 */
enum class DivisorStatus { Divisor, NotDivisor }

/**
 * Read a non-negative integer from the user.
 * Mirrors the original C++ loop that repeats while input < 0.
 */
fun readPositiveNumberClassic(message: String): Int {
    var number: Int
    do {
        print(message)
        number = readLine()?.toIntOrNull() ?: Int.MIN_VALUE
    } while (number < 0)
    return number
}

/**
 * Check whether 'divisor' divides 'number'.
 * Returns DivisorStatus.Divisor when number % divisor == 0.
 * This keeps the original separation of concerns (ChekDivisors).
 */
fun checkDivisors(number: Int, divisor: Int): DivisorStatus {
    return if (number % divisor == 0) DivisorStatus.Divisor else DivisorStatus.NotDivisor
}

/**
 * Check perfectness using the naive method: sum proper divisors from 1 to n/2.
 * Returns true when sum of proper divisors equals the number.
 * Mirrors original C++ logic exactly (loop to n/2).
 */
fun isPerfectClassic(number: Int): Boolean {
    if (number <= 1) return false // 0 and 1 are not considered perfect here (consistent with usual definition)
    val limit = number / 2
    var sum = 0
    for (d in 1..limit) {
        if (checkDivisors(number, d) == DivisorStatus.Divisor) {
            sum += d
        }
    }
    return sum == number
}

/**
 * Print result for the classic approach.
 */
fun printPerfectClassic(number: Int) {
    if (isPerfectClassic(number)) println("$number is Perfect.") else println("$number is not Perfect.")
}


// ===========================================================
// Example 2 — Optimized / Professional version
// ===========================================================

/**
 * Optimized check for perfect number using divisors up to sqrt(n)
 * and adding pairs (i and n/i) to the sum of proper divisors.
 *
 * This runs in O(sqrt(n)) time and is the standard efficient approach.
 */
fun isPerfectOptimized(n: Int): Boolean {
    if (n <= 1) return false

    var sum = 1 // 1 is a proper divisor for n > 1
    val limit = sqrt(n.toDouble()).toInt()

    for (i in 2..limit) {
        if (n % i == 0) {
            val other = n / i
            sum += i
            if (other != i) sum += other
        }
    }
    return sum == n
}

/**
 * Print result for the optimized approach.
 */
fun printPerfectOptimized(number: Int) {
    if (isPerfectOptimized(number)) println("$number is Perfect. (optimized)") 
    else println("$number is not Perfect. (optimized)")
}


// ===========================================================
// Main — read input once and run both examples
// ===========================================================
fun main() {
    // Read a non-negative integer from the user (allow 0 and positive numbers)
    val number = run {
        var n: Int?
        do {
            print("Enter a positive number to check if it is perfect or not: ")
            n = readLine()?.toIntOrNull()
        } while (n == null || n < 0)
        n
    }

    // Example 1 — same methodology as the C++ code
    printPerfectClassic(number)

    // Example 2 — optimized professional version
    printPerfectOptimized(number)
}
