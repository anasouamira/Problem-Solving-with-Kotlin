// ===============================================================
// Closures in Kotlin: Capturing External Variables
// ===============================================================
// A closure is a lambda or anonymous function that can
// capture and use variables from its outer scope
// (variables defined outside the lambda/function).
// This allows the lambda to "remember" and modify those variables.

// ---------------------------------------------------------------
// 1️⃣ Simple example: lambda capturing an external variable
// ---------------------------------------------------------------
fun main() {
    var counter = 0 // external variable (mutable)

    // This lambda increments 'counter' every time it is called.
    val increment: () -> Unit = {
        // The lambda captures 'counter' from the outer scope.
        counter++ // modify the external variable
        println("Counter is now: $counter")
    }

    increment() // Counter is now: 1
    increment() // Counter is now: 2
    increment() // Counter is now: 3

    // -----------------------------------------------------------
    // 2️⃣ Returning a function that captures an external variable
    // -----------------------------------------------------------
    // Function that creates and returns a counter function
    fun createCounter(): () -> Int {
        var count = 0 // external variable specific to each call
        return {
            // This lambda captures 'count' and increments it
            count++
            count // last expression is returned
        }
    }

    val myCounter = createCounter()
    println(myCounter()) // Output: 1
    println(myCounter()) // Output: 2
    println(myCounter()) // Output: 3

    // Each call to createCounter gets its own independent 'count'
    val anotherCounter = createCounter()
    println(anotherCounter()) // Output: 1
    println(myCounter())      // Output: 4 (continues from previous state)

    // -----------------------------------------------------------
    // 3️⃣ Capturing read-only variables (val)
    // -----------------------------------------------------------
    val greeting = "Hello"
    val sayHello: () -> Unit = {
        // We can read 'greeting' because it's captured by the closure.
        println("$greeting from inside the closure!")
    }
    sayHello() // Output: Hello from inside the closure!
}
