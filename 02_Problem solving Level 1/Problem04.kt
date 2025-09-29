// 🔹 Question / Task:
// Write a program that reads an integer number and another number representing the power.
// Then calculate and print the result of raising the first number to the given power using a loop.

import java.util.Scanner

// -----------------------------------------------------------
// Example 1 – Same methodology as the original C++ solution
// -----------------------------------------------------------

// Data class to hold the base number and the power
data class Numbers(
    val number: Int,
    val m: Int
)

// Function to read the number and the power from the user
fun readNumbers(scanner: Scanner): Numbers {
    print("Enter a number: ")
    val number = scanner.nextInt()
    print("Enter the power: ")
    val m = scanner.nextInt()
    return Numbers(number, m)
}

// Function to calculate and print the power using a loop
fun power(nub: Numbers) {
    var multi = 1
    for (i in 1..nub.m) {
        multi *= nub.number
    }
    println("Power of ${nub.number}^${nub.m} is: $multi")
}

fun runExample1(scanner: Scanner) {
    power(readNumbers(scanner))
}

// -----------------------------------------------------------
// Example 2 – More Kotlin-idiomatic solution
// -----------------------------------------------------------
// Uses readLine(), safe parsing, and Math.pow for simplicity.

fun runExample2() {
    println("\n=== Example 2: Kotlin-idiomatic ===")
    print("Enter base number: ")
    val base = readLine()?.toIntOrNull()
    print("Enter power: ")
    val exponent = readLine()?.toIntOrNull()

    if (base == null || exponent == null) {
        println("Invalid input.")
        return
    }

    // Math.pow returns Double; convert to Long/Int if needed
    val result = Math.pow(base.toDouble(), exponent.toDouble()).toLong()
    println("Power of $base^$exponent is: $result")
}

// -----------------------------------------------------------
// Main
// -----------------------------------------------------------

fun main() {
    val scanner = Scanner(System.`in`)
    println("=== Example 1: Classic style ===")
    runExample1(scanner)

    // Show the more idiomatic version
    runExample2()
}
