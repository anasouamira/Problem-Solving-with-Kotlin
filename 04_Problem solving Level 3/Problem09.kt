fun main() {
    val rows = 3
    val cols = 3
    val matrix1 = Array(rows) { IntArray(cols) }

    // Function to fill a matrix with random numbers from 1 to 10
    fun fillMatrixRandom(matrix: Array<IntArray>) {
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                matrix[i][j] = (1..10).random()
            }
        }
    }

    // Function to print a matrix
    fun printMatrix(matrix: Array<IntArray>) {
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                print(String.format("%02d ", matrix[i][j]))
            }
            println()
        }
    }

    // Function to print middle row
    fun printMiddleRow(matrix: Array<IntArray>) {
        val midRow = rows / 2
        for (j in 0 until cols) {
            print(String.format("%02d ", matrix[midRow][j]))
        }
        println()
    }

    // Function to print middle column
    fun printMiddleCol(matrix: Array<IntArray>) {
        val midCol = cols / 2
        for (i in 0 until rows) {
            print(String.format("%02d ", matrix[i][midCol]))
        }
        println()
    }

    // Fill the matrix
    fillMatrixRandom(matrix1)

    // Print the matrix
    println("Matrix1:")
    printMatrix(matrix1)

    // Print middle row
    println("\nMiddle Row of Matrix1 is:")
    printMiddleRow(matrix1)

    // Print middle column
    println("\nMiddle Col of Matrix1 is:")
    printMiddleCol(matrix1)
}
