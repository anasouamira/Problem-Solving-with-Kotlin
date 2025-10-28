fun main() {
    println("========= Version 1: Beginner Level =========")

    // ---------- VERSION 1: SIMPLE STEP BY STEP ----------
    val rows = 3
    val cols = 3
    val matrix = Array(rows) { IntArray(cols) } // Create a 3x3 matrix

    // Function to fill the matrix with ordered numbers starting from 1
    fun fillMatrixOrdered() {
        var counter = 1
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                matrix[i][j] = counter
                counter++ // Increase by 1 each step
            }
        }
    }

    // Function to print matrix elements
    fun printMatrix() {
        println("The following is a 3x3 ordered matrix:\n")
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                print("${matrix[i][j].toString().padStart(2, ' ')} ")
            }
            println()
        }
    }

    // Run the simple version
    fillMatrixOrdered()
    printMatrix()


    println("\n========= Version 2: Professional Level =========")

    // ---------- VERSION 2: PROFESSIONAL AND CLEAN ----------
    // Fill the matrix directly with ordered numbers using a functional approach
    val matrix2 = Array(3) { i ->
        IntArray(3) { j -> i * 3 + j + 1 } // Formula to fill sequentially
    }

    // Print the matrix in a clean format
    println("\nThe following is a 3x3 ordered matrix:\n")
    matrix2.forEach { row ->
        println(row.joinToString(" ") { it.toString().padStart(2, ' ') })
    }
}
