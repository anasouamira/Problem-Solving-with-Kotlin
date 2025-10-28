/*
Problem 39 |========================================================================
Write a program to fill an array (max size 100) with random numbers from
1 to 100, copy only prime numbers to another array, and print both arrays.

Example Input:
10

Example Output:
Array 1 elements:
61 100 32 75 81 95 50 98 13 70

Array 2 Prime numbers:
61 13
=============================================================
*/

import kotlin.random.Random

/* =============================== Version 1 (Educational) =============================== */

// Function to check if a number is prime
fun isPrime(number: Int): Boolean {
    // Numbers less than 2 are not prime
    if (number < 2) return false

    // Check divisibility from 2 to sqrt(number)
    for (i in 2..number / 2) {
        if (number % i == 0)
            return false
    }
    return true
}

// Function to generate a random number in range
fun randomNumber(from: Int, to: Int): Int {
    // Random.nextInt generates a random integer in the given range
    return Random.nextInt(from, to + 1)
}

// Function to fill an array with random numbers
fun fillArrayWithRandomNumbers(size: Int): IntArray {
    val arr = IntArray(size)
    for (i in 0 until size)
        arr[i] = randomNumber(1, 100)
    return arr
}

// Function to copy prime numbers from one array to another
fun copyPrimeNumbers(source: IntArray): IntArray {
    // Create a mutable list to store prime numbers temporarily
    val primeList = mutableListOf<Int>()
    for (num in source) {
        if (isPrime(num))
            primeList.add(num)
    }
    // Convert the list back to IntArray
    return primeList.toIntArray()
}

// Function to print an array
fun printArray(arr: IntArray) {
    for (num in arr)
        print("$num ")
    println()
}

fun main() {
    print("Enter number of elements: ")
    val size = readLine()!!.toInt()

    val arr1 = fillArrayWithRandomNumbers(size)
    val arr2 = copyPrimeNumbers(arr1)

    println("\nArray 1 elements:")
    printArray(arr1)

    println("\nArray 2 Prime numbers:")
    printArray(arr2)

    /* =============================== Version 2 (Professional) =============================== */

    println("\n--- Optimized Professional Version ---")

    print("Enter number of elements: ")
    val n = readLine()!!.toInt()

    val arrA = IntArray(n) { Random.nextInt(1, 101) }  // Fill with randoms 1–100
    val arrB = arrA.filter { num ->                   // Keep only primes
        if (num < 2) false else (2..num / 2).none { num % it == 0 }
    }

    println("\nArray 1 elements:")
    println(arrA.joinToString(" "))

    println("\nArray 2 Prime numbers:")
    println(arrB.joinToString(" "))
}
