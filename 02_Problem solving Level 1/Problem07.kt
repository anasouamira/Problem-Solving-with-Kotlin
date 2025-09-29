// 🔹 Question / Task:
// Simple calculator: read two integers and an operation (+, -, *, /) and print the result.

import java.util.Scanner

// -----------------------------------------------------------
// Example 1 – Classic style (close to C++ structure)
// -----------------------------------------------------------

// Data class to hold the numbers and the operation
data class OperationInput(
    var number1: Int,
    var number2: Int,
    var op: Char
)

// Read two numbers and an operation
fun readOperation(scanner: Scanner): OperationInput {
    print("Enter Number1: ")
    val n1 = scanner.nextInt()

    print("Enter Number2: ")
    val n2 = scanner.nextInt()

    var op: Char
    // Keep asking until valid operator
    do {
        print("Enter Operation type (+, -, *, /): ")
        op = scanner.next()[0]
    } while (op !in listOf('+', '-', '*', '/'))

    return OperationInput(n1, n2, op)
}

// Perform the operation
fun calculate(input: OperationInput): Int {
    return when (input.op) {
        '+' -> input.number1 + input.number2
        '-' -> input.number1 - input.number2
        '*' -> input.number1 * input.number2
        '/' -> if (input.number2 != 0)
                    input.number1 / input.number2
                else {
                    println("Error: Division by zero!")
                    0
                }
        else -> 0
    }
}

fun runExample1(scanner: Scanner) {
    val opInput = readOperation(scanner)
    println("Result: ${calculate(opInput)}")
}

// -----------------------------------------------------------
// Example 2 – Kotlin-idiomatic concise version
// -----------------------------------------------------------

fun runExample2() {
    println("\n=== Example 2: Kotlin-idiomatic ===")
    print("Enter expression (e.g. 8 * 4): ")
    val parts = readLine()?.trim()?.split(" ")
    if (parts == null || parts.size != 3) {
        println("Invalid input format.")
        return
    }
    val a = parts[0].toIntOrNull()
    val b = parts[2].toIntOrNull()
    val op = parts[1]

    if (a == null || b == null) {
        println("Invalid numbers.")
        return
    }

    val result = when (op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> if (b != 0) a / b else {
            println("Error: Division by zero!")
            return
        }
        else -> {
            println("Unknown operator.")
            return
        }
    }
    println("Result: $result")
}

// -----------------------------------------------------------
// Main
// -----------------------------------------------------------

fun main() {
    val scanner = Scanner(System.`in`)
    println("=== Example 1: Classic style ===")
    runExample1(scanner)

    runExample2()
}
