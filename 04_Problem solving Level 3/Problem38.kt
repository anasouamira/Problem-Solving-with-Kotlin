// =============================================================
// Version 1 – Same structure as the original C++ code
// =============================================================

import java.util.Scanner
import kotlin.random.Random

// Function to generate a random number in the given range
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

// Function to add an element to the array and increase its length
fun addArrayElement(number: Int, arr: IntArray, arrLength: Int): Int {
    arr[arrLength] = number
    return arrLength + 1
}

// Function to copy only odd numbers from one array to another
fun copyOddNumbers(
    arrSource: IntArray,
    arrDestination: IntArray,
    arrLength: Int
): Int {
    var arrDestinationLength = 0
    for (i in 0 until arrLength) {
        if (arrSource[i] % 2 != 0) {
            arrDestinationLength = addArrayElement(arrSource[i], arrDestination, arrDestinationLength)
        }
    }
    return arrDestinationLength
}

fun main() {
    val scanner = Scanner(System.`in`)
    val arr = IntArray(100)
    val arr2 = IntArray(100)

    val arrLength = fillArrayWithRandomNumbers(scanner, arr)
    val arr2Length = copyOddNumbers(arr, arr2, arrLength)

    println("\nArray 1 elements:")
    printArray(arr, arrLength)

    println("\nArray 2 Odd numbers:")
    printArray(arr2, arr2Length)
}

// =============================================================
// Version 2 – Professional Kotlin Style
// =============================================================

fun mainV2() {
    print("\nEnter number of elements:\n")
    val length = readln().toInt()

    // Generate random list
    val list1 = List(length) { Random.nextInt(1, 101) }

    // Filter only odd numbers
    val oddList = list1.filter { it % 2 != 0 }

    println("\nArray 1 elements:")
    println(list1.joinToString(" "))

    println("\nArray 2 Odd numbers:")
    println(oddList.joinToString(" "))
}
