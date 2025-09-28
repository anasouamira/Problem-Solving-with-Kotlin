
fun main() {
    // ===== Exercise 3 – Describe Number (function type) =====
    val describe: (Int) -> String = { n -> if (n % 2 == 0) "Even" else "Odd" }
    fun exercise3() {
    println(describe(7)) // prints: Odd
    }
}
