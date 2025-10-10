/*
Problem19 |===============================================

Write a program to print 3 random numbers from 1 to 10 

Output :
6
2
3

==========================================================
*/

import kotlin.random.Random

// ===========================================================
// Example 1 — Classic C++ Style Translation
// ===========================================================
fun randomNumberClassic(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1) // Simulate rand() % (to-from+1) + from
}

// ===========================================================
// Example 2 — Optimized Kotlin Version
// ===========================================================
fun randomNumbersOptimized(count: Int, from: Int, to: Int): List<Int> {
    return List(count) { Random.nextInt(from, to + 1) }
}

// ===========================================================
// Main Function
// ===========================================================
fun main() {
    println("--- Classic Approach ---")
    println(randomNumberClassic(1, 10))
    println(randomNumberClassic(1, 10))
    println(randomNumberClassic(1, 10))

    println("\n--- Optimized Kotlin Approach ---")
    val numbers = randomNumbersOptimized(3, 1, 10)
    numbers.forEach { println(it) }
}
