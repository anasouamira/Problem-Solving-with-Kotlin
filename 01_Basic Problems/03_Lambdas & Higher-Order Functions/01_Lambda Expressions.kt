// ===========================================
// Lambda Expressions in Kotlin
// ===========================================
// A lambda is an anonymous function (no name) that can be treated as a value.
// It can be stored in variables, passed to functions, or returned from functions.
// Basic syntax: { parameterList -> body }

// --------------------------------------------------
// 1️⃣ Simple Lambda with Parameter
// --------------------------------------------------

// A lambda that takes an Int x and returns x * 2
val double: (Int) -> Int = { x: Int -> x * 2 }
// ^^^^^^    ^^^^^^^^^     ^^^^^^^^^^^^^^^^^
// name      type          lambda expression
//
// - (Int) -> Int  means: takes Int and returns Int
// - { x: Int -> x * 2 }
//     x: Int   = parameter
//     ->       = separates parameters from the body
//     x * 2    = the single expression returned

fun main() {
    // Use the lambda like a function:
    println(double(5)) // Output: 10

    // --------------------------------------------------
    // 2️⃣ Type Inference
    // --------------------------------------------------
    // Kotlin can infer parameter types from the variable type
    val triple: (Int) -> Int = { x -> x * 3 }
    println(triple(4)) // Output: 12

    // --------------------------------------------------
    // 3️⃣ Implicit 'it'
    // --------------------------------------------------
    // If the lambda has only one parameter, we can use 'it' instead of naming it
    val square: (Int) -> Int = { it * it }
    println(square(6)) // Output: 36

    // --------------------------------------------------
    // 4️⃣ Multiple Parameters
    // --------------------------------------------------
    val add: (Int, Int) -> Int = { a, b -> a + b }
    println(add(3, 7)) // Output: 10

    // --------------------------------------------------
    // 5️⃣ Passing Lambda to Higher-Order Function
    // --------------------------------------------------
    // Example with 'map': applies a lambda to each element of a list
    val numbers = listOf(1, 2, 3, 4)
    val doubledList = numbers.map { it * 2 } // each element is doubled
    println(doubledList) // Output: [2, 4, 6, 8]

    // --------------------------------------------------
    // Notes:
    // - Lambdas are often used with collection operations (map, filter, etc.)
    // - They keep code concise and functional in style.
    // --------------------------------------------------
}
