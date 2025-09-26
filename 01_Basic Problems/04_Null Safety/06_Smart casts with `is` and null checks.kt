// ============================================================================
// Smart Casts in Kotlin with `is` type checks and null checks
// ============================================================================
// Smart cast = The compiler automatically treats a variable as a more specific
//              type after checking its type or nullability.
// - When you check a variable with `is` (type check) or `!= null` (null check),
//   inside that scope the compiler knows its type and you can access members
//   without explicit casting.
// ============================================================================

fun main() {

    // ------------------------------------------------------------
    // 1️⃣ Smart cast with `is`
    // ------------------------------------------------------------
    fun printLength(obj: Any) {
        if (obj is String) {
            // The compiler now knows obj is String inside this block.
            // We can directly access String methods.
            println("String length: ${obj.length}")
        } else if (obj is Int) {
            // obj is treated as Int here.
            println("Int value doubled: ${obj * 2}")
        } else {
            println("Unknown type")
        }
    }

    printLength("Hello") // String branch
    printLength(42)      // Int branch
    printLength(3.14)    // Unknown type

    // ------------------------------------------------------------
    // 2️⃣ Smart cast with negation and else
    // ------------------------------------------------------------
    fun describeNumber(n: Number) {
        if (n !is Double) {
            // Here we know n is NOT a Double.
            println("Not a Double, actual value: $n")
        } else {
            // n is definitely a Double here.
            println("Double value times 2: ${n * 2}")
        }
    }
    describeNumber(10)      // Int branch
    describeNumber(5.5)     // Double branch

    // ------------------------------------------------------------
    // 3️⃣ Smart cast with null check
    // ------------------------------------------------------------
    val name: String? = "Anas"
    if (name != null) {
        // Inside this block, name is automatically treated as String (non-null).
        println("Uppercase name: ${name.uppercase()}")
    } else {
        println("Name is null")
    }

    val city: String? = null
    if (city == null) {
        println("City is missing")
    } else {
        // Smart cast: city is a non-null String here.
        println("City length: ${city.length}")
    }

    // ------------------------------------------------------------
    // 4️⃣ Using `when` with smart casts
    // ------------------------------------------------------------
    fun smartWhen(x: Any?) {
        when (x) {
            is String -> println("String in upper: ${x.uppercase()}")
            is Int -> println("Int squared: ${x * x}")
            null -> println("Value is null")
            else -> println("Some other type")
        }
    }

    smartWhen("Kotlin")
    smartWhen(7)
    smartWhen(null)

    // ------------------------------------------------------------
    // 5️⃣ Important note:
    // Smart casts work only when the compiler can guarantee that
    // the variable cannot change between the check and usage
    // (e.g., no open properties or mutable vars changed in between).
}
