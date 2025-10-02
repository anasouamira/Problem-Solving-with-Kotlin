// 🔹 Question / Task:
// Read total sales and calculate commission based on the following rules:
// - Sales >= 1,000,000 → 1%
// - Sales >= 500,000 → 2%
// - Sales >= 100,000 → 3%
// - Sales >= 50,000 → 5%
// - Otherwise → 0%

import java.util.Scanner

// -----------------------------------------------------------
// Example 1 – Classic style (mirrors C++ structure)
// -----------------------------------------------------------

// Function to read total sales (non-negative)
fun readTotalSales(scanner: Scanner): Int {
    var sales: Int
    do {
        print("Enter Total Sales: ")
        sales = scanner.nextInt()
        if (sales < 0) println("Invalid input! Sales must be non-negative.")
    } while (sales < 0)
    return sales
}

// Function to determine commission rate based on sales
fun getPercentage(sales: Int): Float {
    return when {
        sales >= 1_000_000 -> 0.01f
        sales >= 500_000   -> 0.02f
        sales >= 100_000   -> 0.03f
        sales >= 50_000    -> 0.05f
        else               -> 0f
    }
}

// Function to calculate commission amount
fun calculateCommission(sales: Int): Float = sales * getPercentage(sales)

fun runExample1(scanner: Scanner) {
    println("=== Example 1: Classic style ===")
    val totalSales = readTotalSales(scanner)
    val commission = calculateCommission(totalSales)
    println("The commission is: $commission")
}

// -----------------------------------------------------------
// Example 2 – Kotlin-idiomatic concise version
// -----------------------------------------------------------

fun runExample2() {
    println("\n=== Example 2: Kotlin-idiomatic ===")
    print("Enter Total Sales: ")
    val sales = readLine()?.toIntOrNull()
    if (sales == null || sales < 0) {
        println("Invalid input! Sales must be non-negative.")
        return
    }

    val rate = when {
        sales >= 1_000_000 -> 0.01
        sales >= 500_000   -> 0.02
        sales >= 100_000   -> 0.03
        sales >= 50_000    -> 0.05
        else               -> 0.0
    }

    val commission = sales * rate
    println("The commission is: $commission")
}

// -----------------------------------------------------------
// Main
// -----------------------------------------------------------

fun main() {
    val scanner = Scanner(System.`in`)
    runExample1(scanner)
    runExample2()
}
