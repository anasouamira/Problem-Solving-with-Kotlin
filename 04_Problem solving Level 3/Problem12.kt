import kotlin.random.Random

/* ===============================================
   Version 1 — Educational style (element by element)
   =============================================== */
fun randomNumber(from: Int, to: Int) = Random.nextInt(from, to + 1)

fun fillMatrix(matrix: Array<IntArray>, rows: Int, cols: Int) {
    for (i in 0 until rows)
        for (j in 0 until cols)
            matrix[i][j] = randomNumber(1, 10)
}

fun printMatrix(matrix: Array<IntArray>) {
    matrix.forEach { row ->
        println(row.joinToString(" ") { String.format("%02d", it) })
    }
}

fun areMatricesEqual(matrix1: Array<IntArray>, matrix2: Array<IntArray>): Boolean {
    for (i in matrix1.indices)
        for (j in matrix1[i].indices)
            if (matrix1[i][j] != matrix2[i][j]) return false
    return true
}

/* ===============================================
   Version 2 — Professional Kotlin style (functional)
   =============================================== */
fun generateRandomMatrix(rows: Int, cols: Int) =
    Array(rows) { IntArray(cols) { Random.nextInt(1, 11) } }

fun areMatricesEqualPro(matrix1: Array<IntArray>, matrix2: Array<IntArray>) =
    matrix1.indices.all { i -> matrix1[i].contentEquals(matrix2[i]) }

/* ===============================================
   Main function
   =============================================== */
fun main() {
    val rows = 3
    val cols = 3

    println("====== Version 1: Educational style ======")
    val matrix1 = Array(rows) { IntArray(cols) }
    val matrix2 = Array(rows) { IntArray(cols) }
    fillMatrix(matrix1, rows, cols)
    fillMatrix(matrix2, rows, cols)
    println("Matrix1:")
    printMatrix(matrix1)
    println("\nMatrix2:")
    printMatrix(matrix2)
    println("\nAre matrices equal? ${if (areMatricesEqual(matrix1, matrix2)) "YES" else "NO"}")

    println("\n====== Version 2: Professional Kotlin style ======")
    val matrixPro1 = generateRandomMatrix(rows, cols)
    val matrixPro2 = generateRandomMatrix(rows, cols)
    println("Matrix1:")
    printMatrix(matrixPro1)
    println("\nMatrix2:")
    printMatrix(matrixPro2)
    println("\nAre matrices equal? ${if (areMatricesEqualPro(matrixPro1, matrixPro2)) "YES" else "NO"}")
}
