// 🔹 Question / Task:
// Write a program that reads an integer number and another number representing the power.
// Then calculate and print the result of raising the first number to the given power using a loop.

import java.util.Scanner

// Data class to hold the base number and the power (equivalent to struct in C++)
data class Numbers(
    val number: Int, // The base number
    val m: Int       // The power
)

// Function to read the number and the power from the user
fun readNumbers(scanner: Scanner): Numbers {
    print("Enter a number: ")
    val number = scanner.nextInt()
    print("Enter the power: ")
    val m = scanner.nextInt()
    return Numbers(number, m) // Return the data class with both values
}

// Function to calculate and print the power
fun power(nub: Numbers) {
    var multi = 1 // Variable to store the result of the power
    // Multiply nub.number by itself nub.m times
    for (i in 1..nub.m) {
        multi *= nub.number
    }
    println("Power of ${nub.number}^${nub.m} is: $multi")
}

fun main() {
    val scanner = Scanner(System.`in`)
    // Read number and power, then calculate and print the result
    power(readNumbers(scanner))
}
