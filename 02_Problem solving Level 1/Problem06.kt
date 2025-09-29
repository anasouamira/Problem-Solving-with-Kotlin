// 🔹 Question / Task:
// Read counts of Pennies, Nickels, Dimes, Quarters, and Dollars.
// Print total value in pennies and dollars.

import java.util.Scanner

// -----------------------------------------------------------
// Example 1 – Same methodology as original C++ style
// -----------------------------------------------------------

data class Money(
    var penny: Int,
    var nickel: Int,
    var dime: Int,
    var quarter: Int,
    var dollar: Int
)

fun readMoney(scanner: Scanner): Money {
    print("Enter number of Pennies: ")
    val penny = scanner.nextInt()

    print("Enter number of Nickels: ")
    val nickel = scanner.nextInt()

    print("Enter number of Dimes: ")
    val dime = scanner.nextInt()

    print("Enter number of Quarters: ")
    val quarter = scanner.nextInt()

    print("Enter number of Dollars: ")
    val dollar = scanner.nextInt()

    return Money(penny, nickel, dime, quarter, dollar)
}

fun totalPennies(m: Money): Int =
    m.penny + m.nickel * 5 + m.dime * 10 + m.quarter * 25 + m.dollar * 100

fun totalDollars(m: Money): Int = totalPennies(m) / 100

fun runExample1(scanner: Scanner) {
    val money = readMoney(scanner)
    println("Total in Pennies: ${totalPennies(money)}")
    println("Total in Dollars: ${totalDollars(money)}")
}

// -----------------------------------------------------------
// Example 2 – Kotlin-idiomatic concise version
// -----------------------------------------------------------
// Uses a map and loops instead of fixed fields.

fun runExample2() {
    println("\n=== Example 2: Kotlin-idiomatic ===")
    val coinValues = mapOf(
        "Pennies" to 1,
        "Nickels" to 5,
        "Dimes" to 10,
        "Quarters" to 25,
        "Dollars" to 100
    )

    var totalCents = 0
    for ((coin, value) in coinValues) {
        print("Enter number of $coin: ")
        val count = readLine()?.toIntOrNull() ?: 0
        totalCents += count * value
    }

    println("Total in Pennies: $totalCents")
    println("Total in Dollars: ${totalCents / 100}")
}

// -----------------------------------------------------------
// Main
// -----------------------------------------------------------

fun main() {
    val scanner = Scanner(System.`in`)
    println("=== Example 1: Classic style ===")
    runExample1(scanner)

    runExample2()
}
