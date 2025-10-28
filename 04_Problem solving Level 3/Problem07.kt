fun main() {
    println("========= Version 1: Beginner Level =========")

    // ---------- VERSION 1: STEP BY STEP ----------
    val rows = 3
    val cols = 3
    val matrix = Array(rows) { IntArray(cols) }          // Original matrix
    val transposed = Array(rows) { IntArray(cols) }     // Transposed matrix

    // Fill the matrix with ordered numbers starting from 1
    var counter = 1
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            matrix[i][j] = counter
            counter++
        }
    }

    // Function to print a matrix
    fun printMatrix(mat: Array<IntArray>) {
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                print("${mat[i][j].toString().padStart(2, ' ')} ")
            }
            println()
        }
    }

    println("\nThe following is a 3x3 ordered matrix:\n")
    printMatrix(matrix)

    // Transpose the matrix
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            transposed[i][j] = matrix[j][i]
        }
    }

    println("\nThe following is the transposed matrix:\n")
    printMatrix(transposed)


    println("\n========= Version 2: Professional Level =========")

    // ---------- VERSION 2: PROFESSIONAL ----------
    // Fill the matrix and transpose using functional approach
    val matrix2 = Array(3) { i -> IntArray(3) { j -> i * 3 + j + 1 } }
    val transposed2 = Array(3) { i -> IntArray(3) { j -> matrix2[j][i] } }

    println("\nThe following is a 3x3 ordered matrix:\n")
    matrix2.forEach { row ->
        println(row.joinToString(" ") { it.toString().padStart(2, ' ') })
    }

    println("\nThe following is the transposed matrix:\n")
    transposed2.forEach { row ->
        println(row.joinToString(" ") { it.toString().padStart(2, ' ') })
    }
}
