// ==========================================================
// Example 1 : Same procedural style as the C++ version
// ==========================================================

import kotlin.random.Random

// Function to generate a random number between From and To (inclusive)
fun randomNumber(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1)
}

// Function to fill the array with random numbers
fun fillArrayWithRandomNumbers(arr: IntArray, arrLength: Int): IntArray {
    for (i in 0 until arrLength) {
        arr[i] = randomNumber(-100, 100)
    }
    return arr
}

// Function to print the elements of the array
fun printArray(arr: IntArray, arrLength: Int) {
    for (i in 0 until arrLength) {
        print("${arr[i]} ")
    }
    println()
}

// Function to count the number of positive numbers (including zero)
fun positiveCount(arr: IntArray, arrLength: Int): Int {
    var counter = 0
    for (i in 0 until arrLength) {
        if (arr[i] >= 0) counter++
    }
    return counter
}

fun main() {
    println("Enter number of elements:")
    val arrLength = readLine()!!.toInt()
    val arr = IntArray(100)

    fillArrayWithRandomNumbers(arr, arrLength)

    println("\nArray Elements:")
    printArray(arr, arrLength)

    println("\nPositive Numbers count is: ${positiveCount(arr, arrLength)}")

    // ==========================================================
    // Example 2 : Professional Kotlin version (modern & clean)
    // ==========================================================
    println("\n================ Kotlin Professional Version ================\n")

    print("Enter number of elements: ")
    val size = readLine()!!.toInt()

    // Create and fill list with random numbers in the range -100..100
    val numbers = List(size) { Random.nextInt(-100, 101) }

    // Print the list elements
    println("Array Elements: ${numbers.joinToString(" ")}")

    // Count positive numbers using filter and count
    val positiveCount = numbers.count { it >= 0 }

    println("Positive Numbers count is: $positiveCount")
}
