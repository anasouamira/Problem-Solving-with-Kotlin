// ===========================================
// Function Types in Kotlin
// ===========================================
// A function type describes a function’s signature:
//   (parameter types) -> return type
// For example: (Int) -> String means:
//   - a function that takes ONE Int parameter
//   - and returns a String.

// --------------------------------------------------
// 1️⃣ Declaring a variable of a function type
// --------------------------------------------------

// 'converter' is a variable that can hold any function
// that takes an Int and returns a String.
val converter: (Int) -> String = { number: Int ->
    "Number is $number"
}
// Here we assign a lambda to it, matching the type.

fun main() {
    println(converter(5)) // Output: Number is 5

    // --------------------------------------------------
    // 2️⃣ Type inference with lambda
    // --------------------------------------------------
    // Kotlin infers the parameter type from the function type
    val intToString: (Int) -> String = { n -> "Value: $n" }
    println(intToString(10)) // Output: Value: 10

    // --------------------------------------------------
    // 3️⃣ Passing a regular named function
    // --------------------------------------------------
    // You can also assign a normal function to a variable
    fun describe(x: Int): String = "This is $x"
    val describeFunc: (Int) -> String = ::describe
    println(describeFunc(42)) // Output: This is 42

    // --------------------------------------------------
    // 4️⃣ Multiple parameters
    // --------------------------------------------------
    // A function type with two Ints returning Int:
    val sumFunc: (Int, Int) -> Int = { a, b -> a + b }
    println(sumFunc(3, 4)) // Output: 7

    // --------------------------------------------------
    // 5️⃣ Higher-order functions
    // --------------------------------------------------
    // A function that takes another function as a parameter
    fun operateOnInt(x: Int, op: (Int) -> String): String {
        return op(x)
    }
    println(operateOnInt(8, converter))  // Uses the 'converter' lambda
    println(operateOnInt(8) { n -> "Double is ${n * 2}" })
    // Passes a new lambda directly

    // --------------------------------------------------
    // Notes:
    // - Function types are used for variables, parameters, and return types.
    // - They are key to higher-order functions and functional programming.
    // --------------------------------------------------
}
