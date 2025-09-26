// ============================================================================
// let, also, and run – Using them for null checks and scoped operations
// ============================================================================
// All three are scope functions in Kotlin. They create a temporary scope
// to work with an object. They are especially useful when dealing with
// nullable values to avoid explicit if (x != null) checks.
// ============================================================================

fun main() {

    // ------------------------------------------------------------
    // 1️⃣ let
    // ------------------------------------------------------------
    // - Called on an object (nullable or not).
    // - Executes the lambda ONLY if the object is NOT null when using safe call ?.
    // - Inside the lambda, 'it' refers to the object by default.
    // - Returns the result of the lambda.
    // ------------------------------------------------------------

    val name: String? = "Anas"
    name?.let {
        // This block runs ONLY if name is not null.
        // 'it' refers to the non-null value of name.
        println("Name length (let): ${it.length}")
    }

    val empty: String? = null
    empty?.let {
        // This will NOT run because empty is null.
        println("This will never print")
    }

    // You can also specify a custom parameter instead of 'it':
    name?.let { nonNullName ->
        println("Uppercase name: ${nonNullName.uppercase()}")
    }

    // ------------------------------------------------------------
    // 2️⃣ also
    // ------------------------------------------------------------
    // - Similar to let but returns the ORIGINAL object, not the lambda result.
    // - Used for performing side effects like logging or debugging
    //   while keeping the value for further use.
    // ------------------------------------------------------------

    val message: String? = "Hello Kotlin"
    val processedMessage = message?.also {
        // 'it' is the message itself (non-null).
        println("Logging inside also: $it")
    }?.uppercase() // We can chain further operations.
    println("Processed: $processedMessage") // Output: HELLO KOTLIN

    // ------------------------------------------------------------
    // 3️⃣ run
    // ------------------------------------------------------------
    // - Combines let + with.
    // - Called as an extension on an object with safe call.
    // - Inside the block, 'this' refers to the object (not 'it').
    // - Returns the result of the lambda.
    // ------------------------------------------------------------

    val city: String? = "Casablanca"
    val lengthResult: Int? = city?.run {
        // 'this' refers to city.
        println("City in uppercase (run): ${this.uppercase()}")
        // The last line is the return value of run.
        this.length
    }
    println("City length: $lengthResult") // Output: City length: 10

    // ------------------------------------------------------------
    // 4️⃣ Compare returns
    // ------------------------------------------------------------
    // let   -> returns the lambda result.
    // also  -> returns the original object.
    // run   -> returns the lambda result but uses 'this' instead of 'it'.
}
