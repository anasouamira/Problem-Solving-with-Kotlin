/*
Problem 23 |==================================================
Write a program to fill array with max size 100 with random
numbers from 1 to 100.

Input:
10 

Output:
Array Elements: 56 55 83 71 32 52 17 28 71 52
==============================================================
*/

import kotlin.random.Random
import kotlin.math.min

// ===========================================================
// Example 1 — Classic C++ Style Translation
// ===========================================================
fun randomNumberClassic(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1) // Generate random number between 'from' and 'to'
}

fun fillArrayClassic(arr: IntArray, arrLength: Int) {
    for (i in 0 until arrLength) {
        arr[i] = randomNumberClassic(1, 100)
    }
}

fun printArrayClassic(arr: IntArray, arrLength: Int) {
    for (i in 0 until arrLength) print("${arr[i]} ")
    println()
}

// ===========================================================
// Example 2 — Optimized Kotlin Version
// ===========================================================
fun fillArrayOptimized(size: Int): List<Int> {
    return List(size) { Random.nextInt(1, 101) } // Generate a list of random numbers from 1 to 100
}

fun printArrayOptimized(list: List<Int>) {
    println(list.joinToString(" "))
}

// ===========================================================
// Main Function
// ===========================================================
fun main() {
    // Classic approach
    print("Enter number of elements (Classic Version): ")
    val nClassic = readLine()?.toIntOrNull()?.coerceAtMost(100) ?: 0
    val arrClassic = IntArray(nClassic)
    fillArrayClassic(arrClassic, nClassic)
    println("\nArray Elements (Classic):")
    printArrayClassic(arrClassic, nClassic)

    // Optimized Kotlin approach
    print("\nEnter number of elements (Optimized Version): ")
    val nOptimized = readLine()?.toIntOrNull()?.coerceAtMost(100) ?: 0
    val listOptimized = fillArrayOptimized(nOptimized)
    println("\nArray Elements (Optimized):")
    printArrayOptimized(listOptimized)
}
