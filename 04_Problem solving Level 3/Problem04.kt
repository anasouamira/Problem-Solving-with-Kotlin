// ===============================================================
// Problem 04 | Fill 3x3 Matrix and Print Each Column Sum
// ===============================================================

import kotlin.random.Random

// -------------------- VERSION 1 (Educational Style) --------------------

// Function to generate a random number between From and To (inclusive)
fun randomNumber(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1)
}

// Function to fill a 3x3 matrix with random numbers from 1 to 100
fun fillMatrixWithRandomNumbers(matrix: Array<IntArray>, rows: Int, cols: Int) {
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            matrix[i][j] = randomNumber(1, 100)
        }
    }
}

// Function to print the matrix neatly
fun printMatrix(matrix: Array<IntArray>, rows: Int, cols: Int) {
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            // "%3d" ensures fixed width for alignment
            print("%3d ".format(matrix[i][j]))
        }
        println()
    }
}

// Function to calculate the sum of a specific column
fun colSum(matrix: Array<IntArray>, rows: Int, colNumber: Int): Int {
    var sum = 0
    for (i in 0 until rows) {
        sum += matrix[i][colNumber]
    }
    return sum
}

// Function to print the sum of each column
fun printEachColSum(matrix: Array<IntArray>, rows: Int, cols: Int) {
    println("\nThe following are the sums of each column in the matrix:")
    for (j in 0 until cols) {
        println(" Col ${j + 1} Sum = ${colSum(matrix, rows, j)}")
    }
}

fun main() {
    // -------------------- Educational Version --------------------
    println("The following is a 3x3 random matrix:\n")

    val matrix = Array(3) { IntArray(3) }
    fillMatrixWithRandomNumbers(matrix, 3, 3)
    printMatrix(matrix, 3, 3)
    printEachColSum(matrix, 3, 3)

    // -------------------- Professional Kotlin Version --------------------
    println("\n=========== Kotlin Professional Version ===========\n")

    // Create a 3x3 matrix with random numbers between 1 and 100
    val proMatrix = Array(3) { IntArray(3) { Random.nextInt(1, 101) } }

    // Print the matrix nicely
    proMatrix.forEach { row ->
        println(row.joinToString("  ") { "%3d".format(it) })
    }

    // Compute column sums using map and sumOf
    val colSums = (0 until 3).map { col -> proMatrix.sumOf { it[col] } }

    println("\nColumn sums:")
    colSums.forEachIndexed { index, sum ->
        println(" Col ${index + 1} Sum = $sum")
    }
}
