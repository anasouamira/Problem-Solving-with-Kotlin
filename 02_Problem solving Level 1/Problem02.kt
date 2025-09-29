// 🔹 Question / Task:
// Write a program that reads three floating-point numbers from the user
// and prints the maximum of the three numbers.

import java.util.Scanner

// -----------------------------------------------------------
// Example 1 – Same methodology as the original C++ solution
// -----------------------------------------------------------

// Function to read three numbers from user input
fun readNumbers(scanner: Scanner): Triple<Float, Float, Float> {
    // Returning a Triple instead of using reference parameters
    print("Enter Nub1 = ")
    val nub1 = scanner.nextFloat()
    print("Enter Nub2 = ")
    val nub2 = scanner.nextFloat()
    print("Enter Nub3 = ")
    val nub3 = scanner.nextFloat()
    return Triple(nub1, nub2, nub3)
}

// Function to find the maximum of three numbers
fun checkMaxOfNumbers(nub1: Float, nub2: Float, nub3: Float): Float {
    // Same nested comparison logic as the original C++ code
    return if (nub1 > nub2) {
        if (nub1 > nub3) nub1 else nub3
    } else {
        if (nub2 > nub3) nub2 else nub3
    }
}

// Function to print the maximum number
fun printNumbers(max: Float) {
    println("Max of Numbers is: $max")
}

fun runExample1(scanner: Scanner) {
    val (nub1, nub2, nub3) = readNumbers(scanner)
    printNumbers(checkMaxOfNumbers(nub1, nub2, nub3))
}

// -----------------------------------------------------------
// Example 2 – More Kotlin-idiomatic solution
// -----------------------------------------------------------
// Uses readLine() and built-in maxOf to simplify logic.

fun runExample2() {
    println("\n=== Example 2: Kotlin-idiomatic ===")
    print("Enter three floating-point numbers separated by space: ")
    val inputs = readLine()
        ?.trim()
        ?.split("\\s+".toRegex())
        ?.mapNotNull { it.toFloatOrNull() }

    if (inputs == null || inputs.size < 3) {
        println("Invalid input. Please enter three valid numbers.")
        return
    }

    val maxValue = maxOf(inputs[0], inputs[1], inputs[2])
    println("Max of Numbers is: $maxValue")
}

// -----------------------------------------------------------
// Main
// -----------------------------------------------------------

fun main() {
    val scanner = Scanner(System.`in`)
    println("=== Example 1: Classic style ===")
    runExample1(scanner)

    // Show a cleaner Kotlin style as well
    runExample2()
}
