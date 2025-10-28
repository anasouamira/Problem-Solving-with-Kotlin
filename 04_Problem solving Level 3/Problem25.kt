/*
Problem 25 |=================================================
Write a program to fill array with max size 100 with random
numbers from 1 to 100, then print Minimum Number 

Input:
10 

Output:
Array Elements: 30 99 72 47 95 67 29 13 80 64 
Min Number is: 13 
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

fun minNumberClassic(arr: IntArray, arrLength: Int): Int {
    var min = arr[0]
    for (i in 1 until arrLength) {
        if (arr[i] < min) min = arr[i]
    }
    return min
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
    println("Min Number is : ${minNumberClassic(arrClassic, nClassic)}")

    // Optimized Kotlin approach
    print("\nEnter number of elements (Optimized Version): ")
    val nOptimized = readLine()?.toIntOrNull()?.coerceAtMost(100) ?: 0
    val listOptimized = fillArrayOptimized(nOptimized)
    println("\nArray Elements (Optimized):")
    printArrayOptimized(listOptimized)
    println("Min Number is : ${listOptimized.minOrNull()}")
}
