// ===============================================================
// Problem 01 | Fill a 3x3 Matrix with Random Numbers
// ===============================================================

import kotlin.random.Random

// -------------------- VERSION 1 (Educational) --------------------

// Function to generate a random number between From and To
fun randomNumber(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1)
}

// Function to fill a 3x3 matrix with random numbers between 1 and 100
fun fillMatrixWithRandomNumbers(matrix: Array<IntArray>, rows: Int, cols: Int) {
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            matrix[i][j] = randomNumber(1, 100)
        }
    }
}

// Function to print the matrix in formatted style
fun printMatrix(matrix: Array<IntArray>, rows: Int, cols: Int) {
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            // "%3d" means print as integer with 3 spaces for alignment
            print("%3d\t".format(matrix[i][j]))
        }
        println() // New line after each row
    }
}

fun main() {
    println("The following is a 3x3 random matrix:\n")

    // Declare a 3x3 matrix (array of arrays)
    val matrix = Array(3) { IntArray(3) }

    // Fill and print the matrix
    fillMatrixWithRandomNumbers(matrix, 3, 3)
    printMatrix(matrix, 3, 3)

    // ---------------------------------------------------------------
    // VERSION 2 (Professional Kotlin Style)
    // ---------------------------------------------------------------

    println("\n=========== Kotlin Professional Version ===========\n")

    // Create a 3x3 matrix filled with random numbers in a single line
    val proMatrix = Array(3) { IntArray(3) { Random.nextInt(1, 101) } }

    // Print it in a clean, functional way
    proMatrix.forEach { row ->
        println(row.joinToString("\t") { "%3d".format(it) })
    }
}
