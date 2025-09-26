// ============================================================================
// Inline Functions with Lambdas in Kotlin
// ============================================================================
// Normally, when you pass a lambda to a function, the compiler
// creates an object for that lambda and a call to it.
// 'inline' tells the compiler to *copy* the function body (and lambda code)
// directly at the call site. This can reduce overhead and enable
// special behaviors like non-local returns.
//
// Keywords used:
//  - inline     : Function is inlined; lambdas passed are also inlined by default.
//  - noinline   : Mark a specific lambda parameter to NOT be inlined.
//  - crossinline: Lambda cannot use non-local returns (can't break the caller's flow).
// ============================================================================

// 1️⃣ Basic Inline Function
inline fun measureTime(action: () -> Unit) {
    // Because of 'inline', the code of 'action' will be
    // placed directly where measureTime() is called.
    val start = System.currentTimeMillis()
    action() // run the passed lambda
    val end = System.currentTimeMillis()
    println("Time taken: ${end - start} ms")
}

// 2️⃣ Inline with noinline parameter
inline fun executeTwice(
    firstAction: () -> Unit,
    noinline secondAction: () -> Unit // this lambda will NOT be inlined
) {
    firstAction()
    secondAction()
}

// 3️⃣ crossinline example
inline fun runWithMessage(message: String, crossinline action: () -> Unit) {
    println("Start: $message")
    // crossinline prevents the lambda from doing a non-local return
    // (i.e., it can't exit runWithMessage's caller directly).
    val thread = Thread {
        action() // executed in another thread safely
    }
    thread.start()
    thread.join()
    println("End: $message")
}

fun main() {
    // --------------------------------------------------------------
    // Using the inline measureTime function
    // --------------------------------------------------------------
    measureTime {
        // The compiler will inline this lambda inside measureTime.
        Thread.sleep(500)
    }

    // --------------------------------------------------------------
    // Inline with 'noinline'
    // --------------------------------------------------------------
    executeTwice(
        firstAction = { println("First action executed") },
        secondAction = { println("Second action executed (noinline)") }
    )

    // --------------------------------------------------------------
    // crossinline usage
    // --------------------------------------------------------------
    runWithMessage("Running safely") {
        println("Hello from inside crossinline lambda!")
        // A direct 'return' here would normally try to return
        // from 'main', but crossinline forbids non-local return.
        // return // ❌ Not allowed because of crossinline
    }
}
