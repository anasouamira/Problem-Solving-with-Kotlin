// 🔹 Question / Task:
// Read a positive integer and check whether it is prime or not.
// Preserve the original C++ methodology (Example 1) and also provide
// a more idiomatic Kotlin solution (Example 2).

import java.util.Scanner
import kotlin.math.roundToInt
import kotlin.math.sqrt

// -----------------------------------------------------------
// Example 1 – Same methodology as the original C++ solution
// -----------------------------------------------------------

// Enum equivalent to C++ enum enmPrimeNotPrime
enum class PrimeState { Prime, NotPrime }

// Function to read a positive number from the user (mirrors RedNumbers)
fun readNumber(scanner: Scanner, message: String): Int {
    var n: Int
    do {
        print(message)
        n = scanner.nextInt()
        if (n < 0) {
            println("Invalid input! Please enter a positive number.")
        }
    } while (n < 0)
    return n
}

// Function to check if a number is prime using the same simple method:
// check divisibility from 2 up to round(n/2)
fun checkPrimeClassic(n: Int): PrimeState {
    if (n < 2) return PrimeState.NotPrime

    // Follow original approach: use round(n / 2)
    val m = (n / 2.0).roundToInt()
    for (i in 2..m) {
        if (n % i == 0) return PrimeState.NotPrime
    }
    return PrimeState.Prime
}

// Function to print result using the classic checker
fun printNumberTypeClassic(n: Int) {
    when (checkPrimeClassic(n)) {
        PrimeState.Prime    -> println("This Number is Prime")
        PrimeState.NotPrime -> println("This Number is Not Prime")
    }
}

fun runExample1(scanner: Scanner) {
    println("=== Example 1: Classic style ===")
    val number = readNumber(scanner, "Please Enter a Positive Number: ")
    printNumberTypeClassic(number)
}

// -----------------------------------------------------------
// Example 2 – Kotlin-idiomatic solution (efficient & concise)
// -----------------------------------------------------------

// More efficient prime check: handle small cases, then test divisors up to sqrt(n).
fun isPrimeKotlin(n: Int): Boolean {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false

    val limit = sqrt(n.toDouble()).toInt()
    var i = 3
    while (i <= limit) {
        if (n % i == 0) return false
        i += 2
    }
    return true
}

fun runExample2() {
    println("\n=== Example 2: Kotlin-idiomatic (efficient) ===")
    print("Please enter a positive integer: ")
    val n = readLine()?.toIntOrNull()
    if (n == null || n < 0) {
        println("Invalid input! Please enter a positive integer.")
        return
    }

    if (isPrimeKotlin(n)) println("This Number is Prime")
    else println("This Number is Not Prime")
}

// -----------------------------------------------------------
// Main
// -----------------------------------------------------------

fun main() {
    val scanner = Scanner(System.`in`)
    runExample1(scanner)
    runExample2()
}
