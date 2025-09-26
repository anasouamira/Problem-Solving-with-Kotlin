// ============================================================================
// Nullable Types in Kotlin
// ============================================================================
// - By default, all types in Kotlin are NON-nullable.
//   e.g., `val name: String = "Anas"` cannot hold null.
// - To allow a variable to hold null, append a `?` to its type:
//   e.g., `val name: String? = null`
// - Kotlin provides several safe ways to work with nullable values
//   to avoid NullPointerException (NPE).
// ============================================================================

fun main() {
    // ------------------------------------------------------------
    // 1️⃣ Declaring nullable and non-nullable variables
    // ------------------------------------------------------------
    val nonNullable: String = "Hello"      // cannot be null
    // nonNullable = null // ❌ Compile-time error

    val nullable: String? = null           // can be null or a String

    println("Non-nullable: $nonNullable")
    println("Nullable: $nullable")

    // ------------------------------------------------------------
    // 2️⃣ Safe call operator (?.)
    // ------------------------------------------------------------
    // Safely access a property or method.
    // If 'nullable' is null, the expression returns null instead of crashing.
    val lengthSafe: Int? = nullable?.length
    println("Length (safe call): $lengthSafe") // Output: null

    // ------------------------------------------------------------
    // 3️⃣ Elvis operator (?:)
    // ------------------------------------------------------------
    // Provide a default value if the left side is null.
    val lengthOrZero: Int = nullable?.length ?: 0
    println("Length or zero: $lengthOrZero") // Output: 0

    // ------------------------------------------------------------
    // 4️⃣ Not-null assertion (!!)
    // ------------------------------------------------------------
    // Forcefully treat nullable as non-null.
    // Throws NullPointerException if the value is actually null.
    // val forceLength: Int = nullable!!.length // ❌ would crash
    // println(forceLength)

    // ------------------------------------------------------------
    // 5️⃣ Safe casting with 'as?'
    // ------------------------------------------------------------
    val anyValue: Any = "Kotlin"
    val maybeString: String? = anyValue as? String // Safe cast to String?
    println("MaybeString length: ${maybeString?.length}") // Output: 6

    // ------------------------------------------------------------
    // 6️⃣ Using let with safe call
    // ------------------------------------------------------------
    // Execute a block only if the value is not null.
    nullable?.let { value ->
        println("This will not run because nullable is null")
    }

    val notNullString: String? = "I am not null"
    notNullString?.let { value ->
        println("Length of '$value' is ${value.length}")
    }
}
