// 🔹 Question / Task:
// Write a program that reads an integer number from the user
// and prints its square (power 2), cube (power 3), and fourth power (power 4).

import java.util.Scanner

// Function to read a number from the user
fun readNumber(scanner: Scanner): Int {
    print("Enter a number: ")
    // Read input from user and return it
    return scanner.nextInt()
}

// Function to calculate the power of a number
fun powerOf2_3_4(nub: Int, powerNub: Int): Int {
    var powr = 1
    // Multiply nub by itself powerNub times
    for (i in 1..powerNub) {
        powr *= nub
    }
    return powr // Return the calculated power
}

// Function to print powers 2, 3, and 4 of a given number
fun printPowerOf2_3_4(nub: Int) {
    // Loop through powers 2, 3, and 4
    for (i in 2..4) {
        println("Number^$i = ${powerOf2_3_4(nub, i)}")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    // Read number from user and print its powers
    printPowerOf2_3_4(readNumber(scanner))
}
