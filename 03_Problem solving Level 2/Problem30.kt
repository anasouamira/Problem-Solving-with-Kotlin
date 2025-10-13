/*
Problem 28 |=================================================
Write a program to fill array with max size 100 with random
numbers from 1 to 100, copy it to another array and print it.

Input
10

Output:

Array 1 elements: 1 47 51 18 85 62 51 61 82 4

Array 2 elements after copy: 1 47 51 18 85 62 51 61 82 4
=============================================================
*/

import kotlin.random.Random

// ===========================================================
// Classic Approach (Fixed Array)
// ===========================================================
fun randomNumberClassic(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1)
}

fun fillArrayClassic(arr: IntArray, arrLength: Int) {
    for (i in 0 until arrLength) arr[i] = randomNumberClassic(1, 100)
}

fun printArrayClassic(arr: IntArray, arrLength: Int) {
    for (i in 0 until arrLength) print("${arr[i]} ")
    println()
}

fun copyArrayClassic(source: IntArray, destination: IntArray, arrLength: Int) {
    for (i in 0 until arrLength) destination[i] = source[i]
}

// ===========================================================
// Kotlin Idiomatic Approach (List)
// ===========================================================
fun fillList(size: Int): List<Int> {
    return List(size) { Random.nextInt(1, 101) }
}

fun printList(list: List<Int>) {
    println(list.joinToString(" "))
}

// ===========================================================
// Main Function
// ===========================================================
fun main() {
    // Classic Approach
    print("Enter number of elements (Classic Version): ")
    val nClassic = readLine()?.toIntOrNull()?.coerceAtMost(100) ?: 0
    val arrClassic = IntArray(nClassic)
    fillArrayClassic(arrClassic, nClassic)
    val arr2Classic = IntArray(nClassic)
    copyArrayClassic(arrClassic, arr2Classic, nClassic)

    println("\nArray 1 elements:")
    printArrayClassic(arrClassic, nClassic)
    println("Array 2 elements after copy:")
    printArrayClassic(arr2Classic, nClassic)

    // Kotlin Idiomatic Approach
    print("\nEnter number of elements (Optimized Version): ")
    val nOptimized = readLine()?.toIntOrNull()?.coerceAtMost(100) ?: 0
    val list1 = fillList(nOptimized)
    val list2 = list1.toList() // Copy by creating a new list

    println("\nArray 1 elements:")
    printList(list1)
    println("Array 2 elements after copy:")
    printList(list2)
}
