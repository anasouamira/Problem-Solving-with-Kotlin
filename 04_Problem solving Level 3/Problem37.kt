// =============================================================
// Version 1 – Same structure as the original C++ code
// =============================================================

import java.util.Scanner
import kotlin.random.Random

// Function to generate a random number between a range
fun randomNumber(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1)
}

// Function to fill an array with random numbers
fun fillArrayWithRandomNumbers(scanner: Scanner, arr: IntArray): Int {
    print("\nEnter number of elements:\n")
    val arrLength = scanner.nextInt()
    for (i in 0 until arrLength) {
        arr[i] = randomNumber(1, 100)
    }
    return arrLength
}

// Function to print elements of an array
fun printArray(arr: IntArray, arrLength: Int) {
    for (i in 0 until arrLength) {
        print("${arr[i]} ")
    }
    println()
}

// Function to add an element to the array
fun addArrayElement(number: Int, arr: IntArray, arrLength: Int): Int {
    arr[arrLength] = number
    return arrLength + 1
}

// Function to copy array using addArrayElement
fun copyArrayUsingAddArrayElement(
    arrSource: IntArray,
    arrDestination: IntArray,
    arrLength: Int
): Int {
    var arrDestinationLength = 0
    for (i in 0 until arrLength) {
        arrDestinationLength = addArrayElement(arrSource[i], arrDestination, arrDestinationLength)
    }
    return arrDestinationLength
}

fun main() {
    val scanner = Scanner(System.`in`)
    val arr = IntArray(100)
    val arr2 = IntArray(100)

    val arrLength = fillArrayWithRandomNumbers(scanner, arr)
    val arr2Length = copyArrayUsingAddArrayElement(arr, arr2, arrLength)

    println("\nArray 1 elements:")
    printArray(arr, arrLength)

    println("\nArray 2 elements after copy:")
    printArray(arr2, arr2Length)
}

// =============================================================
// Version 2 – Professional Kotlin Style
// =============================================================

fun mainV2() {
    print("\nEnter number of elements:\n")
    val length = readln().toInt()

    // Fill list with random numbers from 1 to 100
    val list1 = List(length) { Random.nextInt(1, 101) }

    // Copy list1 into a new list (similar to using AddArrayElement)
    val list2 = mutableListOf<Int>()
    list1.forEach { list2.add(it) }

    println("\nArray 1 elements:")
    println(list1.joinToString(" "))

    println("\nArray 2 elements after copy:")
    println(list2.joinToString(" "))
}
