// ===========================================
// 1️⃣ Function Declaration
// Functions in Kotlin are declared using the 'fun' keyword.
// They can take parameters and return a value or return Unit (no value).
// ===========================================

// Function with no parameters and no return value
fun greet(): Unit { // Unit is similar to void in other languages
    println("Hello, welcome!")
}

// Function with parameters and no return value
fun printSum(a: Int, b: Int): Unit {
    println("Sum of $a and $b is ${a + b}")
}

// Function with parameters and a return value
fun multiply(a: Int, b: Int): Int { // Return type is Int
    return a * b
}

// Function with single-expression syntax
fun square(n: Int): Int = n * n // concise form

fun main() {
    // Calling functions
    greet()                     // prints greeting
    printSum(5, 7)              // prints sum
    val result = multiply(4, 6) // returns 24
    println("Multiply result: $result")
    val sq = square(5)
    println("Square result: $sq")

    // ===========================================
    // 2️⃣ Notes on return types
    // - If function returns nothing, use 'Unit' or omit it
    // - Explicit return type is required for non-Unit functions
    // - Kotlin can infer return type for single-expression functions
    // ===========================================
}
