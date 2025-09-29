// 🔹 Question / Task:
// Write a program that reads an integer number from the user
// and prints its square (power 2), cube (power 3), and fourth power (power 4).

import java.util.Scanner

// -----------------------------------------------------------
// Example 1 – Same methodology as the original C++ solution
// -----------------------------------------------------------

// Function to read a number from the user
fun readNumber(scanner: Scanner): Int {
    print("Enter a number: ")
    return scanner.nextInt()
}

// Function to calculate the power of a number
fun powerOf2_3_4(nub: Int, powerNub: Int): Int {
    var powr = 1
    for (i in 1..powerNub) {
        powr *= nub
    }
    return powr
}

// Function to print powers 2, 3, and 4 of a given number
fun printPowerOf2_3_4(nub: Int) {
    for (i in 2..4) {
        println("Number^$i = ${powerOf2_3_4(nub, i)}")
    }
}

fun runExample1(scanner: Scanner) {
    printPowerOf2_3_4(readNumber(scanner))
}

// -----------------------------------------------------------
// Example 2 – More Kotlin-idiomatic solution
// -----------------------------------------------------------
// Uses readLine(), safe parsing, and built-in Math.pow for clarity.

fun runExample2() {
    println("\n=== Example 2: Kotlin-idiomatic ===")
    print("Enter an integer number: ")
    val num = readLine()?.toIntOrNull()
    if (num == null) {
        println("Invalid input.")
        return
    }
    for (p in 2..4) {
        // Math.pow returns Double, so convert back to Int if desired
        val result = Math.pow(num.toDouble(), p.toDouble()).toInt()
        println("Number^$p = $result")
    }
}

// -----------------------------------------------------------
// Main
// -----------------------------------------------------------

fun main() {
    val scanner = Scanner(System.`in`)
    println("=== Example 1: Classic style ===")
    runExample1(scanner)

    // Then show the more idiomatic version
    runExample2()
}
