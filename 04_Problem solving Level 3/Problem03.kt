// ===============================================================
// Problem 03 | Fill 3x3 Matrix, Sum Each Row in Separate Array
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

// Function to print the matrix with aligned columns
fun printMatrix(matrix: Array<IntArray>, rows: Int, cols: Int) {
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            // "%3d" ensures proper spacing for readability
            print("%3d ".format(matrix[i][j]))
        }
        println()
    }
}

// Function to calculate the sum of one specific row
fun rowSum(matrix: Array<IntArray>, rowNumber: Int, cols: Int): Int {
    var sum = 0
    for (j in 0 until cols) {
        sum += matrix[rowNumber][j]
    }
    return sum
}

// Function to fill an array with the sum of each row
fun sumMatrixRowsInArray(matrix: Array<IntArray>, rowSums: IntArray, rows: Int, cols: Int) {
    for (i in 0 until rows) {
        rowSums[i] = rowSum(matrix, i, cols)
    }
}

// Function to print the sums stored in a separate array
fun printRowsSumArray(rowSums: IntArray, rows: Int) {
    println("\nThe following are the sums of each row in the matrix:")
    for (i in 0 until rows) {
        println(" Row ${i + 1} Sum = ${rowSums[i]}")
    }
}

fun main() {
    // ----------------- Educational Version -----------------
    println("The following is a 3x3 random matrix:\n")

    // Declare a 3x3 matrix
    val matrix = Array(3) { IntArray(3) }

    // Fill and print the matrix
    fillMatrixWithRandomNumbers(matrix, 3, 3)
    printMatrix(matrix, 3, 3)

    // Prepare array to store row sums
    val rowSums = IntArray(3)

    // Compute and print row sums
    sumMatrixRowsInArray(matrix, rowSums, 3, 3)
    printRowsSumArray(rowSums, 3)

    // ----------------- Professional Kotlin Version -----------------
    println("\n=========== Kotlin Professional Version ===========\n")

    // Create 3x3 matrix filled with random numbers (1..100)
    val proMatrix = Array(3) { IntArray(3) { Random.nextInt(1, 101) } }

    // Print matrix neatly
    proMatrix.forEach { row ->
        println(row.joinToString("  ") { "%3d".format(it) })
    }

    // Create new array with row sums using map
    val proRowSums = proMatrix.map { row -> row.sum() }

    // Print row sums
    println("\nRow sums:")
    proRowSums.forEachIndexed { index, sum ->
        println(" Row ${index + 1} Sum = $sum")
    }
}
