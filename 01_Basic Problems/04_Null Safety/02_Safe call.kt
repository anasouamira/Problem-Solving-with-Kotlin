// ============================================================================
// Safe Call Operator (?.) in Kotlin
// ============================================================================
// - The safe call operator ?. lets you safely access a property or call
//   a method on a nullable variable without risking a NullPointerException.
// - If the variable is NOT null, the expression after ?. is evaluated.
// - If the variable IS null, the whole expression simply returns null.
// ============================================================================

fun main() {
    // ------------------------------------------------------------
    // 1️⃣ Nullable variable
    // ------------------------------------------------------------
    val name: String? = null  // Can be null or a String

    // ------------------------------------------------------------
    // 2️⃣ Using safe call to access a property
    // ------------------------------------------------------------
    val length: Int? = name?.length
    // If name is null, length becomes null instead of crashing.
    println("Length of name: $length") // Output: null

    // ------------------------------------------------------------
    // 3️⃣ Chaining safe calls
    // ------------------------------------------------------------
    // You can chain ?. multiple times to safely navigate nested objects.
    data class Address(val city: String?)
    data class User(val address: Address?)

    val user: User? = User(Address(null))
    val cityLength: Int? = user?.address?.city?.length
    // If any part (user, address, or city) is null, cityLength will be null.
    println("City name length: $cityLength") // Output: null

    // ------------------------------------------------------------
    // 4️⃣ Using safe call with functions
    // ------------------------------------------------------------
    fun greet(name: String): String = "Hello, $name!"
    val greeting: String? = name?.let { greet(it) }
    // If name is null, greet is not called and greeting is null.
    println("Greeting: $greeting") // Output: null

    // ------------------------------------------------------------
    // 5️⃣ Combine with Elvis operator for default value
    // ------------------------------------------------------------
    val safeLength: Int = name?.length ?: 0
    // ?: provides 0 if name?.length is null.
    println("Safe length (with default): $safeLength") // Output: 0
}
