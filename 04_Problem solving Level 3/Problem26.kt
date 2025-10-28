/*
Problem 26 |=================================================
Write a program to fill array with max size 100 with random
numbers from 1 to 100, then print sum of all numbers

Input:
10

Output:

Array Elements: 10 6 22 40 12 75 23 32 25 75
Sum of all numbers:320
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

fun sumArrayClassic(arr: IntArray, arrLength: Int): Int {
    var sum = 0
    for (i in 0 until arrLength) {
        sum += arr[i]
    }
    return sum
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
    println("Sum of all numbers: ${sumArrayClassic(arrClassic, nClassic)}")

    // Optimized Kotlin approach
    print("\nEnter number of elements (Optimized Version): ")
    val nOptimized = readLine()?.toIntOrNull()?.coerceAtMost(100) ?: 0
    val listOptimized = fillArrayOptimized(nOptimized)
    println("\nArray Elements (Optimized):")
    printArrayOptimized(listOptimized)
    println("Sum of all numbers: ${listOptimized.sum()}")
}
