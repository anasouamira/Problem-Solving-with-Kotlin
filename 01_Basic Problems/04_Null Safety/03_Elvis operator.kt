/*
C1 — Default string
C2 — Elvis with length
C3 — Elvis with function return
C4 — Assign to non-null var using Elvis
C5 — Nested Elvis / chain
*/

fun main() {
    // C1
    val s1: String? = null
    println(s1 ?: "unknown")

    // C2
    val s2: String? = null
    println(s2?.length ?: 0)

    // C3
    fun getName(): String? = null
    println(getName() ?: "Guest")

    // C4
    val input: String? = null
    val name: String = input ?: "N/A"
    println(name)

    // C5
    val a: String? = null
    val b: String? = "ok"
    println(a ?: b ?: "fallback")
}
