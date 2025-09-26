// ============================================================================
// Not-null assertion operator (!!) in Kotlin
// ============================================================================
// - Syntax:   nullableVariable!!
// - Purpose:  Tell the compiler: "I am SURE this value is NOT null."
// - Effect:   Converts a nullable type (e.g., String?) to a non-null type (String).
// - Danger:   If the value IS actually null at runtime, it throws a
//             KotlinNullPointerException (similar to Java's NullPointerException).
// ============================================================================

fun main() {

    // ------------------------------------------------------------
    // 1️⃣ Declaring a nullable variable
    // ------------------------------------------------------------
    val name: String? = "Anas"

    // Using !! means we promise that 'name' is NOT null
    // The result type is now a non-null String
    val upperCaseName: String = name!!.uppercase()
    println("Uppercase name: $upperCaseName") // Output: ANAS

    // ------------------------------------------------------------
    // 2️⃣ Danger if the variable is actually null
    // ------------------------------------------------------------
    val city: String? = null

    // The following line will THROW a KotlinNullPointerException
    // because city is actually null.
    // Uncommenting this will crash the program:
    // val upperCity = city!!.uppercase()
    // println(upperCity)

    // ------------------------------------------------------------
    // 3️⃣ Typical scenario: after a manual null-check
    // ------------------------------------------------------------
    val email: String? = "test@example.com"

    if (email != null) {
        // After checking email is not null, we can safely use !!
        // though in this specific case, the compiler already knows
        // inside this block that email is non-null, so !! is unnecessary.
        val safeEmail: String = email!! 
        println("Email is: $safeEmail")
    }

    // ------------------------------------------------------------
    // 4️⃣ Example inside a function
    // ------------------------------------------------------------
    fun getLength(text: String?): Int {
        // If we are absolutely certain text is not null,
        // we can use !! to get a non-null Int result.
        // If text is null, the function will throw.
        return text!!.length
    }

    val message: String? = "Hello"
    println("Message length: ${getLength(message)}") // Output: 5

    // ------------------------------------------------------------
    // 5️⃣ Better alternative
    // ------------------------------------------------------------
    // Instead of !!, prefer:
    // - Safe call with ?: for default
    // - Or requireNotNull(text, "Custom error")
    val safeCity: String = city ?: "Unknown City"
    println("Safe city: $safeCity")
}
