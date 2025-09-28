// 🔹 Question / Task:
// Write a program that reads three floating-point numbers from the user
// and prints the maximum of the three numbers.

import java.util.Scanner

// Function to read three numbers from user input
fun readNumbers(scanner: Scanner): Triple<Float, Float, Float> {
    // Returning a Triple instead of using reference parameters (Kotlin is pass-by-value for primitives)
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

fun main() {
    val scanner = Scanner(System.`in`)

    // Read three numbers from user
    val (nub1, nub2, nub3) = readNumbers(scanner)

    // Calculate maximum and print it
    printNumbers(checkMaxOfNumbers(nub1, nub2, nub3))
}
