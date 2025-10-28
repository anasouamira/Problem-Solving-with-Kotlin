fun main() {
    println("========= Version 1: Beginner Level =========")

    val rows = 3
    val cols = 3
    val matrix1 = Array(rows) { IntArray(cols) }
    val matrix2 = Array(rows) { IntArray(cols) }
    val resultMatrix = Array(rows) { IntArray(cols) }

    // Fill matrices with random numbers from 1 to 10
    fun fillMatrixRandom(matrix: Array<IntArray>) {
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                matrix[i][j] = (1..10).random()
            }
        }
    }

    // Print a matrix
    fun printMatrix(matrix: Array<IntArray>) {
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                print(String.format("%02d ", matrix[i][j]))
            }
            println()
        }
    }

    // Multiply matrices element by element
    fun multiplyMatrixElementwise(m1: Array<IntArray>, m2: Array<IntArray>, result: Array<IntArray>) {
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = m1[i][j] * m2[i][j]
            }
        }
    }

    fillMatrixRandom(matrix1)
    fillMatrixRandom(matrix2)

    println("\nMatrix1:")
    printMatrix(matrix1)

    println("\nMatrix2:")
    printMatrix(matrix2)

    multiplyMatrixElementwise(matrix1, matrix2, resultMatrix)
    println("\nResults:")
    printMatrix(resultMatrix)

    println("\n========= Version 2: Professional Level =========")

    // Professional approach using Kotlin functional constructs
    val matrixA = Array(3) { IntArray(3) { (1..10).random() } }
    val matrixB = Array(3) { IntArray(3) { (1..10).random() } }
    val resultAB = Array(3) { i -> IntArray(3) { j -> matrixA[i][j] * matrixB[i][j] } }

    println("\nMatrix1:")
    matrixA.forEach { row -> println(row.joinToString(" ") { "%02d".format(it) }) }

    println("\nMatrix2:")
    matrixB.forEach { row -> println(row.joinToString(" ") { "%02d".format(it) }) }

    println("\nResults:")
    resultAB.forEach { row -> println(row.joinToString(" ") { "%02d".format(it) }) }
}
