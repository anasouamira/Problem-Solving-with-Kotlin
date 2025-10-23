/*
Problem 42 |=================================================
Write a program to fill array with max size 100 with random
numbers from 1 to 100, then print the count of Odd numbers.

Input:
10

Output:
Array Elements: 60 78 15 49 56 6 4 3 21 23
Odd Numbers count is: 5
=============================================================
*/

/* ========================= Version 1 (Educational) ========================= */

import kotlin.random.Random

// Function to generate a random number between two limits
fun randomNumber(from: Int, to: Int): Int {
    // Returns a random integer between [from, to]
    return Random.nextInt(from, to + 1)
}

// Function to fill an array with random numbers
fun fillArrayWithRandomNumbers(size: Int): IntArray {
    val arr = IntArray(size)
    for (i in arr.indices) {
        arr[i] = randomNumber(1, 100)
    }
    return arr
}

// Function to print array elements
fun printArray(arr: IntArray) {
    for (num in arr) {
        print("$num ")
    }
    println()
}

// Function to count odd numbers in array
fun oddCount(arr: IntArray): Int {
    var counter = 0
    for (num in arr) {
        if (num % 2 != 0) // Check if number is odd
            counter++
    }
    return counter
}

// Main function
fun main() {
    print("Enter number of elements: ")
    val arrLength = readLine()!!.toInt()

    val arr = fillArrayWithRandomNumbers(arrLength)

    println("\nArray Elements:")
    printArray(arr)

    println("\nOdd Numbers count is: ${oddCount(arr)}")

    /* ========================= Version 2 (Professional) ========================= */

    println("\n--- Optimized Professional Version ---")

    print("Enter number of elements: ")
    val n = readLine()!!.toInt()

    val arr2 = IntArray(n) { Random.nextInt(1, 101) }

    println("\nArray Elements:")
    println(arr2.joinToString(" "))

    val oddCount = arr2.count { it % 2 != 0 }
    println("\nOdd Numbers count is: $oddCount")
}
