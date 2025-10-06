// 🔹 Problem04: Print all perfect numbers from 1 to N
// Two approaches are shown here:
// - Example 1: Classic version (direct C++ translation, check divisors up to n/2)
// - Example 2: Optimized Kotlin version (check up to sqrt(n))

import kotlin.math.sqrt

// ===========================================================
// Example 1 — Classic style (C++ translation methodology)
// ===========================================================

/**
 * Enum to represent whether a number is Perfect or NotPerfect.
 */
enum class PerfectStatus { Perfect, NotPerfect }

/**
 * Reads a non-negative integer from the user.
 * Keeps retrying until user enters valid non-negative integer.
 */
fun readPositiveNumberClassic(message: String): Int {
    var number: Int
    do {
        print(message)
        number = readLine()?.toIntOrNull() ?: -1  // ✅ use -1 instead of Int.MIN_VALUE (simpler logic)
    } while (number < 0)
    return number
}

/**
 * Checks if a number is perfect by summing divisors up to n/2.
 */
fun checkPerfectClassic(number: Int): PerfectStatus {
    if (number <= 1) return PerfectStatus.NotPerfect
    val limit = number / 2
    var sum = 0
    for (d in 1..limit) {
        if (number % d == 0) sum += d
    }
    return if (sum == number) PerfectStatus.Perfect else PerfectStatus.NotPerfect
}

/**
 * Prints all perfect numbers from 1 to N using the classic method.
 */
fun printPerfectNumbersClassic(n: Int) {
    println("\nPerfect numbers from 1 to $n (classic):")
    for (i in 1..n) {
        if (checkPerfectClassic(i) == PerfectStatus.Perfect) {
            println(i)
        }
    }
}


// ===========================================================
// Example 2 — Optimized Kotlin version
// ===========================================================

/**
 * Optimized check for perfect number using sqrt.
 */
fun isPerfectOptimized(n: Int): Boolean {
    if (n <= 1) return false
    var sum = 1 // 1 is always a divisor for n > 1
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
 * Prints all perfect numbers from 1 to N using the optimized method.
 */
fun printPerfectNumbersOptimized(n: Int) {
    println("\nPerfect numbers from 1 to $n (optimized):")
    for (i in 2..n) {
        if (isPerfectOptimized(i)) {
            println(i)
        }
    }
}


// ===========================================================
// Main function
// ===========================================================
fun main() {
    // ✅ Using the classic input function instead of duplicating input logic
    val number = readPositiveNumberClassic("Enter a positive number to find all perfect numbers from 1 to N: ")

    // Example 1 — same as the C++ methodology
    printPerfectNumbersClassic(number)

    // Example 2 — optimized professional version
    printPerfectNumbersOptimized(number)
}
