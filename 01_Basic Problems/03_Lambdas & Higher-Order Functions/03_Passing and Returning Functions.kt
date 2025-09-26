// ===========================================
// Passing and Returning Functions in Kotlin
// ===========================================
// A higher-order function is a function that:
//   - takes another function as a parameter
//   - OR returns a function as a result
// This allows you to treat functions as values.

// --------------------------------------------------
// 1️⃣ Passing a function as a parameter
// --------------------------------------------------

// Define a function that takes an Int and a function (Int) -> Int
fun operateOnNumber(x: Int, operation: (Int) -> Int): Int {
    // 'operation' is a function we can call with x
    return operation(x)
}

// Example functions to pass:
fun square(n: Int) = n * n
fun triple(n: Int) = n * 3

// --------------------------------------------------
// 2️⃣ Returning a function from a function
// --------------------------------------------------

// This function returns a function of type (Int) -> Int
fun selectOperation(type: String): (Int) -> Int {
    // We return different lambdas based on the type
    return when (type) {
        "double" -> { number -> number * 2 } // lambda that doubles
        "square" -> { number -> number * number } // lambda that squares
        else -> { number -> number } // identity function
    }
}

fun main() {
    // Passing functions to another function
    println(operateOnNumber(5, ::square)) // Output: 25
    println(operateOnNumber(5, ::triple)) // Output: 15

    // Passing a lambda directly
    println(operateOnNumber(5) { it + 10 }) // Output: 15

    // Getting a function from another function
    val doubler = selectOperation("double") // doubler is (Int) -> Int
    println(doubler(7)) // Output: 14

    val squarer = selectOperation("square")
    println(squarer(6)) // Output: 36

    val identity = selectOperation("unknown")
    println(identity(42)) // Output: 42

    // --------------------------------------------------
    // Notes:
    // - '::functionName' passes a reference to a named function.
    // - We can also pass lambdas directly as arguments.
    // - Returning functions allows dynamic behavior based on conditions.
    // --------------------------------------------------
}
