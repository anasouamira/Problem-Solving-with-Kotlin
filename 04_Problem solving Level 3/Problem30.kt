// ================================================================
// 🧩 Example 1 — Same logic and structure as the C++ version
// ================================================================

import kotlin.random.Random

// Function to generate a random number between 'from' and 'to'
fun randomNumber(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1)
}

// Function to read a positive number from the user
fun readPositiveNumber(message: String): Int {
    var number: Int
    do {
        print("$message ")
        number = readln().toInt()
    } while (number <= 0)
    return number
}

// Function to fill an array with random numbers from 1 to 100
fun fillArrayWithRandomNumbers(arrLength: Int): IntArray {
    val arr = IntArray(arrLength)
    for (i in 0 until arrLength) {
        arr[i] = randomNumber(1, 100)
    }
    return arr
}

// Function to compute the sum of corresponding elements in two arrays
fun sumOfTwoArrays(arr1: IntArray, arr2: IntArray): IntArray {
    val arrSum = IntArray(arr1.size)
    for (i in arr1.indices) {
        arrSum[i] = arr1[i] + arr2[i]
    }
    return arrSum
}

// Function to print array elements
fun printArray(arr: IntArray) {
    for (num in arr) print("$num ")
    println()
}

// Main function
fun main() {
    val arrLength = readPositiveNumber("How many elements?")

    val arr1 = fillArrayWithRandomNumbers(arrLength)
    val arr2 = fillArrayWithRandomNumbers(arrLength)
    val arrSum = sumOfTwoArrays(arr1, arr2)

    println("\nArray 1 elements:")
    printArray(arr1)

    println("\nArray 2 elements:")
    printArray(arr2)

    println("\nSum of array1 and array2 elements:")
    printArray(arrSum)
}



// ================================================================
// 💎 Example 2 — Professional Kotlin Version (Functional & Elegant)
// ================================================================

fun main2() {
    print("How many elements? ")
    val n = readln().toInt()

    // Generate two random lists of size n
    val arr1 = List(n) { Random.nextInt(1, 101) }
    val arr2 = List(n) { Random.nextInt(1, 101) }

    // Compute element-wise sum using zip
    val arrSum = arr1.zip(arr2) { a, b -> a + b }

    println("\nArray 1 elements:")
    println(arr1.joinToString(" "))

    println("\nArray 2 elements:")
    println(arr2.joinToString(" "))

    println("\nSum of array1 and array2 elements:")
    println(arrSum.joinToString(" "))
}
