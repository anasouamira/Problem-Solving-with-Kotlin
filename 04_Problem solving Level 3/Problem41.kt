/*
Problem 41 |=================================================
Write a program to fill array with numbers, then check if it is a Palindrome
array or not. Note: Palindrome array can be read the same from right to
left and from left to right.

Input:
10 20 30 30 20 10

Output:

Array Elements:
10 20 30 30 20 10

Yes, array is Palindrome
=============================================================
*/

/* ========================= Version 1 (Educational) ========================= */

// Function to fill the array with predefined elements
fun fillArray(): IntArray {
    // Array initialized with the example values
    return intArrayOf(10, 20, 30, 30, 20, 10)
}

// Function to print the elements of the array
fun printArray(arr: IntArray) {
    for (num in arr) {
        print("$num ")
    }
    println()
}

// Function to check if an array is palindrome
fun isPalindromeArray(arr: IntArray): Boolean {
    val length = arr.size
    // Compare from both ends moving toward the center
    for (i in 0 until length / 2) {
        if (arr[i] != arr[length - i - 1]) {
            return false // Mismatch found
        }
    }
    return true // All matched => Palindrome
}

fun main() {
    val arr = fillArray()

    println("Array Elements:")
    printArray(arr)

    if (isPalindromeArray(arr))
        println("\nYes, array is Palindrome")
    else
        println("\nNo, array is NOT Palindrome")

    /* ========================= Version 2 (Professional) ========================= */

    println("\n--- Optimized Professional Version ---")

    val arr2 = intArrayOf(10, 20, 30, 30, 20, 10)
    val isPalindrome = arr2.contentEquals(arr2.reversedArray())

    println("\nArray Elements:")
    println(arr2.joinToString(" "))

    println(
        if (isPalindrome) "\nYes, array is Palindrome"
        else "\nNo, array is NOT Palindrome"
    )
}
