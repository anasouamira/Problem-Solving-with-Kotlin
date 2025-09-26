// ===========================================
// Single-Expression Functions in Kotlin
// ===========================================

// 1️⃣ Definition:
//    - A function that contains only *one* expression
//    - We can omit the curly braces { } and the explicit 'return' keyword
//    - The function body is written after an '=' sign
//    - The return type can often be inferred automatically

// --------------------------------------------------
// Example 1: A function that doubles an integer
// --------------------------------------------------

// Regular (block-body) version for comparison:
fun doubleBlock(x: Int): Int {
    return x * 2
}

// Single-expression version:
fun doubleSingle(x: Int): Int = x * 2
//  ^            ^             ^^^^^^^^^
//  |            |             |
//  |            |             -> expression to evaluate and return
//  |            -> parameter
//  -> function name & return type (explicitly declared here)

// --------------------------------------------------
// Example 2: Type inference
// --------------------------------------------------

// We can omit the return type because the compiler infers it
fun square(n: Int) = n * n
// return type is inferred as Int

// --------------------------------------------------
// Example 3: Using string templates
// --------------------------------------------------
fun greet(name: String) = "Hello, $name!"
// returns a String directly without braces or 'return'

// --------------------------------------------------
// Example 4: More complex expression (still single)
// --------------------------------------------------
fun max(a: Int, b: Int): Int = if (a > b) a else b
// single expression using if as an expression

fun main() {
    println(doubleBlock(5))   // Output: 10
    println(doubleSingle(5))  // Output: 10
    println(square(4))        // Output: 16
    println(greet("Kotlin"))  // Output: Hello, Kotlin!
    println(max(3, 7))        // Output: 7
}

// ===========================================
// Notes:
// - Use single-expression functions for concise, readable code.
// - Ideal for simple computations or one-line logic.
// - For longer logic or multiple statements, use a regular block body.
// ===========================================
