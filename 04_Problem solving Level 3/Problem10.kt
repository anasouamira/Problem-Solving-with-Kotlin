import kotlin.random.Random

/* ===========================================================
   Version 1 — Educational Style (same as original C++ logic)
   =========================================================== */

// Function to generate a random number between From and To
fun randomNumber(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1)
}

// Function to fill a 3x3 matrix with random numbers
fun fillMatrixWithRandomNumbers(matrix: Array<IntArray>, rows: Int, cols: Int) {
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            matrix[i][j] = randomNumber(1, 10) // Assign random number between 1 and 10
        }
    }
}

// Function to print the matrix in formatted grid
fun printMatrix(matrix: Array<IntArray>, rows: Int, cols: Int) {
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print(String.format(" %02d ", matrix[i][j])) // print numbers with leading zeros
        }
        println()
    }
}

// Function to calculate sum of all elements in the matrix
fun sumOfMatrix(matrix: Array<IntArray>, rows: Int, cols: Int): Int {
    var sum = 0
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            sum += matrix[i][j]
        }
    }
    return sum
}

/* ===========================================================
   Version 2 — Professional Kotlin Style (clean & idiomatic)
   =========================================================== */

fun generateRandomMatrix(rows: Int, cols: Int, range: IntRange = 1..10): Array<IntArray> {
    // Generate matrix using lambda expression and Kotlin array constructors
    return Array(rows) { IntArray(cols) { Random.nextInt(range.first, range.last + 1) } }
}

fun printMatrixPro(matrix: Array<IntArray>) {
    // Use Kotlin joinToString for elegant formatting
    matrix.forEach { row ->
        println(row.joinToString(" ") { String.format("%02d", it) })
    }
}

fun sumMatrixPro(matrix: Array<IntArray>): Int {
    // Sum using functional approach (sumOf)
    return matrix.sumOf { it.sum() }
}

/* ===========================================================
   Main Function — Runs both versions
   =========================================================== */

fun main() {
    val rows = 3
    val cols = 3

    println("=========== Version 1: Educational Style ===========")
    val matrix1 = Array(rows) { IntArray(cols) }
    fillMatrixWithRandomNumbers(matrix1, rows, cols)
    println("Matrix1:")
    printMatrix(matrix1, rows, cols)
    println("\nSum of Matrix1 is: ${sumOfMatrix(matrix1, rows, cols)}")

    println("\n=========== Version 2: Professional Kotlin Style ===========")
    val matrix2 = generateRandomMatrix(rows, cols)
    println("Matrix2:")
    printMatrixPro(matrix2)
    println("\nSum of Matrix2 is: ${sumMatrixPro(matrix2)}")
}
