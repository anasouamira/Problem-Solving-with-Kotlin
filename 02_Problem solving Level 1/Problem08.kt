// 🔹 Question / Task:
// Write a program that repeatedly reads numbers from the user and calculates their sum.
// The user can stop entering numbers by entering -99.

import java.util.Scanner

// -----------------------------------------------------------
// Example 1 – Same methodology as the C++ code
// -----------------------------------------------------------

// Function to read a number with a custom message
fun readNumber(scanner: Scanner, message: String): Int {
    print(message)
    return scanner.nextInt()
}

// Function to calculate the sum of numbers entered by the user
fun calculateSum(scanner: Scanner): Int {
    var sum = 0
    var counter = 1
    var number: Int

    do {
        number = readNumber(scanner, "Enter Number $counter (Enter -99 to stop): ")
        if (number != -99) {
            sum += number
        }
        counter++
    } while (number != -99)

    return sum
}

fun runExample1(scanner: Scanner) {
    println("=== Example 1: Classic Style ===")
    println("Result = ${calculateSum(scanner)}")
}

// -----------------------------------------------------------
// Example 2 – Idiomatic Kotlin style
// -----------------------------------------------------------

fun runExample2() {
    println("\n=== Example 2: Kotlin-idiomatic ===")
    var sum = 0
    var counter = 1

    while (true) {
        print("Enter Number $counter (Enter -99 to stop): ")
        val input = readLine()?.toIntOrNull()

        if (input == null) {
            println("Invalid input, try again.")
            continue
        }

        if (input == -99) break
        sum += input
        counter++
    }

    println("Result = $sum")
}

// -----------------------------------------------------------
// Main
// -----------------------------------------------------------

fun main() {
    val scanner = Scanner(System.`in`)
    runExample1(scanner)  // C++ style
    runExample2()         // Kotlin-idiomatic style
}
