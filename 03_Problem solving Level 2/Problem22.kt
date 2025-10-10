/*
Problem 22 |=============================================================================

Write a program to read N elements and store them in array then print all array elements
and ask for a number to check, then print how many number a certain element repeated in
that array.

Input:

5
1 1 1 2 3
Check number: 1

Output: 
Original array: 1 1 1 2 3
1 is repeated 3 time(s)
=========================================================================================
*/

import kotlin.math.min

// ===========================================================
// Example 1 — Classic C++ Style Translation
// ===========================================================
fun readPositiveNumberClassic(message: String): Int {
    var number: Int
    do {
        print(message)
        number = readLine()?.toIntOrNull() ?: -1
    } while (number <= 0)
    return number
}

fun readArrayClassic(size: Int, arr: IntArray) {
    println("\nEnter array elements:")
    for (i in 0 until size) {
        print("Element [${i + 1}]: ")
        arr[i] = readLine()?.toIntOrNull() ?: 0
    }
}

fun printArrayClassic(arr: IntArray, size: Int) {
    for (i in 0 until size) print(arr[i])
    println()
}

fun timesRepeatedClassic(number: Int, arr: IntArray, size: Int): Int {
    var count = 0
    for (i in 0 until size) {
        if (arr[i] == number) count++
    }
    return count
}

// ===========================================================
// Example 2 — Optimized Kotlin Version
// ===========================================================
fun readArrayOptimized(size: Int): List<Int> {
    val list = mutableListOf<Int>()
    println("\nEnter array elements (space-separated or one by one):")
    while (list.size < size) {
        val inputs = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: emptyList()
        val remaining = min(size - list.size, inputs.size)
        list.addAll(inputs.take(remaining))
    }
    return list
}

fun printArrayOptimized(list: List<Int>) {
    println(list.joinToString(" "))
}

fun timesRepeatedOptimized(number: Int, list: List<Int>) = list.count { it == number }

// ===========================================================
// Main Function
// ===========================================================
fun main() {
    // Classic approach
    val nClassic = readPositiveNumberClassic("Enter number of elements: ")
    val arrClassic = IntArray(nClassic)
    readArrayClassic(nClassic, arrClassic)
    val checkNumberClassic = readPositiveNumberClassic("Enter the number you want to check: ")
    print("\nOriginal array: ")
    printArrayClassic(arrClassic, nClassic)
    println("\nNumber $checkNumberClassic is repeated ${timesRepeatedClassic(checkNumberClassic, arrClassic, nClassic)} time(s)")

    // Optimized Kotlin approach
    val nOptimized = readPositiveNumberClassic("\nEnter number of elements for optimized version: ")
    val listOptimized = readArrayOptimized(nOptimized)
    print("Enter the number you want to check: ")
    val checkNumberOptimized = readLine()?.toIntOrNull() ?: 0
    print("Original array: ")
    printArrayOptimized(listOptimized)
    println("${checkNumberOptimized} is repeated ${timesRepeatedOptimized(checkNumberOptimized, listOptimized)} time(s)")
}
