/* ===============================================
   Version 1 — Educational style
   =============================================== */
fun printMatrix(matrix: Array<IntArray>) {
    matrix.forEach { row ->
        println(row.joinToString(" ") { it.toString().padStart(3, ' ') })
    }
}

fun isIdentityMatrix(matrix: Array<IntArray>): Boolean {
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            if (i == j && matrix[i][j] != 1) return false
            if (i != j && matrix[i][j] != 0) return false
        }
    }
    return true
}

/* ===============================================
   Version 2 — Professional Kotlin style
   =============================================== */
fun isIdentityMatrixPro(matrix: Array<IntArray>) =
    matrix.indices.all { i ->
        matrix[i].indices.all { j -> (i == j && matrix[i][j] == 1) || (i != j && matrix[i][j] == 0) }
    }

/* ===============================================
   Main function
   =============================================== */
fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 0, 0),
        intArrayOf(0, 1, 0),
        intArrayOf(0, 0, 1)
    )

    println("====== Version 1: Educational ======")
    printMatrix(matrix)
    println(if (isIdentityMatrix(matrix)) "\nYES: Matrix is identity." else "\nNO: Matrix is NOT identity.")

    println("\n====== Version 2: Professional Kotlin ======")
    printMatrix(matrix)
    println(if (isIdentityMatrixPro(matrix)) "\nYES: Matrix is identity." else "\nNO: Matrix is NOT identity.")
}
