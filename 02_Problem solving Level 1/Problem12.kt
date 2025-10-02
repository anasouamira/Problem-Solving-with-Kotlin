// 🔹 Question / Task:
// Simple ATM simulation:
// 1. Prompt the user to enter their ATM PIN.
// 2. Allow a maximum of 3 attempts.
// 3. If correct PIN is entered, display the balance.
// 4. If PIN is incorrect after 3 attempts, lock the card.

import java.util.Scanner

// -----------------------------------------------------------
// Example 1 – Classic style (mirrors C++ structure)
// -----------------------------------------------------------

const val ATM_PIN = 1234
const val BALANCE = 7500
const val CARD_IS_LOCKED = 0

// Function to read a non-negative ATM PIN
fun readATMPin(scanner: Scanner, message: String): Int {
    var pin: Int
    do {
        print(message)
        pin = scanner.nextInt()
        if (pin < 0) println("Invalid input! PIN cannot be negative.")
    } while (pin < 0)
    return pin
}

// Function to check the ATM PIN with up to 3 attempts
fun checkATMPin(scanner: Scanner, initialPin: Int): Int {
    var pin = initialPin
    var attempts = 1
    while (pin != ATM_PIN && attempts < 3) {
        pin = readATMPin(scanner, "Error! Enter ATM PIN again: ")
        attempts++
    }
    return if (pin == ATM_PIN) BALANCE else CARD_IS_LOCKED
}

// Function to get balance or card lock message
fun getBalanceMessage(scanner: Scanner, initialPin: Int): String {
    val result = checkATMPin(scanner, initialPin)
    return if (result == CARD_IS_LOCKED) "Card is locked!" else "Your balance is: $result"
}

fun runExample1(scanner: Scanner) {
    println("=== Example 1: Classic style ===")
    val initialPin = readATMPin(scanner, "Enter ATM PIN: ")
    println(getBalanceMessage(scanner, initialPin))
}

// -----------------------------------------------------------
// Example 2 – Kotlin-idiomatic concise version
// -----------------------------------------------------------

fun runExample2() {
    println("\n=== Example 2: Kotlin-idiomatic ===")
    val correctPin = 1234
    val balance = 7500

    var attempts = 0
    var pin: Int?
    while (attempts < 3) {
        print("Enter ATM PIN: ")
        pin = readLine()?.toIntOrNull()
        if (pin == null || pin < 0) {
            println("Invalid input! PIN cannot be negative.")
            continue
        }
        if (pin == correctPin) {
            println("Your balance is: $balance")
            return
        } else {
            println("Error! Incorrect PIN.")
            attempts++
        }
    }
    println("Card is locked!")
}

// -----------------------------------------------------------
// Main
// -----------------------------------------------------------

fun main() {
    val scanner = Scanner(System.`in`)
    runExample1(scanner)
    runExample2()
}
