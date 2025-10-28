import kotlin.random.Random

fun main() {
    println("========= Version 1: Beginner Level =========")

    // ---------- VERSION 1: SIMPLE STEP BY STEP ----------
    // Create a 3x3 matrix (Array of Arrays)
    val rows = 3
    val cols = 3
    val matrix = Array(rows) { IntArray(cols) }   // Matrix of 3x3 integers
    val colSums = IntArray(cols)                  // Array to store column sums

    // Function to fill matrix with random numbers (1..100)
    fun fillMatrixRandom() {
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                matrix[i][j] = Random.nextInt(1, 101)
            }
        }
    }

    // Function to print matrix
    fun printMatrix() {
        println("The following is a 3x3 random matrix:\n")
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                print("${matrix[i][j].toString().padStart(3, ' ')} ")
            }
            println()
        }
    }

    // Function to calculate column sum
    fun colSum(colIndex: Int): Int {
        var sum = 0
        for (i in 0 until rows) {
            sum += matrix[i][colIndex]
        }
        return sum
    }

    // Function to fill colSums array
    fun fillColSums() {
        for (j in 0 until cols) {
            colSums[j] = colSum(j)
        }
    }

    // Function to print sums
    fun printColSums() {
        println("\nThe following are the sums of each column in the matrix:\n")
        for (i in 0 until cols) {
            println("Col ${i + 1} Sum = ${colSums[i]}")
        }
    }

    // Run the program (simple version)
    fillMatrixRandom()
    printMatrix()
    fillColSums()
    printColSums()


    println("\n========= Version 2: Professional Level =========")

    // ---------- VERSION 2: PROFESSIONAL AND CLEAN ----------
    val matrix2 = Array(3) { IntArray(3) { Random.nextInt(1, 101) } }

    // Print matrix using functional approach
    println("\nThe following is a 3x3 random matrix:\n")
    matrix2.forEach { row ->
        println(row.joinToString(" ") { it.toString().padStart(3, ' ') })
    }

    // Compute column sums using indices
    val colSums2 = IntArray(3) { col ->
        matrix2.sumOf { it[col] }  // Sum of elements in column `col`
    }

    println("\nThe following are the sums of each column in the matrix:\n")
    colSums2.forEachIndexed { index, sum ->
        println("Col ${index + 1} Sum = $sum")
    }
}
