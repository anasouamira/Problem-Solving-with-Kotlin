// 🔹 Question / Task:
// Write a program that reads the number of coins a person has:
// Pennies, Nickels, Dimes, Quarters, and Dollars.
// Then calculate and print the total value in pennies and in dollars.

import java.util.Scanner

// Data class to store counts of each coin type (equivalent to struct in C++)
data class Money(
    var penny: Int,   // Number of pennies
    var nickel: Int,  // Number of nickels (5 cents each)
    var dime: Int,    // Number of dimes (10 cents each)
    var quarter: Int, // Number of quarters (25 cents each)
    var dollar: Int   // Number of dollars (100 cents each)
)

// Function to read the amount of each coin
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

// Function to calculate total value in pennies
fun totalPenny(m: Money): Int {
    return m.penny + (m.nickel * 5) + (m.dime * 10) + (m.quarter * 25) + (m.dollar * 100)
}

// Function to calculate total value in dollars
fun totalDollars(m: Money): Int {
    return totalPenny(m) / 100
}

fun main() {
    val scanner = Scanner(System.`in`)

    // Read coin amounts from user
    val money = readMoney(scanner)

    // Print total in pennies
    println("Total in Pennies: ${totalPenny(money)}")

    // Print total in dollars
    println("Total in Dollars: ${totalDollars(money)}")
}
