/*
Problem 40 |=================================================
Write a program to fill an array with numbers, 
then print distinct numbers to another array.

Output:

Array 1 elements:
10 10 10 50 50 70 70 70 70 90

Array 2 distinct elements:
10 50 70 90
=============================================================
*/

/* =============================== Version 1 (Educational) =============================== */

// Function to fill the array with predefined numbers
fun fillArray(): IntArray {
    // Fixed 10 elements as given in the problem
    return intArrayOf(10, 10, 10, 50, 50, 70, 70, 70, 70, 90)
}

// Function to print array elements
fun printArray(arr: IntArray) {
    for (num in arr) {
        print("$num ")
    }
    println()
}

// Function to check if a number exists in an array
fun isNumberInArray(number: Int, arr: IntArray): Boolean {
    // Returns true if the number is found
    for (n in arr) {
        if (n == number)
            return true
    }
    return false
}

// Function to add a number to a mutable list (acts as dynamic array)
fun addArrayElement(number: Int, list: MutableList<Int>) {
    list.add(number) // Add the number at the end of the list
}

// Function to copy only distinct numbers to a new array
fun copyDistinctNumbers(source: IntArray): IntArray {
    val destination = mutableListOf<Int>() // Empty list for distinct elements
    for (num in source) {
        if (!isNumberInArray(num, destination.toIntArray())) {
            addArrayElement(num, destination)
        }
    }
    return destination.toIntArray() // Convert list back to IntArray
}

fun main() {
    val source = fillArray()
    println("Array 1 elements:")
    printArray(source)

    val distinct = copyDistinctNumbers(source)
    println("\nArray 2 distinct elements:")
    printArray(distinct)

    /* =============================== Version 2 (Professional) =============================== */

    println("\n--- Optimized Professional Version ---")

    val arr1 = intArrayOf(10, 10, 10, 50, 50, 70, 70, 70, 70, 90)
    val arr2 = arr1.distinct() // Built-in function returns only unique values

    println("\nArray 1 elements:")
    println(arr1.joinToString(" "))

    println("\nArray 2 distinct elements:")
    println(arr2.joinToString(" "))
}
