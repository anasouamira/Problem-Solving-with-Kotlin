// 🔹 Question / Task:
// Read a positive number of hours and convert it into equivalent number of days and weeks.
// We'll provide both Example 1 (classic C++ style) and Example 2 (idiomatic Kotlin).

import java.util.Scanner

// -----------------------------------------------------------
// Example 1 – Classic style (mirrors C++ structure)
// -----------------------------------------------------------

// Function to read a positive number from the user
fun readPositiveNumber(scanner: Scanner, message: String): Int {
    var n: Int
    do {
        print(message)
        n = scanner.nextInt()
        if (n < 0) println("Invalid input! Please enter a positive number.")
    } while (n < 0)
    return n
}

// Convert hours to days
fun hoursToDays(hours: Float): Float = hours / 24.0f

// Convert hours to weeks
fun hoursToWeeks(hours: Float): Float = hours / 168.0f

fun runExample1(scanner: Scanner) {
    println("=== Example 1: Classic style ===")
    val hours = readPositiveNumber(scanner, "Enter Number of Hours: ")
    println("${hoursToDays(hours.toFloat())} Day(s)")
    println("${hoursToWeeks(hours.toFloat())} Week(s)")
}

// -----------------------------------------------------------
// Example 2 – Kotlin-idiomatic concise version
// -----------------------------------------------------------

fun runExample2() {
    println("\n=== Example 2: Kotlin-idiomatic ===")
    print("Enter Number of Hours: ")
    val hours = readLine()?.toIntOrNull()
    if (hours == null || hours < 0) {
        println("Invalid input! Please enter a positive number.")
        return
    }
    val days = hours / 24.0
    val weeks = hours / 168.0
    println("$days Day(s)")
    println("$weeks Week(s)")
}

// -----------------------------------------------------------
// Main
// -----------------------------------------------------------

fun main() {
    val scanner = Scanner(System.`in`)
    runExample1(scanner)
    runExample2()
}
