/*
Problem 27 |=================================================
Write a program to fill array with max size 100 with random
numbers from 1 to 100, then print average of all numbers

Input:
10

Output:

Array Elements: 24 36 44 73 8 56 98 67 33 71

Average of all numbers is : 51
=============================================================
*/

import kotlin.random.Random

// ===========================================================
// Example 1 — Classic C++ Style Translation
// ===========================================================
fun randomNumberClassic(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1)
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

fun arrayAverageClassic(arr: IntArray, arrLength: Int): Float {
    var sum = 0
    for (i in 0 until arrLength) sum += arr[i]
    return sum.toFloat() / arrLength
}

// ===========================================================
// Example 2 — Optimized Kotlin Version
// ===========================================================
fun fillArrayOptimized(size: Int): List<Int> {
    return List(size) { Random.nextInt(1, 101) }
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
    println("Average of all numbers: ${arrayAverageClassic(arrClassic, nClassic)}")

    // Optimized Kotlin approach
    print("\nEnter number of elements (Optimized Version): ")
    val nOptimized = readLine()?.toIntOrNull()?.coerceAtMost(100) ?: 0
    val listOptimized = fillArrayOptimized(nOptimized)
    println("\nArray Elements (Optimized):")
    printArrayOptimized(listOptimized)
    println("Average of all numbers: ${listOptimized.average()}")
}
