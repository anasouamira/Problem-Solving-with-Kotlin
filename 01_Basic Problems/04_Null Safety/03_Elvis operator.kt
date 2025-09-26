// ============================================================================
// Elvis Operator (?:) in Kotlin
// ============================================================================
// - The Elvis operator provides a DEFAULT value if the expression
//   on the left is null.
// - Syntax:   val result = leftExpression ?: defaultValue
// - Meaning:  If leftExpression is NOT null -> use it
//             If leftExpression IS null  -> use defaultValue
// - It is called "Elvis" because it looks like an emoticon:  ?:   (like Elvis's hair style!)
// ============================================================================

fun main() {
    // ------------------------------------------------------------
    // 1️⃣ Basic usage with a nullable variable
    // ------------------------------------------------------------
    val name: String? = null

    // Use ?: to provide a fallback when name is null.
    val displayName: String = name ?: "Guest"
    println("Hello, $displayName") // Output: Hello, Guest

    // ------------------------------------------------------------
    // 2️⃣ Combine with safe call
    // ------------------------------------------------------------
    val length: Int = name?.length ?: 0
    // If name is null -> length = 0
    // If name is not null -> length = name.length
    println("Name length: $length") // Output: 0

    // ------------------------------------------------------------
    // 3️⃣ With function return values
    // ------------------------------------------------------------
    fun findUser(id: Int): String? {
        return if (id == 1) "Anas" else null
    }

    val userName: String = findUser(2) ?: "Unknown User"
    println("User: $userName") // Output: Unknown User

    // ------------------------------------------------------------
    // 4️⃣ Chaining multiple Elvis operators
    // ------------------------------------------------------------
    val fallback: String? = null
    val result: String = name ?: fallback ?: "Default"
    // Evaluates left to right:
    // If name != null -> use name
    // else if fallback != null -> use fallback
    // else -> use "Default"
    println("Result: $result") // Output: Default

    // ------------------------------------------------------------
    // 5️⃣ Using Elvis with throw or return
    // ------------------------------------------------------------
    val email: String? = null
    val validEmail: String = email ?: throw IllegalArgumentException("Email required")
    // If email is null -> immediately throw the exception
}
