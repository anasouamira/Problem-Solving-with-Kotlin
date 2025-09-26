// ===========================================
// The implicit 'it' parameter in Kotlin Lambdas
// ===========================================
// - When a lambda has ONLY ONE parameter,
//   you don't need to name it explicitly.
// - Kotlin provides a default name: 'it'.
// - 'it' represents that single parameter.

// --------------------------------------------------
// 1️⃣ Without 'it' (explicit parameter name)
// --------------------------------------------------
val doubleExplicit: (Int) -> Int = { x: Int -> x * 2 }
// Here we named the parameter 'x'.

// --------------------------------------------------
// 2️⃣ With 'it' (implicit parameter)
// --------------------------------------------------
val doubleImplicit: (Int) -> Int = { it * 2 }
// No need to declare parameter name or type;
// Kotlin knows there's a single Int parameter from the variable type.

// --------------------------------------------------
// 3️⃣ Using 'it' with collection operations
// --------------------------------------------------
fun main() {
    println(doubleExplicit(5))  // Output: 10
    println(doubleImplicit(5))  // Output: 10

    // Example: filter a list to keep only even numbers
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers) // Output: [2, 4, 6]

    // Example: map each number to its square
    val squares = numbers.map { it * it }
    println(squares) // Output: [1, 4, 9, 16, 25, 36]

    // --------------------------------------------------
    // 4️⃣ When to avoid 'it'
    // --------------------------------------------------
    // If the lambda has more than one parameter,
    // you must name the parameters.
    val add: (Int, Int) -> Int = { a, b -> a + b } // can't use 'it' here

    // You can also name the single parameter if you prefer clarity:
    val triple: (Int) -> Int = { number -> number * 3 }
    println(triple(3)) // Output: 9
}
