// ===============================================================
// Problem 02 | Fill 3x3 Matrix and Print Each Row Sum
// ===============================================================

import kotlin.random.Random

// -------------------- VERSION 1 (Educational) --------------------

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

// Function to print the matrix in formatted style
fun printMatrix(matrix: Array<IntArray>, rows: Int, cols: Int) {
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            // "%3d" aligns the output into 3 spaces
            print("%3d ".format(matrix[i][j]))
        }
        println()
    }
}

// Function to calculate the sum of a specific row
fun rowSum(matrix: Array<IntArray>, rowNumber: Int, cols: Int): Int {
    var sum = 0
    for (j in 0 until cols) {
        sum += matrix[rowNumber][j]
    }
    return sum
}

// Function to print the sum of each row
fun printEachRowSum(matrix: Array<IntArray>, rows: Int, cols: Int) {
    println("\nThe following are the sums of each row in the matrix:")
    for (i in 0 until rows) {
        println(" Row ${i + 1} Sum = ${rowSum(matrix, i, cols)}")
    }
}

fun main() {
    println("The following is a 3x3 random matrix:\n")

    // Create a 3x3 matrix
    val matrix = Array(3) { IntArray(3) }

    // Fill and display the matrix
    fillMatrixWithRandomNumbers(matrix, 3, 3)
    printMatrix(matrix, 3, 3)

    // Display each row's sum
    printEachRowSum(matrix, 3, 3)

    // ---------------------------------------------------------------
    // VERSION 2 (Professional Kotlin Style)
    // ---------------------------------------------------------------

    println("\n=========== Kotlin Professional Version ===========\n")

    // Create a 3x3 matrix with random values directly
    val proMatrix = Array(3) { IntArray(3) { Random.nextInt(1, 101) } }

    // Print the matrix
    proMatrix.forEach { row ->
        println(row.joinToString("  ") { "%3d".format(it) })
    }

    // Print each row's sum using functional style
    println("\nRow sums:")
    proMatrix.forEachIndexed { index, row ->
        println(" Row ${index + 1} Sum = ${row.sum()}")
    }
}
