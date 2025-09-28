/*
A1 — Declare & print
A2 — Assign then print length safely (manual check)
A3 — Function returns nullable
A4 — Array of nullable strings
A5 — Nullable property in a small data holder
*/

fun main() {
    // A1 — Declare & print
    val nameA1: String? = null
    println(nameA1) // prints null

    // A2 — Assign then print length safely
    val nameA2: String? = "Anna"
    if (nameA2 != null) println(nameA2.length) else println("no name")

    // A3 — Function returns nullable
    fun findUser(id: Int): String? = if (id % 2 == 0) "User$id" else null
    println(findUser(3)) // null
    println(findUser(4)) // User4

    // A4 — Array of nullable strings
    val arr: Array<String?> = arrayOf("a", null, "b")
    for (s in arr) {
        if (s != null) println(s) else println("EMPTY")
    }

    // A5 — Nullable property in a small data holder
    data class Person(val name: String?, val age: Int)
    val people = listOf(Person(null, 30), Person("Ali", 25))
    for (p in people) {
        val n = p.name ?: "Name unknown"
        println("$n, ${p.age}")
    }
}
