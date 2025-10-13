// =============================================================
// Version 1 - Same structure as the original C++ code
// =============================================================

import java.util.Scanner

// Function to read a number from the user
fun readNumber(scanner: Scanner): Int {
    print("\nPlease enter a number? ")
    return scanner.nextInt()
}

// Function to add an element to the array
fun addArrayElement(number: Int, arr: IntArray, arrLength: Int): Int {
    arr[arrLength] = number
    return arrLength + 1
}

// Function to input numbers from the user
fun inputUserNumbersInArray(scanner: Scanner, arr: IntArray): Int {
    var arrLength = 0
    var addMore = true

    while (addMore) {
        arrLength = addArrayElement(readNumber(scanner), arr, arrLength)
        print("\nDo you want to add more numbers? [0]:No, [1]:Yes? ")
        addMore = scanner.nextInt() == 1
    }

    return arrLength
}

// Function to print the array
fun printArray(arr: IntArray, arrLength: Int) {
    for (i in 0 until arrLength) {
        print("${arr[i]} ")
    }
    println()
}

fun main() {
    val scanner = Scanner(System.`in`)
    val arr = IntArray(100)
    var arrLength = 0

    arrLength = inputUserNumbersInArray(scanner, arr)

    println("\nArray Length: $arrLength")
    print("Array elements: ")
    printArray(arr, arrLength)
}

// =============================================================
// Version 2 - Professional Kotlin style using MutableList
// =============================================================

fun mainV2() {
    val numbers = mutableListOf<Int>()

    while (true) {
        print("\nPlease enter a number? ")
        val number = readln().toInt()
        numbers.add(number)

        print("\nDo you want to add more numbers? [0]:No, [1]:Yes? ")
        val addMore = readln().toInt()
        if (addMore == 0) break
    }

    println("\nArray Length: ${numbers.size}")
    print("Array elements: ")
    println(numbers.joinToString(" "))
}
