// ===============================================================
// Problem 31 - Shuffle Array
// ===============================================================
//
// Write a program to fill an array with ordered numbers from 1 to N,
// then print it, shuffle the array randomly, and print it again.
//
// Example:
// Input: 10
//
// Output:
// Array elements before shuffle:
// 1 2 3 4 5 6 7 8 9 10
//
// Array elements after shuffle:
// 2 4 6 3 10 1 7 8 5 9
// ===============================================================

import kotlin.random.Random

// =============================
// VERSION 1 – Step-by-Step (C++ style)
// =============================

// Function to read a positive number from the user
fun readPositiveNumber(message: String): Int {
    var number: Int
    do {
        print("$message ")
        number = readln().toInt()
    } while (number <= 0)
    return number
}

// Function to swap two elements inside an array
fun swap(arr: IntArray, i: Int, j: Int) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

// Function to fill an array with ordered numbers from 1 to N
fun fillArrayWith1ToN(arrLength: Int): IntArray {
    val arr = IntArray(arrLength)
    for (i in 0 until arrLength) {
        arr[i] = i + 1 // Fill array with numbers 1, 2, 3, ..., N
    }
    return arr
}

// Function to generate a random number within a given range
fun randomNumber(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1)
}

// Function to shuffle array elements randomly
fun shuffleArray(arr: IntArray) {
    val arrLength = arr.size
    for (i in 0 until arrLength) {
        // Generate two random indices between 0 and arrLength-1
        val firstIndex = randomNumber(0, arrLength - 1)
        val secondIndex = randomNumber(0, arrLength - 1)
        swap(arr, firstIndex, secondIndex) // Swap elements
    }
}

// Function to print array elements
fun printArray(arr: IntArray) {
    for (num in arr) {
        print("$num ")
    }
    println()
}

// =============================
// VERSION 2 – Kotlin Simplified Version
// =============================
//
// Uses built-in Kotlin features like MutableList and shuffle()
// to simplify the whole program.

fun kotlinSimplifiedVersion() {
    print("Enter number of elements: ")
    val n = readln().toInt()

    // Generate a list from 1 to n
    val list = (1..n).toMutableList()

    println("\nArray elements before shuffle:")
    println(list.joinToString(" "))

    // Kotlin has a built-in shuffle() function for lists
    list.shuffle()

    println("\nArray elements after shuffle:")
    println(list.joinToString(" "))
}

// =============================
// MAIN PROGRAM
// =============================

fun main() {
    println("==============================")
    println("Version 1 – Step-by-Step (C++ style)")
    println("==============================")

    val arrLength = readPositiveNumber("\nEnter number of elements:")
    val arr = fillArrayWith1ToN(arrLength)

    println("\nArray elements before shuffle:")
    printArray(arr)

    shuffleArray(arr)

    println("\nArray elements after shuffle:")
    printArray(arr)

    println("\n\n==============================")
    println("Version 2 – Kotlin Simplified Version")
    println("==============================")

    kotlinSimplifiedVersion()
}
