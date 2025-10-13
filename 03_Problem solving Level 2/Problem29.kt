// ================================================================
// 🧩 Example 1 — Same logic and structure as the C++ version
// ================================================================

import kotlin.math.round
import kotlin.random.Random

// Enum class to represent prime or not prime
enum class PrimeStatus {
    Prime,
    NotPrime
}

// Function to check if a number is prime
fun checkPrime(number: Int): PrimeStatus {
    if (number < 2) return PrimeStatus.NotPrime
    val m = round(number / 2.0).toInt()
    for (counter in 2..m) {
        if (number % counter == 0)
            return PrimeStatus.NotPrime
    }
    return PrimeStatus.Prime
}

// Function to generate a random number within range
fun randomNumber(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1)
}

// Function to fill an array with random numbers
fun fillArrayWithRandomNumbers(size: Int): IntArray {
    val arr = IntArray(size)
    for (i in 0 until size) {
        arr[i] = randomNumber(1, 100)
    }
    return arr
}

// Function to copy only prime numbers from one array to another
fun copyOnlyPrimeNumbers(source: IntArray): IntArray {
    val primes = mutableListOf<Int>()
    for (num in source) {
        if (checkPrime(num) == PrimeStatus.Prime) {
            primes.add(num)
        }
    }
    return primes.toIntArray()
}

// Function to print an array
fun printArray(arr: IntArray) {
    for (num in arr) print("$num ")
    println()
}

// main function
fun main() {
    print("Enter number of elements: ")
    val arrLength = readln().toInt()

    val arr1 = fillArrayWithRandomNumbers(arrLength)
    val arr2 = copyOnlyPrimeNumbers(arr1)

    println("\nArray 1 elements:")
    printArray(arr1)

    println("\nPrime Numbers in Array 2:")
    printArray(arr2)
}



// ================================================================
// 💎 Example 2 — Professional Kotlin Version (Functional Style)
// ================================================================

fun main2() {
    // Ask user for array size
    print("Enter number of elements: ")
    val n = readln().toInt()

    // Generate a list of random numbers (1–100)
    val numbers = List(n) { Random.nextInt(1, 101) }

    // Use filter to extract prime numbers
    val primes = numbers.filter { num ->
        num >= 2 && (2..num / 2).none { divisor -> num % divisor == 0 }
    }

    println("\nArray 1 elements:")
    println(numbers.joinToString(" "))

    println("\nPrime Numbers in Array 2:")
    println(primes.joinToString(" "))
}
