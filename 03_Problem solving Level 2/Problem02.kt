import kotlin.math.sqrt

//===============================================================
// Solution 1: Same methodology as C++ version
//===============================================================

// Enum to represent Prime / Not Prime
enum class PrimeCheck {
    Prime, NotPrime
}

// Function to read a positive number from user
fun readPositiveNumber(message: String): Int {
    var number: Int
    do {
        print("$message ")
        number = readLine()?.toIntOrNull() ?: 0
    } while (number <= 0) // keep asking until input is positive
    return number
}

// Function to check if a number is prime (method: check until n/2)
fun checkPrime(number: Int): PrimeCheck {
    val m = number / 2
    for (counter in 2..m) {
        if (number % counter == 0) {
            return PrimeCheck.NotPrime
        }
    }
    return PrimeCheck.Prime
}

// Function to print primes from 1 to N
fun printPrimesFrom1ToN(number: Int) {
    println("\nPrime Numbers from 1 to $number are:")
    for (i in 1..number) {
        if (checkPrime(i) == PrimeCheck.Prime) {
            println(i)
        }
    }
}

//===============================================================
// Solution 2: Optimized / Professional version
//===============================================================

// Function to check if a number is prime (optimized with sqrt(n))
fun isPrimeOptimized(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

// Function to print primes using the optimized check
fun printPrimesOptimized(limit: Int) {
    println("\n[Optimized] Prime Numbers from 1 to $limit are:")
    for (i in 1..limit) {
        if (isPrimeOptimized(i)) {
            println(i)
        }
    }
}

//===============================================================
// Main Function
//===============================================================
fun main() {
    val number = readPositiveNumber("Please enter a positive number:")

    // Call the first solution (same methodology as C++)
    printPrimesFrom1ToN(number)

    // Call the optimized solution
    printPrimesOptimized(number)
}
